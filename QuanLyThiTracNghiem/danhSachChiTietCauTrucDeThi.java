package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachChiTietCauTrucDeThi implements iDanhSach, Serializable {
    private chiTietCauTrucDeThi[] ds;
    private int soLuong;

    public danhSachChiTietCauTrucDeThi() {

    }

    public danhSachChiTietCauTrucDeThi(int soLuong) {
        this.soLuong = soLuong;
        ds = new chiTietCauTrucDeThi[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap chi tiet cau truc de thi thu " + (i + 1) + ":");
            ds[i] = new chiTietCauTrucDeThi();
            ds[i].nhap();
        }
    }

    public void setDs(chiTietCauTrucDeThi[] ds) {
        this.ds = ds;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public chiTietCauTrucDeThi[] getDs() {
        return ds;
    }

    public chiTietCauTrucDeThi at(int index) {
        return ds[index];
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachChiTietCauTrucDeThi.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachChiTietCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachChiTietCauTrucDeThi tmp=new danhSachChiTietCauTrucDeThi();
            tmp=(danhSachChiTietCauTrucDeThi)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachChiTietCauTrucDeThi.txt");
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
            Logger.getLogger(danhSachChiTietCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachChiTietCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachChiTietCauTrucDeThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public int soLuong() {
        return soLuong;
    }

    public void nhap() {
        System.out.println("Nhap so luong chi tiet cau truc de thi:");
        soLuong = nhap.kiemTraSo(1);
        ds = new chiTietCauTrucDeThi[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap chi tiet cau truc de thi thu " + (i + 1) + ":");
            ds[i] = new chiTietCauTrucDeThi();
            ds[i].nhap();
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(chiTietCauTrucDeThi obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|\n", "Ma cau truc de thi", "Ma chuong", "Ma muc do", "So cau");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    @Override
    public void them() {
        System.out.println("Nhap chi tiet cau truc de thi can them:");
        chiTietCauTrucDeThi temp = new chiTietCauTrucDeThi();
        temp.nhap();
        them(temp);
    }

    public void them(chiTietCauTrucDeThi obj) {
        chiTietCauTrucDeThi[] newDs = new chiTietCauTrucDeThi[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            newDs[i] = ds[i];
        }
        newDs[soLuong] = new chiTietCauTrucDeThi();
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
        System.out.println("Xoa cau chi tiet cau truc de thi:");
        System.out.println("Nhap ma cau truc de thi:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma chuong:");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maDe, maChuong);
    }

    public void xoa(String maDe, String maChuong) {
        int i = timKiem(maDe, maChuong);
        if (i == -1) {
            System.out.println("Khong tim thay!!!");
            return;
        }
        xoa(i);
    }

    public void xoa(String maDe){
        for(int i=0;i<soLuong;i++){
            if(ds[i].getMaDe().equals(maDe) ){
                xoa(i);
                i--;
            }
        }
    }

    public void xoa(chiTietCauTrucDeThi chiTietDeThi) {
        xoa(chiTietDeThi.getMaDe(), chiTietDeThi.getMaChuong());
    }

    @Override
    public void timKiem() {
        System.out.println("Tim kiem chi tiet cau truc de thi:");
        System.out.println("Nhap ma cau truc de thi:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma chuong:");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maDe, maChuong);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maDe, String maChuong) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaDe().equals(maDe) && ds[i].getMaChuong().equals(maChuong)) {
                // ds[i].xuat();
                return i;
            }
        }
        return -1;
    }

    public int timKiem(String maDe, String maChuong,String maMucDo) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaDe().equals(maDe) && ds[i].getMaChuong().equals(maChuong) && ds[i].getMaMucDo().equals(maMucDo)) {
                // ds[i].xuat();
                return i;
            }
        }
        return -1;
    }

    public void timKiem(chiTietCauTrucDeThi chiTietDeThi) {
        timKiem(chiTietDeThi.getMaDe(), chiTietDeThi.getMaChuong());
    }

    public danhSachChiTietCauTrucDeThi timKiemMaCauTrucDe(String maCauTrucDe){
        danhSachChiTietCauTrucDeThi result=new danhSachChiTietCauTrucDeThi();
        for(int i=0;i<soLuong;i++){
            if(ds[i].getMaDe().equals(maCauTrucDe)){
                result.them(ds[i]);
            }
        }
        return result;
    }

    @Override
    public void sua() {
        System.out.println("Sua chi tiet cau truc de thi:");
        System.out.println("Nhap ma cau truc de thi:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma chuong:");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maDe, maChuong);
    }

    public void sua(String maDe, String maChuong) {
        int index = timKiem(maDe, maChuong);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    public void sua(chiTietCauTrucDeThi chiTietDeThi) {
        sua(chiTietDeThi.getMaDe(), chiTietDeThi.getMaChuong());
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong; i++) {
            for (int j = 0; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMaDe()) < Integer.parseInt(ds[j].getMaDe())) {
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
}
