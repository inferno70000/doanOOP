package QuanLyThiTracNghiem;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachChuong implements iDanhSach, Serializable {
    private int soLuong;
    private ArrayList<chuong> ds = new ArrayList<chuong>();

    public danhSachChuong() {

    }

    public danhSachChuong(int soLuong) {
        this.soLuong = soLuong;
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap chuong thu " + (i + 1) + ":");
            chuong a = new chuong();
            a.nhap();
            ds.add(a);
        }
    }

    public ArrayList<chuong> getDs() {
        return ds;
    }

    public void setDs(ArrayList<chuong> ds) {
        this.ds = ds;
    }

    public chuong at(int index) {
        return ds.get(index);
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachChuong.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachChuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachChuong tmp=new danhSachChuong();
            tmp=(danhSachChuong)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachChuong.txt");
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
            Logger.getLogger(danhSachChuong.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachChuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachChuong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public int soLuong() {
        return ds.size();
    }

    public void nhap() {
        System.out.println("Nhap so luong chuong:");
        soLuong = nhap.kiemTraSo(1);
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap chuong thu " + (i + 1) + ":");
            chuong a = new chuong();
            a.nhap();
            ds.add(a);
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(chuong obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds.get(i).getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-30s|\n", "Ma chuong", "Ten chuong", "Ma hoc phan", "Noi dung");
        for (var i : ds) {
            i.xuatDanhSach();
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    public void xoa(int i) {
        ds.remove(i);
        soLuong = ds.size();
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma chuong muon xoa:");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maChuong);
    }

    public void xoa(String maChuong) {
        int i = timKiem(maChuong);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(chuong chuong) {
        xoa(chuong.getMaChuong());
    }

    @Override
    public void them() {
        System.out.println("Nhap chuong can them: ");
        chuong a = new chuong();
        a.nhap();
        them(a);
    }

    public void them(chuong obj) {
        ds.add(obj);
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma chuong can tim:");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maChuong);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds.get(index).xuat();
        }
    }

    public danhSachChuong timKiemTheoHocPhan(String maHocPhan){
        danhSachChuong result=new danhSachChuong();
        for(int i=0;i<soLuong();i++){
            if(ds.get(i).getMaHocPhan().equals(maHocPhan)){
                result.them(ds.get(i));
            }
        }
        return result;
    }

    public int timKiem(String maChuong) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaChuong().equals(maChuong)) {
                // i.xuat();
                return i;
            }
        }
        return -1;
    }

    public void timKiem(chuong chuong) {
        timKiem(chuong.getMaChuong());
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma chuong can sua:");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maChuong);
    }

    public void sua(String maChuong) {
        int index = timKiem(maChuong);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds.get(index).sua();
        }
    }

    public void sua(chuong chuong) {
        sua(chuong.getMaChuong());
    }

    @Override
    public void sapXep() {
        Collections.sort(ds, new sort2());
    }

    public int idNext(){
        int max=33001;
        for(int i=0;i<ds.size();i++){
            if(max< Integer.parseInt(ds.get(i).getMaChuong())){
                max=Integer.parseInt(ds.get(i).getMaChuong());
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        danhSachChuong a = new danhSachChuong();
        a.nhap();
        a.xuat();
    }
}

class sort2 implements Comparator<chuong> {
    @Override
    public int compare(chuong a, chuong b) {
        return Integer.parseInt(a.getMaChuong()) - Integer.parseInt(b.getMaChuong());
    }
}
