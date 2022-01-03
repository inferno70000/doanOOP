package QuanLyThiTracNghiem;

import java.io.*;

public class chiTietCauTrucDeThi implements iClass, Serializable {
    private String maDe;
    private String maChuong;
    private String maMucDo;
    private int soCau;

    public chiTietCauTrucDeThi() {

    }

    public chiTietCauTrucDeThi(String maDe, String maChuong, String maMucDo, int soCau) {
        this.maDe = maDe;
        this.maChuong = maChuong;
        this.maMucDo=maMucDo;
        this.soCau = soCau;
    }

    public void setMaChuong(String maChuong) {
        this.maChuong = maChuong;
    }

    public void setMaDe(String maDe) {
        this.maDe = maDe;
    }

    public void setMaMucDo(String maMucDo) {
        this.maMucDo = maMucDo;
    }

    public void setSoCau(int soCau) {
        this.soCau = soCau;
    }

    public String getMaChuong() {
        return maChuong;
    }

    public String getMaDe() {
        return maDe;
    }

    public String getMaMucDo() {
        return maMucDo;
    }

    public int getSoCau() {
        return soCau;
    }

    public void nhap() {
        System.out.println("Nhap ma cau truc de thi:");
        maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap so cau:");
        soCau = nhap.kiemTraSo(1);
        System.out.println("Nhap ma chuong:");
        maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma muc do:");
        maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
    }

    @Override
    public String getPk(){
        return maDe+maChuong;
    }

    @Override
    public void xuat() {
        System.out.println("Ma cau truc de thi: " + maDe);
        System.out.println("So cau: " + soCau);
        System.out.println("Ma chuong: " + maChuong);
        System.out.println("Ma muc do: " + maMucDo);
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("|%-25s|%-15s|%-15s|%-15s|\n", maDe, maChuong, maMucDo, soCau);
    }

    public void sua() {
        do {
            System.out.println("-----------------------------");
            System.out.println("|   1. Ma cau truc de thi   |");
            System.out.println("|   2. Ma chuong            |");
            System.out.println("|   3. Ma muc do            |");
            System.out.println("|   4. So cau               |");
            System.out.println("-----------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 4));
            switch (menu.charAt(0)) {
                case '1': {
                    System.out.println("Nhap ma cau truc de thi moi:");
                    maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                case '2': {
                    System.out.println("Nhap ma chuong moi:");
                    maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                case '3': {
                    System.out.println("Nhap ma muc do moi:");
                    maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                case '4': {
                    System.out.println("Nhap so cau moi:");
                    soCau = nhap.kiemTraSo(1);
                    break;
                }

                default: {
                    System.out.println("Nhap sai!!!");
                    break;
                }
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua chi tiet cau truc de thi.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }
}
