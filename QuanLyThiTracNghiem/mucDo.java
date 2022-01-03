package QuanLyThiTracNghiem;

import java.io.*;

public class mucDo  implements iClass, Serializable{
    private String maMucDo;
    private String tenMucDo;

    public mucDo() {

    }

    public mucDo(String maMucDo, String tenMucDo) {
        this.maMucDo = maMucDo;
        this.tenMucDo = tenMucDo;
    }

    public void setMaMucDo(String maMucDo) {
        this.maMucDo = maMucDo;
    }
    
    public String getMaMucDo() {
        return maMucDo;
    }

    public void setTenMucDo(String tenMucDo) {
        this.tenMucDo = tenMucDo;
    }
    
    public String getTenMucDo() {
        return tenMucDo;
    }

    public void nhap() {
        System.out.println("Nhap ma muc do:");
        maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ten muc do:");
        tenMucDo = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
    }

    @Override
    public String getPk(){
        return maMucDo;
    }

    @Override
    public void xuat() {
        System.out.println("Ma muc do: " + maMucDo);
        System.out.println("Ten muc do: " + tenMucDo);
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("------------------------------------------------");
        System.out.printf("|%-15s|%-30s|\n", maMucDo, tenMucDo);
    }

    public void sua() {

        do {
            System.out.println("----------------------------");
            System.out.println("|   1. Ma muc do           |");
            System.out.println("|   2. Ten muc do          |");
            System.out.println("----------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 2));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap muc do moi:");
                maMucDo = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("nhap ten muc do moi:");
                tenMucDo = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                break;
            }

            default: {
                System.out.println("Nhap sai!!!");
                break;
            }
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua mua do.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }
}
