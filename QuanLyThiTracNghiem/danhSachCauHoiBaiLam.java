package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachCauHoiBaiLam implements iDanhSach, Serializable {
    private cauHoi_BaiLam[] ds;
    private int soLuong;

    public danhSachCauHoiBaiLam() {

    }

    public danhSachCauHoiBaiLam(int soLuong) {
        this.soLuong = soLuong;
        ds = new cauHoi_BaiLam[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau hoi thu " + (i + 1) + ":");
            ds[i] = new cauHoi_BaiLam();
            ds[i].nhap();
        }
    }

    public cauHoi_BaiLam[] getDs() {
        return ds;
    }

    public cauHoi_BaiLam at(int index) {
        return ds[index];
    }

    @Override
    public int soLuong() {
        return soLuong;
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachCauHoiBaiLam.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachCauHoiBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachCauHoiBaiLam tmp=new danhSachCauHoiBaiLam();
            tmp=(danhSachCauHoiBaiLam)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachCauHoiBaiLam.txt");
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
            Logger.getLogger(danhSachCauHoiBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachCauHoiBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachCauHoiBaiLam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(cauHoi_BaiLam obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    public void nhap() {
        System.out.println("Nhap so luong cau hoi:");
        soLuong = nhap.kiemTraSo(1);
        ds = new cauHoi_BaiLam[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau hoi thu " + (i + 1) + ":");
            ds[i] = new cauHoi_BaiLam();
            ds[i].nhap();
        }
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-18s|%-80s|\n", "Ma bai lam", "Ma cau", "Dap an duoc chon", "Noi dung");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void them() {
        cauHoi_BaiLam tmp = new cauHoi_BaiLam();
        tmp.nhap();
        them(tmp);
    }

    public void them(cauHoi_BaiLam obj) {
        cauHoi_BaiLam[] newDs = new cauHoi_BaiLam[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            newDs[i] = ds[i];
        }
        newDs[soLuong] = new cauHoi_BaiLam();
        newDs[soLuong] = obj;
        ds = newDs;
        soLuong++;
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
        String maBaiLam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma cau hoi muon xoa:");
        String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maBaiLam, maCauHoi);
    }

    public void xoa(String maBaiLam, String maCauHoi) {
        int i = timKiem(maBaiLam, maCauHoi);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(String maBaiLam) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaBaiLam().equals(maBaiLam)) {
                xoa(i);
                i--;
            }
        }
    }

    public void xoa(cauHoi_BaiLam cauHoi) {
        xoa(cauHoi.getMaBaiLam(), cauHoi.getMaCau());
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma bai lam can tim:");
        String maBaiLam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma cau hoi can tim:");
        String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maBaiLam, maCauHoi);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maBaiLam, String maCauHoi) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaCau().equals(maCauHoi) && ds[i].getMaBaiLam().equals(maBaiLam)) {
                return i;
            }
        }
        return -1;
    }

    public void timKiem(String maBaiLam) {
        System.out.println("----------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-18s|\n", "Ma bai lam", "Ma cau", "Dap an duoc chon");
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaBaiLam().equals(maBaiLam)) {
                ds[i].xuatDanhSach();
            }
        }
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public void sua() {
        System.out.println("Nhap ma bai lam muon sua:");
        String maBaiLam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma so cau hoi can sua:");
        String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maBaiLam, maCauHoi);
    }

    public void sua(String maBaiLam, String maCauHoi) {
        int index = timKiem(maBaiLam, maCauHoi);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong; i++) {
            for (int j = 0; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMaBaiLam()) < Integer.parseInt(ds[j].getMaBaiLam())) {
                    var temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }

    public int idNext(){

        return -1;
    }

    public static void main(String[] args) {
        danhSachCauHoiBaiLam a = new danhSachCauHoiBaiLam();
        a.nhap();
        a.xuat();
    }
}
