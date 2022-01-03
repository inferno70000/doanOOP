package QuanLyThiTracNghiem;

import java.io.*;

public class cauTrucDeThi implements iClass, Serializable {
    private String maCauTrucDeThi;
    private int thoiGianThi;
    private int hocKi;
    private String maHocPhan;
    private int soCau;

    public cauTrucDeThi() {

    }

    public cauTrucDeThi(String maCauTrucDeThi, int thoiGianThi, int hocKi, String maHocPhan, int soCau) {
        this.maCauTrucDeThi = maCauTrucDeThi;
        this.thoiGianThi = thoiGianThi;
        this.hocKi = hocKi;
        this.maHocPhan = maHocPhan;
        this.soCau = soCau;
    }

    public int getSoCau() {
        return soCau;
    }

    public void setSoCau(int soCau) {
        this.soCau = soCau;
    }

    public void setHocKi(int hocKi) {
        this.hocKi = hocKi;
    }

    public void setMaCauTrucDeThi(String maCauTrucDeThi) {
        this.maCauTrucDeThi = maCauTrucDeThi;
    }

    public void setThoiGianThi(int thoiGianThi) {
        this.thoiGianThi = thoiGianThi;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public int getThoiGianThi() {
        return thoiGianThi;
    }

    public int getHocKi() {
        return hocKi;
    }

    public String getMaCauTrucDeThi() {
        return maCauTrucDeThi;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void nhap() {
        System.out.println("Nhap ma cau truc de:");
        maCauTrucDeThi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap thoi gian thi:");
        thoiGianThi = nhap.kiemTraSo(1);
        System.out.println("Nhap hoc ki: ");
        hocKi = nhap.kiemTraSo(1, 3);
        System.out.println("Nhap ma hoc phan:");
        maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
    }

    @Override
    public String getPk() {
        return maCauTrucDeThi;
    }

    @Override
    public void xuat() {
        System.out.println("Ma cau truc de thi: " + maCauTrucDeThi);
        System.out.println("Thoi gian thi: " + thoiGianThi);
        System.out.println("Hoc ki: " + hocKi);
        System.out.println("Ma hoc phan: " + maHocPhan);
        System.out.println("So cau: " + soCau);
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|%-15s|\n", maCauTrucDeThi, thoiGianThi, hocKi, maHocPhan, soCau);
    }

    public void sua() {
        do {
            System.out.println("Nhap noi dung can sua:");
            System.out.println("--------------------------------------");
            System.out.println("|   1. Ma cau truc de thi            |");
            System.out.println("|   2. Thoi gian thi                 |");
            System.out.println("|   3. Hoc ki                        |");
            System.out.println("|   4. Ma hoc phan                   |");
            System.out.println("--------------------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 4));
            switch (menu.charAt(0)) {
                case '1': {
                    System.out.println("Nhap ma cau truc de moi:");
                    maCauTrucDeThi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                case '2': {
                    System.out.println("Nhap thoi gian thi moi:");
                    thoiGianThi = nhap.kiemTraSo(1);
                    break;
                }

                case '3': {
                    System.out.println("Nhap hoc ki moi:");
                    hocKi = nhap.kiemTraSo(1, 3);
                    break;
                }

                case '4': {
                    System.out.println("Nhap ma hoc phan moi:");
                    maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                default: {
                    System.out.println("Nhap sai!!!");
                    break;
                }
            }
            System.out.println("-------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua cau truc de thi.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }
}