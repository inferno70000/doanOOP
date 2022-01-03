package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class danhSachMucDo implements iDanhSach, Serializable {
    private int soLuong;
    private ArrayList<mucDo> ds = new ArrayList<mucDo>();

    public danhSachMucDo() {

    }

    public danhSachMucDo(int soLuong) {
        this.soLuong = soLuong;
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap chuong thu " + (i + 1) + ":");
            mucDo a = new mucDo();
            a.nhap();
            ds.add(a);
        }
    }

    public ArrayList<mucDo> getDs() {
        return ds;
    }

    public void setDs(ArrayList<mucDo> ds) {
        this.ds = ds;
    }

    public mucDo at(int index) {
        return ds.get(index);
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachMucDo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachMucDo.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachMucDo tmp=new danhSachMucDo();
            tmp=(danhSachMucDo)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachMucDo.txt");
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
            Logger.getLogger(danhSachMucDo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachMucDo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachMucDo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public int soLuong() {
        return ds.size();
    }

    public void nhap() {
        System.out.println("Nhap so luong muc do:");
        soLuong = nhap.kiemTraSo(1);
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap muc do thu " + (i + 1) + ":");
            mucDo a = new mucDo();
            a.nhap();
            ds.add(a);
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(mucDo obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds.get(i).getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("------------------------------------------------");
        System.out.printf("|%-15s|%-30s|\n", "Ma muc do", "Ten muc do");
        for (var i : ds) {
            i.xuatDanhSach();
        }
        System.out.println("------------------------------------------------");
    }
        
    public void xoa(int i) {
        ds.remove(i);
        soLuong = ds.size();
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma muc do muon xoa:");
        String maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maMucDo);
    }

    public void xoa(String maMucDo) {
        int i = timKiem(maMucDo);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(mucDo mucDo) {
        xoa(mucDo.getMaMucDo());
    }

    @Override
    public void them() {
        System.out.println("Nhap muc do can them: ");
        mucDo a = new mucDo();
        a.nhap();
        them(a);
    }

    public void them(mucDo obj) {
        ds.add(obj);
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma muc do can tim:");
        String maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maMucDo);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds.get(index).xuat();
        }
    }

    public int timKiem(String maMucDo) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaMucDo().equals(maMucDo)) {
                // i.xuat();
                return i;
            }
        }
        return -1;
    }

    public void timKiem(mucDo mucDo) {
        timKiem(mucDo.getMaMucDo());
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma muc do can sua:");
        String maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maMucDo);
    }

    public void sua(String maMucDo) {
        int index = timKiem(maMucDo);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds.get(index).sua();
        }
    }

    public void sua(mucDo mucDo) {
        sua(mucDo.getMaMucDo());
    }

    public int idNext(){
        int max=0;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds.get(i).getMaMucDo())){
                max=Integer.parseInt(ds.get(i).getMaMucDo());
            }
        }
        return max+1;
    }

    @Override
    public void sapXep() {
        Collections.sort(ds, new sort3());
    }
}

class sort3 implements Comparator<mucDo> {
    @Override
    public int compare(mucDo a, mucDo b) {
        return Integer.parseInt(a.getMaMucDo()) - Integer.parseInt(b.getMaMucDo());
    }
}