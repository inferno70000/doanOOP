package QuanLyThiTracNghiem;


import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachNhomCauHoi implements iDanhSach, Serializable{
    private int soLuong;
    private ArrayList<nhomCauHoi> ds = new ArrayList<nhomCauHoi>();

    public danhSachNhomCauHoi() {

    }

    public danhSachNhomCauHoi(int soLuong) {
        this.soLuong = soLuong;
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap chuong thu " + (i + 1) + ":");
            nhomCauHoi a = new nhomCauHoi();
            a.nhap();
            ds.add(a);
        }
    }

    public ArrayList<nhomCauHoi> getDs() {
        return ds;
    }

    public void setDs(ArrayList<nhomCauHoi> ds) {
        this.ds = ds;
    }

    public nhomCauHoi at(int index) {
        return ds.get(index);
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachNhomCauHoi.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachNhomCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachNhomCauHoi tmp=new danhSachNhomCauHoi();
            tmp=(danhSachNhomCauHoi)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachNhomCauHoi.txt");
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
            Logger.getLogger(danhSachNhomCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachNhomCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachNhomCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public int soLuong() {
        return ds.size();
    }

    public void nhap() {
        System.out.println("Nhap so luong nhom cau hoi:");
        soLuong = nhap.kiemTraSo(1);
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap nhom cau hoi thu " + (i + 1) + ":");
            nhomCauHoi a = new nhomCauHoi();
            a.nhap();
            ds.add(a);
        }
    }
    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(nhomCauHoi obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds.get(i).getPk()))
                return false;
        }
        return true;
    }
    
    @Override
    public void xuat() {
        sapXep();
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-20s|%-15s|%-15s|\n", "Ma nhom cau hoi", "Ma muc do", "Ma chuong");
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
        System.out.println("Nhap ma nhom cau hoi muon xoa:");
        String maNhomCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maNhomCau);
    }

    public void xoa(String maNhomCau) {
        int i = timKiem(maNhomCau);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(nhomCauHoi nhomCauHoi) {
        xoa(nhomCauHoi.getMaNhom());
    }

    @Override
    public void them() {
        System.out.println("Nhap nhom cau hoi can them: ");
        nhomCauHoi a = new nhomCauHoi();
        a.nhap();
        them(a);
    }

    public void them(nhomCauHoi obj) {
        ds.add(obj);
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma nhom cau hoi can tim:");
        String maNhomCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maNhomCau);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds.get(index).xuat();
        }
    }



    public int timKiem(String maNhom) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaNhom().equals(maNhom)) {
                // i.xuat();
                return i;
            }
        }
        return -1;
    }

    public void timKiem(nhomCauHoi nhomCauHoi) {
        timKiem(nhomCauHoi.getMaNhom());
    }

    public danhSachNhomCauHoi timKiemTheoChuong(String maChuong){
        danhSachNhomCauHoi result=new danhSachNhomCauHoi();
        for(int i=0;i<soLuong();i++){
            if(ds.get(i).getMaChuong().equals(maChuong)){
                result.them(ds.get(i));
            }
        }
        return result;
    }

    public int timKiem(String maChuong,String maMucDo){
        for(int i=0;i<soLuong();i++){
            if(ds.get(i).getMaChuong().equals(maChuong) && ds.get(i).getMaMucDo().equals(maMucDo)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma nhom cau hoi can sua:");
        String maNhomCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maNhomCau);
    }

    public void sua(String maNhomCau) {
        int index = timKiem(maNhomCau);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds.get(index).sua();
        }
    }

    public void sua(nhomCauHoi nhomCauHoi) {
        sua(nhomCauHoi.getMaNhom());
    }

    public int idNext(){
        int max=42001;
        for(int i=0;i<ds.size();i++){
            if(max< Integer.parseInt(ds.get(i).getMaNhom())){
                max=Integer.parseInt(ds.get(i).getMaNhom());
            }
        }
        return max+1;
    }

    @Override
    public void sapXep() {
        Collections.sort(ds, new sort4());
    }
}

class sort4 implements Comparator<nhomCauHoi> { 
    @Override
    public int compare(nhomCauHoi a, nhomCauHoi b) {
        return Integer.parseInt(a.getMaNhom()) - Integer.parseInt(b.getMaNhom());
    }
}
