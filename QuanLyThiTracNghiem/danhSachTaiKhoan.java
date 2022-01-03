package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class danhSachTaiKhoan implements iDanhSach, Serializable {
    private int soLuong;
    private ArrayList<taiKhoan> ds = new ArrayList<taiKhoan>();

    public danhSachTaiKhoan() {

    }

    public danhSachTaiKhoan(int soLuong) {
        this.soLuong = soLuong;
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap tai khoan thu " + (i + 1) + ":");
            taiKhoan a = new taiKhoan();
            a.nhap();
            ds.add(a);
        }
    }


    public ArrayList<taiKhoan> getDs() {
        return ds;
    }

    public void setDs(ArrayList<taiKhoan> ds) {
        this.ds = ds;
    }

    public taiKhoan at(int index) {
        return ds.get(index);
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public void docFile() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachTaiKhoan.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        // -------------------B2.Doc du lieu-------------------------------------

        try {
            danhSachTaiKhoan tmp = new danhSachTaiKhoan();
            tmp = (danhSachTaiKhoan) ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachTaiKhoan.txt");
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
            Logger.getLogger(danhSachTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int soLuong() {
        return ds.size();
    }

    public void nhap() {
        System.out.println("Nhap so luong tai khoan:");
        soLuong = nhap.kiemTraSo(1);
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap tai khoan thu " + (i + 1) + ":");
            taiKhoan a = new taiKhoan();
            a.nhap();
            ds.add(a);
        }
    }

    public int idNext(){

        return -1;
    }

    public boolean kiemTraKhoaChinh() {
        return false;
    }

    public boolean kiemTraKhoaChinh(taiKhoan obj) {
        for (int i = 0; i < soLuong; i++) {
            if (obj.getPk().equals(ds.get(i).getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-20s|\n", "Id", "Mat khau", "Chuc vu");
        for (var i : ds) {
            i.xuatDanhSach();
        }
        System.out.println("------------------------------------------------------");
    }

    public void xoa(int i) {
        ds.remove(i);
        soLuong = ds.size();
    }

    @Override
    public void xoa() {
        System.out.println("Nhap id muon xoa:");
        String id = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(id);
    }

    public void xoa(String id) {
        int i = timKiem(id);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(taiKhoan taiKhoan) {
        xoa(taiKhoan.getId());
    }

    @Override
    public void them() {
        System.out.println("Nhap tai khoan can them: ");
        taiKhoan a = new taiKhoan();
        a.nhap();
        them(a);
    }

    public void them(taiKhoan obj) {
        ds.add(obj);
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap id can tim:");
        String id = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(id);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds.get(index).xuat();
        }
    }

    public int timKiem(String id) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getId().equals(id)) {
                // i.xuat();
                return i;
            }
        }
        return -1;
    }

    public void timKiem(taiKhoan taiKhoan) {
        timKiem(taiKhoan.getId());
    }

    @Override
    public void sua() {
        System.out.println("Nhap id can sua:");
        String id = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(id);
    }

    public void sua(String id) {
        int index = timKiem(id);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds.get(index).sua();
        }
    }

    public void sua(taiKhoan taiKhoan) {
        sua(taiKhoan.getId());
    }

    @Override
    public void sapXep() {
        // Collections.sort(ds, new sortTaiKhoan());
    }

    public static void main(String[] args) {
        // danhSachTaiKhoan a = new danhSachTaiKhoan();
        // danhSachTaiKhoan b = new danhSachTaiKhoan();
        // a.nhap();
        // a.ghiFile();
        // a.xuat();
        // a.them();
        // a.xuat();
        // a.xoa();
        // a.xoa();
        // a.xuat();
        // a.sua();
        // a.sua();
        // a.xuat();
        // a.timKiem();
        // a.timKiem();
        // b.docFile();
        // b.xuat();
        // System.out.println("1: " + a.at(1).getId());
        // System.out.println("size: " + a.soLuong());
    }
}

class sortTaiKhoan implements Comparator<taiKhoan> {
    @Override
    public int compare(taiKhoan a, taiKhoan b) {
        return Integer.parseInt(a.getId()) - Integer.parseInt(b.getId());
    }
}
