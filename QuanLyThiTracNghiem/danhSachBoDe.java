package QuanLyThiTracNghiem;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachBoDe implements iDanhSach, Serializable {
    private int soLuong;
    private boDe[] ds;

    public danhSachBoDe() {
        soLuong=0;
    }

    public danhSachBoDe(int soLuong, boDe[] ds) {
        this.soLuong = soLuong;
        this.ds = ds;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boDe[] getDs() {
        return this.ds;
    }

    public void setDs(boDe[] ds) {
        this.ds = ds;
    }

    public int soLuong() {
        return soLuong;
    }

    public danhSachBoDe ds(boDe[] ds) {
        setDs(ds);
        return this;
    }

    public boDe at(int index) {
        return ds[index];
    }


    public void setAt(int i,boDe obj){
        ds[i]=obj;
    }
    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachBoDe.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachBoDe.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachBoDe tmp=new danhSachBoDe();
            tmp=(danhSachBoDe)ois.readObject();
            this.ds=tmp.getDs();
            this.soLuong=tmp.soLuong();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public void ghiFile(){
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream(".\\data\\danhSachBoDe.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        ObjectOutputStream oos=null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }       
      
        try {
            oos.writeObject(this);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        try {
            // -----------------------------dong luong---------------------------
            fos.close();
        } catch (NotSerializableException ex) {
            Logger.getLogger(danhSachBoDe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachBoDe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachBoDe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(boDe obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    public void nhap() {
        System.out.println("Nhap so luong bo de:");
        int n = nhap.kiemTraSo(0);
        ds = new boDe[soLuong];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap bo de thu: " + (i + 1));
            them();
        }
    }

    public void them() {
        System.out.println("Nhap loai de ban muon tao:");
        System.out.println("---------------------------------");
        System.out.println("|   1. De theo cau truc          |");
        System.out.println("|   2. De tu tao                 |");
        System.out.println("---------------------------------");
        int luaChon = nhap.kiemTraSo(1, 2);
        boDe tmp;
        if (luaChon == 1) {
            tmp = new deTheoCauTruc();
        } else {
            tmp = new deTuTao();
        }
        tmp.nhap();
        them(tmp);
    }

    public void them(boDe obj) {
        boDe[] tmp = new boDe[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            tmp[i] = new boDe();
            tmp[i] = ds[i];
        }
        tmp[soLuong] = new boDe();
        tmp[soLuong] = obj;
        ds = tmp;
        soLuong++;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-25s|%-20s|\n", "Ma de", "Ma hoc phan", "Thoi Gian ", "So cau",
                "Ma cau truc/Ma gv tao de", " Loai ");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma de can xoa:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maDe);
    }

    public void xoa(String maDe) {
        int index = timKiem(maDe);
        if (index == -1) {
            System.out.println("Khong tim thay bo de");
        } else {
            xoa(index);
        }
    }

    public void xoa(int i) {
        soLuong--;
        for (; i < soLuong; i++) {
            ds[i] = ds[i + 1];
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma de can tim");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maDe);
        if (index == -1) {
            System.out.println("Khong tim thay bo de");
        } else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maDe) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaDe().equals(maDe)) {
                return i;
            }
        }
        return -1;
    }

    public danhSachBoDe timKiemTheoHocPhan(String maHocPhan){
        danhSachBoDe result=new danhSachBoDe();
        for(int i=0;i<soLuong();i++){
            if(ds[i].getmaHocPhan().equals(maHocPhan)){
                result.them(ds[i]);
            }
        }
        return result;
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma so bo de can sua:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maDe);
    }

    public void sua(String maDe) {
        int index = timKiem(maDe);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    public void sua(boDe boDe) {
        sua(boDe.getMaDe());
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMaDe()) > Integer.parseInt(ds[j].getMaDe())) {
                    boDe tmp = ds[j];
                    ds[j] = ds[i];
                    ds[i] = tmp;
                }
            }
        }

    }

    public int idNext(){
        int max=86821;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getMaDe())){
                max=Integer.parseInt(ds[i].getMaDe());
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        danhSachBoDe test = new danhSachBoDe();
        test.nhap();
        test.xuat();
        test.xoa();
        test.xuat();

    }
}