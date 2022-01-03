package QuanLyThiTracNghiem;

import java.io.*;

public class baiLam implements iClass, Serializable {
    private String maBailam;
    private String Mssv;
    private String maDe;
    private int hocKi;
    private String hocPhan;
    private long thoiGianLamBai;

    public baiLam() {

    }

    public baiLam(String maBailam, String maDe, int hocKi, String hocPhan, String Mssv,long thoiGianLamBai) {
        this.maBailam = maBailam;
        this.maDe = maDe;
        this.hocKi = hocKi;
        this.hocPhan = hocPhan;
        this.Mssv = Mssv;
        this.thoiGianLamBai=thoiGianLamBai;
    }

    public void setThoiGianLamBai(long thoiGianLamBai)
    {
        this.thoiGianLamBai=thoiGianLamBai;
    }

    public long getThoiGianLamBai(){
        return this.thoiGianLamBai;
    }

    public String getMssv() {
        return Mssv;
    }

    public void setMssv(String mssv) {
        this.Mssv = mssv;
    }

    public String getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(String hocPhan) {
        this.hocPhan = hocPhan;
    }

    public int getHocKi() {
        return hocKi;
    }

    public void setHocKi(int hocKi) {
        this.hocKi = hocKi;
    }

    public String getMaDe() {
        return maDe;
    }

    public void setMaDe(String maDe) {
        this.maDe = maDe;
    }

    public String getMaBailam() {
        return maBailam;
    }

    public void setMaBailam(String maBailam) {
        this.maBailam = maBailam;
    }

    public void nhap() {
        System.out.println("Nhap ma bai lam:");
        maBailam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap vao ma de:");
        maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap vao hoc ki:");
        hocKi = nhap.kiemTraSo(1, 3);
        System.out.println("Nhap vao hoc phan:");
        hocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap vao ma so sinh vien:");
        Mssv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
    }

    @Override
    public String getPk(){
        return maBailam+Mssv;
    }

    @Override
    public void xuat() {

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|%-20s|%-15s|\n", " Ma bai lam", " Ma de", " Hoc ki", " Hoc phan", " Ma so sinh vien","Thoi gian");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|%-20s|%-15s|\n", maBailam, maDe, hocKi, hocPhan, Mssv,thoiGianLamBai);
        System.out.println("----------------------------------------------------------------------------------------------------------------");

    }

    @Override
    public void xuatDanhSach() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|%-20s|%-15s|\n", maBailam, maDe, hocKi, hocPhan, Mssv,thoiGianLamBai);
    }

    public void sua() {
        do {
            System.out.println("----------------------------");
            System.out.println("|   1. Ma Bai Lam           |");
            System.out.println("|   2. Ma De                |");
            System.out.println("|   3. Hoc Ki               |");
            System.out.println("|   4. Hoc Phan             |");
            System.out.println("|   5. Ma so sinh vien      |");
            System.out.println("----------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 5));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap ma bai lam:");
                System.out.println("Luu y sua ma bai lam co the lam anh huong den tinh dung dang cua du lieu");
                if(nhap.xacNhan()){
                    maBailam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                }
                break;
            }

            case '2': {
                System.out.println("Nhap ma de moi:");
                maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '3': {
                System.out.println("Nhap ma hoc ki moi:");
                hocKi = nhap.kiemTraSo(1, 3);
                break;
            }

            case '4': {
                System.out.println("Nhap hoc phan moi:");
                hocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }
            case '5': {
                System.out.println("Nhap Mssv moi:");
                Mssv = nhap.kiemTraChuoi(nhap.soLuongKyTuMa);
                break;
            }

            default: {
                System.out.println("Nhap sai!!!");
                break;
            }
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua chuong.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }

    public String toString(){
        return maBailam+"#"+maDe+"#";
    }
}
