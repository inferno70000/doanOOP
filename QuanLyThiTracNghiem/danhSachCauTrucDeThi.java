package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachCauTrucDeThi implements iDanhSach, Serializable {
    private cauTrucDeThi[] ds;
    private int soLuong;

    public danhSachCauTrucDeThi() {

    }

    public danhSachCauTrucDeThi(int soLuong) {
        this.soLuong = soLuong;
        ds = new cauTrucDeThi[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau truc de thi thu " + (i + 1) + ":");
            ds[i] = new cauTrucDeThi();
            ds[i].nhap();
        }
    }

    public void setDs(cauTrucDeThi[] ds) {
        this.ds = ds;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public cauTrucDeThi[] getDs() {
        return ds;
    }

    public cauTrucDeThi at(int index) {
        return ds[index];
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachCauTrucDeThi.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachCauTrucDeThi tmp=new danhSachCauTrucDeThi();
            tmp=(danhSachCauTrucDeThi)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachCauTrucDeThi.txt");
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
            Logger.getLogger(danhSachCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public int soLuong() {
        return soLuong;
    }

    public void nhap() {
        System.out.println("Nhap so luong cau truc de thi:");
        soLuong = nhap.kiemTraSo(1);
        ds = new cauTrucDeThi[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau truc de thi thu " + (i + 1) + ":");
            ds[i] = new cauTrucDeThi();
            ds[i].nhap();
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(cauTrucDeThi obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|%-15s|\n", "Ma cau truc de thi", "Thoi gian thi", "Hoc ki", "Ma hoc phan","So cau");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    @Override
    public void them() {
        System.out.println("Nhap cau truc de thi can them:");
        cauTrucDeThi temp = new cauTrucDeThi();
        temp.nhap();
        them(temp);
    }

    public void them(cauTrucDeThi obj) {
        cauTrucDeThi[] newDs = new cauTrucDeThi[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            newDs[i] = ds[i];
        }
        newDs[soLuong] = new cauTrucDeThi();
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
        System.out.println("Nhap ma cau truc de thi muon xoa:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maDe);
    }

    public void xoa(String maDe) {
        int i = timKiem(maDe);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(cauTrucDeThi cauTrucDeThi) {
        xoa(cauTrucDeThi.getMaCauTrucDeThi());
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap cau truc de thi can tim:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maDe);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maCauTrucDeThi) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaCauTrucDeThi().equals(maCauTrucDeThi)) {
                // ds[i].xuat();
                return i;
            }
        }
        return -1;
    }

    public void timKiem(cauTrucDeThi cauTrucDeThi) {
        timKiem(cauTrucDeThi.getMaCauTrucDeThi());
    }

    public danhSachCauTrucDeThi timKiemTheoHocPhan(String maHocPhan){
        danhSachCauTrucDeThi result=new danhSachCauTrucDeThi();
        for(int i=0;i<soLuong();i++){
            if(ds[i].getMaHocPhan().equals(maHocPhan)){
                result.them(ds[i]);
            }
        }
        return result;
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma so cau truc de thi can sua:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maDe);
    }

    public void sua(String maCauTrucDeThi) {
        int index = timKiem(maCauTrucDeThi);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    public void sua(cauTrucDeThi cauTrucDeThi) {
        sua(cauTrucDeThi.getMaCauTrucDeThi());
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong; i++) {
            for (int j = 0; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMaCauTrucDeThi()) < Integer.parseInt(ds[j].getMaCauTrucDeThi())) {
                    var temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }

    public int idNext(){
        int max=60521;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getMaCauTrucDeThi())){
                max=Integer.parseInt(ds[i].getMaCauTrucDeThi());
            }
        }
        return max+1;
    }
}
