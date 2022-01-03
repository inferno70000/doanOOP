package QuanLyThiTracNghiem;

import java.io.*;

public class nhomCauHoi implements iClass , Serializable{
    private String maNhom;
    private String maChuong;
    private String maMucDo;

    public nhomCauHoi() {

    }

    public nhomCauHoi(String maNhom, String maChuong, String maMucDo) {
        this.maNhom = maNhom;
        this.maChuong = maChuong;
        this.maMucDo = maMucDo;
    }

    public void setMaChuong(String maChuong) {
        this.maChuong = maChuong;
    }

    public void setMaMucDo(String maMucDo) {
        this.maMucDo = maMucDo;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public String getMaChuong() {
        return maChuong;
    }

    public String getMaMucDo() {
        return maMucDo;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void nhap() {
        System.out.println("Nhap ma nhom cau hoi:");
        maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma muc do:");
        maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma chuong:");
        maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
    }

    @Override
    public String getPk(){
        return maNhom;
    }

    @Override
    public void xuat() {
        System.out.println("Ma nhom cau hoi: " + maNhom);
        System.out.println("Ma muc do: " + maMucDo);
        System.out.println("Ma chuong: " + maChuong);
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-20s|%-15s|%-15s|\n", maNhom, maMucDo, maChuong);
    }

    public void sua() {
        do {
            System.out.println("--------------------------");
            System.out.println("|   1. Ma nhom cau hoi   |");
            System.out.println("|   2. Ma chuong         |");
            System.out.println("|   3. Ma muc do         |");
            System.out.println("--------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 3));
            switch (menu.charAt(0)) {
                case '1': {
                    System.out.println("Nhap ma nhom cau hoi moi:");
                    maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
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

                default:
                    break;
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua nhom cau hoi.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }
    // public static void main(String[] args) {
    //     danhSachNhomCauHoi a=new danhSachNhomCauHoi();
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.them(new nhomCauHoi("Mã Nhóm","Mã Chuong","Mã mức độ"))
    //     a.ghiFile();
    // }
}
