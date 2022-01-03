package QuanLyThiTracNghiem;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachLuaChon implements iDanhSach, Serializable {
    private int soLuong;
    private ArrayList<luaChon> ds = new ArrayList<luaChon>();

    public danhSachLuaChon() {

    }

    public danhSachLuaChon(int soLuong) {
        this.soLuong = soLuong;
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap lua chon thu " + (i + 1) + ":");
            luaChon a = new luaChon();
            a.nhap();
            ds.add(a);
        }
    }

    public ArrayList<luaChon> getDs() {
        return ds;
    }

    public void setDs(ArrayList<luaChon> ds) {
        this.ds = ds;
    }

    public luaChon at(int index) {
        return ds.get(index);
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachLuaChon.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachLuaChon.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachLuaChon tmp=new danhSachLuaChon();
            tmp=(danhSachLuaChon)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachLuaChon.txt");
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
            Logger.getLogger(danhSachLuaChon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachLuaChon.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachLuaChon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public int soLuong() {
        return ds.size();
    }

    public void nhap() {
        System.out.println("Nhap so luong lua chon:");
        soLuong = nhap.kiemTraSo(1);
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap lua chon thu " + (i + 1) + ":");
            luaChon a = new luaChon();
            a.nhap();
            ds.add(a);
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(luaChon obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds.get(i).getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-90s|\n", "Ma lua chon", "Ma cau", "Dap an", "Noi dung");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        for (var i : ds) {
            i.xuatDanhSach();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void xoa(int i) {
        ds.remove(i);
        soLuong = ds.size();
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma cau hoi can xoa:");
        String maCauHoi=nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma lua chon can xoa:");
        char maLuaChon = nhap.kiemTraLuaChon();
        xoa(maCauHoi,maLuaChon);
    }

    public void xoa(String maCauHoi,char maLuaChon) {
        int i = timKiem(maCauHoi,maLuaChon);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(luaChon luaChon) {
        xoa(luaChon.getMaCau(),luaChon.getMaLuaChon());
    }

    @Override
    public void them() {
        System.out.println("Nhap lua chon can them: ");
        luaChon a = new luaChon();
        a.nhap();
        them(a);
    }

    public void them(luaChon obj) {
        ds.add(obj);
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma cau hoi can tim:");
        String maCauHoi=nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma lua chon can tim:");
        char maLuaChon = nhap.kiemTraLuaChon();
        int index = timKiem(maCauHoi,maLuaChon);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds.get(index).xuat();
        }
    }

    public int timKiem(String maCauHoi,char maLuaChon) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaLuaChon() == maLuaChon && ds.get(i).getMaCau().equals(maCauHoi) ) {
                // i.xuat();
                return i;
            }
        }
        return -1;
    }

    // public void timKiem(String maCauHoi){
    //     System.out.println("-------------------------------------------------------------------------------------------");
    //     System.out.printf("|%-15s|%-15s|%-70s|\n","Ma cau", "Ma lua chon",  "Noi dung");
    //     for(int i=0;i<ds.size();i++){
    //         if(ds.get(i).getMaCau().equals(maCauHoi)){
    //             ds.get(i).xuatLuaChon();
    //         }
    //     }
    //     System.out.println("-------------------------------------------------------------------------------------------");
    // }
    public danhSachLuaChon timKiemTheoCauHoi(String maCauHoi){
        danhSachLuaChon result=new danhSachLuaChon();
        for(int i=0;i<ds.size();i++){
            if(ds.get(i).getMaCau().equals(maCauHoi)){
                result.them(ds.get(i));
            }
        }
        return result;
    }

    public void xuatLuaChon(){
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-80s|\n","Ma cau", "Ma lua chon",  "Noi dung");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<ds.size();i++){
                ds.get(i).xuatLuaChon();
            
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
    public void timKiem(luaChon luaChon) {
        timKiem(luaChon.getMaCau(),luaChon.getMaLuaChon());
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma cau hoi can sua:");
        String maCauHoi=nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma lua chon can sua:");
        char maLuaChon = nhap.kiemTraLuaChon();
        sua(maCauHoi,maLuaChon);
    }

    public void sua(String maCauHoi, char maLuaChon) {
        int index = timKiem(maCauHoi,maLuaChon);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds.get(index).sua();
        }
    }

    public void sua(luaChon luaChon) {
        sua(luaChon.getMaCau() ,luaChon.getMaLuaChon());
    }

    public int idNext(){
        return -1;
    }

    @Override
    public void sapXep() {
        Collections.sort(ds, new sort1());
    }

}


class sort1 implements Comparator<luaChon> {
    @Override
    public int compare(luaChon a, luaChon b) {
        return Integer.parseInt(a.getMaCau()) - Integer.parseInt(b.getMaCau());
    }
}