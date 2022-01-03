package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachBaiLam implements iDanhSach, Serializable {
    private int soLuong;
    protected baiLam[] ds;

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public baiLam[] getDs() {
        return this.ds;
    }

    public void setDs(baiLam[] ds) {
        this.ds = ds;
    }

    public danhSachBaiLam() {
    }

    public baiLam at(int i) {
        return ds[i];
    }


    // public Boolean kiemTraKhoaChinh(baiLam obj){
    //     for(int i=0;i<soLuong;i++){
    //         if(ds[i].)
    //     }
    // }

    public danhSachBaiLam(int soLuong) {
        this.soLuong = soLuong;
        ds = new baiLam[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("bai lam thu " + (i + 1) + ":");
            ds[i] = new baiLam();
            ds[i].nhap();
        }

    }
    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachBaiLam.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachBaiLam tmp=new danhSachBaiLam();
            tmp=(danhSachBaiLam)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachBaiLam.txt");
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
            Logger.getLogger(danhSachBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void nhap() {
        System.out.println("Nhap so luong bai lam: ");
        soLuong = nhap.kiemTraSo(1);
        ds = new baiLam[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap bai lam thu: " + (i + 1) + ":");
            ds[i] = new baiLam();
            ds[i].nhap();
        }

    }

    @Override
    public void them() {
        System.out.println("Nhap bai lam can them:");
        baiLam temp = new baiLam();
        temp.nhap();
        them(temp);
    }

    public void them(baiLam obj) {
        if(!kiemTraKhoaChinh(obj)){
            System.out.println("Ma bai lam da ton tai.\nThem bai lam that bai");
            return;
        }
        baiLam[] newDs = new baiLam[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            newDs[i] = ds[i];
        }
        newDs[soLuong] = new baiLam();
        newDs[soLuong] = obj;
        ds = newDs;
        soLuong++;
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma bai lam can tim:");
        String maBailam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maBailam);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maBailam) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaBailam().equals(maBailam)) {
                // ds[i].xuat();
                return i;
            }
        }
        return -1;
    }

    danhSachBaiLam timKiemTheoSinhVien(String maSv){
        danhSachBaiLam result=new danhSachBaiLam();
        for(int i=0;i<soLuong;i++){
            if(ds[i].getMssv().equals(maSv))
                result.them(ds[i]);
        }
        return result;
    }

    public int timKiem(String maSv,String maDe){
        for(int i=0;i<soLuong();i++){
            if(ds[i].getMaDe().equals(maDe) && ds[i].getMssv().equals(maSv)){
                return i;
            }
        }
        return -1;
    }

    public void timKiem(baiLam baiLam) {
        timKiem(baiLam.getMaBailam());
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|%-20s|%-15s|\n", " Ma bai lam", " Ma de", " Hoc ki", " Hoc phan", " Ma so sinh vien","Thoi gian");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public int soLuong() {
        return soLuong;
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong; i++) {
            for (int j = 0; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMaBailam()) < Integer.parseInt(ds[j].getMaBailam())) {
                    var temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }


    public void xoa(int i) {
        soLuong--;
        for (; i < soLuong; i++) {
            ds[i] = ds[i + 1];
        }
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma bai lam muon xoa:");
        String maBailam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maBailam);
    }

    public void xoa(String maBailam) {
        int i = timKiem(maBailam);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(baiLam baiLam) {
        xoa(baiLam.getMaBailam());
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma bai lam can sua:");
        String maBailam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maBailam);
    }

    public void sua(String maBailam) {
        int index = timKiem(maBailam);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    public void sua(baiLam baiLam) {
        sua(baiLam.getMaBailam());

    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(baiLam obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
            {
                return false;
            }
        }
        return true;
    }

    public int idNext(){
        int max=78324;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getMaBailam())){
                max=Integer.parseInt(ds[i].getMaBailam());
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        danhSachBaiLam a=new danhSachBaiLam();
        a.nhap();
        a.xuat();
    }
}