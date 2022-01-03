package QuanLyThiTracNghiem;

import java.io.*;

public class boDe implements iClass, Serializable {
    protected String maDe;
    protected String maHocPhan;
    protected int thoiGian; // phut
    protected int soCau;
    protected String type;
    public boDe() {

    }

    public boDe(String maDe, String maHocPhan, int thoiGian, int soCau) {
        this.maDe = maDe;
        this.maHocPhan = maHocPhan;
        this.thoiGian = thoiGian;
        this.soCau = soCau;
    }

    public String getMaDe() {
        return this.maDe;
    }

    public void setMaDe(String maDe) {
        this.maDe = maDe;
    }

    public String getmaHocPhan() {
        return this.maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public int getThoiGian() {
        return this.thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getSoCau() {
        return this.soCau;
    }

    public void setSoCau(int soCau) {
        this.soCau = soCau;
    }

    @Override
    public String getPk(){
        return maDe;
    }

    public void nhap() {
        // System.out.println("Nhap ma de:");
        // maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma hoc phan:");
        maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap thoi gian thi:");
        thoiGian = nhap.kiemTraSo(1);
        // System.out.println("Nhap so cau:");
        // soCau = nhap.kiemTraSo(1);
    }

    public void xuat() {
        System.out.println("Ma de: " + maDe);
        System.out.println("Ma hoc phan: " + maHocPhan);
        System.out.println("Thoi gian thi: " + thoiGian);
        System.out.println("So cau: " + soCau);
    }

    public void xuatDanhSach() {
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|\n", maDe, maHocPhan, thoiGian, soCau);
    }

    public void sua() {
        do {
            System.out.println("-----------------------");
            System.out.println("|   1. Ma de          |");
            System.out.println("|   2. Ma hoc phan    |");
            System.out.println("|   3. Thoi gian      |");
            System.out.println("|   4. So cau         |");
            System.out.println("-----------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 4));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap ma de moi:");
                maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("Nhap ma hoc phan moi:");
                maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }
            case '3': {
                System.out.println("Nhap thoi gian moi:");
                thoiGian = nhap.kiemTraSo(1);
                break;
            }

            case '4': {
                System.out.println("Nhap so cau moi:");
                soCau = nhap.kiemTraSo(1);
                break;
            }
            default:
                break;
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua cau hoi.");
        } while (!(nhap.kiemTraChuoi().equals("t")));
    }

}
