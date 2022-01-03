package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachSinhVien implements iDanhSach, Serializable {
    private int soLuong;
    private sinhVien[] ds;

    public danhSachSinhVien() {
    }

    public danhSachSinhVien(int soLuong, sinhVien[] ds) {
        this.soLuong = soLuong;
        this.ds = ds;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public sinhVien[] getDs() {
        return this.ds;
    }

    public void setDs(sinhVien[] ds) {
        this.ds = ds;
    }

    public int soLuong() {
        return soLuong;
    }

    public sinhVien at(int index) {
        return ds[index];
    }

    public void nhap() {
        System.out.println("Nhap so luong sinh vien:");
        int n = nhap.kiemTraSo(0);
        ds = new sinhVien[soLuong];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu: " + (i + 1));
            them();
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(sinhVien obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    public void them() {
        sinhVien tmp = new sinhVien();
        tmp.nhap();
        them(tmp);
    }

    public void them(sinhVien obj) {
        sinhVien[] tmp = new sinhVien[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            tmp[i] = new sinhVien();
            tmp[i] = ds[i];
        }
        tmp[soLuong] = new sinhVien();
        tmp[soLuong] = obj;
        ds = tmp;
        soLuong++;
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachSinhVien.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachSinhVien tmp=new danhSachSinhVien();
            tmp=(danhSachSinhVien)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachSinhVien.txt");
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
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-15s|%-15s|%-25s|%-20s|\n", "Ma sinh vien", "Ten", "Dia chi ", "Ngay sinh",
                "So dien thoai", "Gioi tinh ");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");
    }

    public int idNext(){
        int max=10007;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getMSSV())){
                max=Integer.parseInt(ds[i].getMSSV());
            }
        }
        return max+1;
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma sinh vien can xoa:");
        String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maSv);
    }

    public void xoa(String maSv) {
        int index = timKiem(maSv);
        if (index == -1) {
            System.out.println("Khong tim thay sinh vien.");
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
        System.out.println("Nhap ma sinh vien can tim:");
        String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maSv);
        if (index == -1) {
            System.out.println("Khong tim thay sinh vien.");
        } else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maSv) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMSSV().equals(maSv)) {
                return i;
            }
        }
        return -1;
    }

    public void timTheoTen(){
        String ten;
        System.out.println("Nhap ten ban can tim: ");
        ten=nhap.kiemTraChuoi();
        danhSachSinhVien temp = timTheoTen(ten);
        if (temp.soLuong() == 0) {
            System.out.println("Khong tim thay sinh vien phu hop.");
            return;
        }
        temp.xuat();
    }

    public danhSachSinhVien timTheoTen(String ten){
        danhSachSinhVien result=new danhSachSinhVien();
        String regex=".*("+ten.toLowerCase().trim()+")$";
        for(int i=0;i<soLuong();i++){
            if(ds[i].getHoTen().toLowerCase().trim().matches(regex)==true){

                result.them(ds[i]);
            }
        }
        return result;
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma so sinh vien can sua:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maDe);
    }

    public void sua(String maSV) {
        int index = timKiem(maSV);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    public void sua(sinhVien sinhVien) {
        sua(sinhVien.getMSSV());
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMSSV()) > Integer.parseInt(ds[j].getMSSV())) {
                    sinhVien tmp = ds[j];
                    ds[j] = ds[i];
                    ds[i] = tmp;
                }
            }
        }

    }

    public static void main(String[] args) {
        // danhSachSinhVien a = new danhSachSinhVien(), b = new danhSachSinhVien();
        // a.nhap();
        // a.ghiFile();
        // b.docFile();
        // b.xuat();
    }
}
