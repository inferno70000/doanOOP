package QuanLyThiTracNghiem;

import java.io.*;

public class chuong implements iClass, Serializable {
    private String maChuong;
    private String tenChuong;
    private String noiDung;
    private String maHocPhan;

    public chuong() {

    }

    public chuong(String maChuong, String tenChuong, String noiDung, String maHocPhan) {
        this.maChuong = maChuong;
        this.noiDung = noiDung;
        this.tenChuong = tenChuong;
        this.maHocPhan = maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public void setMaChuong(String tenChuong) {
        this.maChuong = tenChuong;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setTenChuong(String tenChuong) {
        this.tenChuong = tenChuong;
    }

    public String getMaChuong() {
        return maChuong;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getChuong() {
        return tenChuong;
    }

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void nhap() {
        System.out.println("Nhap ma chuong:");
        maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ten chuong:");
        tenChuong = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
        System.out.println("Nhap noi dung chuong:");
        noiDung = nhap.kiemTraChuoi();
        System.out.println("Nhap ma hoc phan:");
        maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
    }

    @Override
    public String getPk(){
        return maChuong;
    }

    @Override
    public void xuat() {
        System.out.println("Ma chuong: " + maChuong);
        System.out.println("Ten chuong: " + tenChuong);
        System.out.println("Noi dung chuong: " + noiDung);
        System.out.println("Ma hoc phan: " + maHocPhan);
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-30s|\n", maChuong, tenChuong, maHocPhan, noiDung);
    }

    public void sua() {
        do {
            System.out.println("----------------------------");
            System.out.println("|   1. Ma chuong           |");
            System.out.println("|   2. Ma hoc phan         |");
            System.out.println("|   3. Ten chuong          |");
            System.out.println("|   4. Noi dung chuong     |");
            System.out.println("----------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 4));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap ma chuong moi:");
                maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("Nhap ma hoc phan moi:");
                maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '3': {
                System.out.println("Nhap ten chuong moi:");
                tenChuong = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                break;
            }

            case '4': {
                System.out.println("Nhap noi dung chuong moi:");
                noiDung = nhap.kiemTraChuoi();
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
}
