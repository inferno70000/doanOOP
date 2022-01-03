package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class nganHangCauHoi implements iDanhSach, Serializable {
    private cauHoi_NganHang[] ds;
    private int soLuong;

    public nganHangCauHoi() {

    }

    public nganHangCauHoi(int soLuong) {
        this.soLuong = soLuong;
        ds = new cauHoi_NganHang[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau hoi thu " + (i + 1) + ":");
            ds[i] = new cauHoi_NganHang();
            ds[i].nhap();
        }
    }

    public cauHoi_NganHang[] getDs() {
        return ds;
    }

    public cauHoi_NganHang at(int index) {
        return ds[index];
    }

    @Override
    public void docFile() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\nganHangCauHoi.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(nganHangCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        // -------------------B2.Doc du lieu-------------------------------------

        try {
            nganHangCauHoi tmp = new nganHangCauHoi();
            tmp = (nganHangCauHoi) ois.readObject();
            this.ds = tmp.getDs();
            this.soLuong = tmp.soLuong();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public void ghiFile() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(".\\data\\nganHangCauHoi.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        ObjectOutputStream oos = null;
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
            Logger.getLogger(nganHangCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(nganHangCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(nganHangCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int soLuong() {
        return soLuong;
    }

    public void nhap() {
        System.out.println("Nhap so luong cau hoi:");
        soLuong = nhap.kiemTraSo(0);
        ds = new cauHoi_NganHang[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau hoi thu " + (i + 1) + ":");
            ds[i] = new cauHoi_NganHang();
            ds[i].nhap();
        }
    }

    public boolean kiemTraKhoaChinh() {

        return false;
    }

    public boolean kiemTraKhoaChinh(cauHoi_NganHang obj) {
        for (int i = 0; i < soLuong; i++) {
            if (obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-10s|%-100s|\n", "Ma cau hoi", "Ma nhom", "Noi dung");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public int idNext(){
        int max=12001;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].maCau)){
                max=Integer.parseInt(ds[i].maCau);
            }
        }
        return max+1;
    }

    @Override
    public void them() {
        cauHoi_NganHang tmp = new cauHoi_NganHang();
        tmp.nhap();
        them(tmp);
    }

    public void them(cauHoi_NganHang obj) {
        cauHoi_NganHang[] newDs = new cauHoi_NganHang[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            newDs[i] = ds[i];
        }
        newDs[soLuong] = new cauHoi_NganHang();
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
        System.out.println("Nhap ma cau hoi muon xoa:");
        String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maCauHoi);
    }

    public void xoa(String maCauHoi) {
        int i = timKiem(maCauHoi);
        if (i == -1) {
            System.out.println("Khong tim thay cau hoi!!");
            return;
        }
        xoa(i);

    }

    public void xoa(cauHoi_NganHang cauHoi) {
        xoa(cauHoi.getMaCau());
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma cau hoi can tim:");
        String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maCauHoi);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maCauHoi) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaCau().equals(maCauHoi)) {
                return i;
            }
        }
        return -1;
    }

    public void timKiem(cauHoi_NganHang cauHoi) {
        timKiem(cauHoi.getMaCau());
    }

    public nganHangCauHoi timKiemTheoMaNhom(String maNhom){
        nganHangCauHoi result=new nganHangCauHoi();
        for(int i=0;i<soLuong();i++){
            if(ds[i].getMaNhom().equals(maNhom)){
                result.them(ds[i]);
            }
        }
        return result;
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma so cau hoi can sua:");
        String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maCauHoi);

    }

    public void sua(String maCauHoi) {
        int index = timKiem(maCauHoi);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    public void sua(cauHoi_NganHang cauHoi) {
        sua(cauHoi.getMaCau());
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong; i++) {
            for (int j = 0; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMaCau()) < Integer.parseInt(ds[j].getMaCau())) {
                    var temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }

}
