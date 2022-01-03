package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachCauHoiBoDe implements iDanhSach, Serializable {
    private cauHoi_BoDe[] ds;
    private int soLuong;

    public danhSachCauHoiBoDe() {

    }

    public danhSachCauHoiBoDe(int soLuong) {
        this.soLuong = soLuong;
        ds = new cauHoi_BoDe[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau hoi thu " + (i + 1) + ":");
            ds[i] = new cauHoi_BoDe();
            ds[i].nhap();
        }
    }

    public cauHoi_BoDe[] getDs() {
        return ds;
    }

    public cauHoi_BoDe at(int index) {
        return ds[index];
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachCauHoiBoDe.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachCauHoiBoDe.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachCauHoiBoDe tmp=new danhSachCauHoiBoDe();
            tmp=(danhSachCauHoiBoDe)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachCauHoiBoDe.txt");
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
            Logger.getLogger(danhSachCauHoiBoDe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachCauHoiBoDe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachCauHoiBoDe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public int soLuong() {
        return soLuong;
    }

    public void nhap() {
        System.out.println("Nhap so luong cau hoi:");
        soLuong = nhap.kiemTraSo(1);
        ds = new cauHoi_BoDe[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap cau hoi thu " + (i + 1) + ":");
            ds[i] = new cauHoi_BoDe();
            ds[i].nhap();
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(cauHoi_BoDe obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-90s|\n", "Ma bo de", "Ma cau", "Noi dung");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void them() {
        cauHoi_BoDe tmp = new cauHoi_BoDe();
        tmp.nhap();
        them(tmp);
    }

    public void them(cauHoi_BoDe obj) {
        cauHoi_BoDe[] newDs = new cauHoi_BoDe[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            newDs[i] = ds[i];
        }
        newDs[soLuong] = new cauHoi_BoDe();
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
        System.out.println("Nhap ma bo de muon xoa:");
        String maBoDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap so thu tu muon xoa:");
        String soThuTu = String.valueOf(nhap.kiemTraSo(1));
        xoa(maBoDe, soThuTu);
    }

    public void xoa(String maBoDe, String soThuTu) {
        int i = timKiem(maBoDe, soThuTu);
        if (i == -1) {
            System.out.println("Khong tim thay");
            return;
        }
        xoa(i);
    }

    public void xoa(String maBoDe) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaBoDe().equals(maBoDe)) {
                xoa(i);
                i--;
            }
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma bo de muon tim:");
        String maBoDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap so thu tu muon tim:");
        String soThuTu = String.valueOf(nhap.kiemTraSo(1));
        int index = timKiem(maBoDe, soThuTu);
        if (index == -1)
            System.out.println("Khong tim thay");
        else {
            ds[index].xuat();
        }
    }

    public danhSachCauHoiBoDe timKiem(String maBoDe) {
        danhSachCauHoiBoDe tmp= new danhSachCauHoiBoDe();
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaBoDe().equals(maBoDe)) {
                tmp.them(ds[i]);
            }
        }
        return tmp;
    }

    public int timKiem(String maBoDe, String maCauHoi) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaBoDe().equals(maBoDe) && ds[i].getMaCau().equals(maCauHoi)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sua() {
        // System.out.println("Nhap ma bo de muon sua:");
        // String maBoDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        // System.out.println("Nhap m sua:");
        // String maCauHoi = String.valueOf(nhap.kiemTraSo(1));
        // sua(maBoDe, maCauHoi);

    }

    public void sua(String maBoDe, String soThuTu) {
        // int index = timKiem(maBoDe, soThuTu);
        // if (index == -1)
        //     System.out.println("Khong tim thay!!!");
        // else {
        //     ds[index].sua();
        // }
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong; i++) {
            for (int j = 0; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getMaBoDe()) < Integer.parseInt(ds[j].getMaBoDe())) {
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
        danhSachBoDe a = new danhSachBoDe();
        a.nhap();
        a.xuat();
    }
}
