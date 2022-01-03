package QuanLyThiTracNghiem;

import java.io.*;

public class luaChon implements iClass, Serializable {
    private char maLuaChon;
    private String maCau;
    private String noiDung;
    private boolean dapAn;

    public luaChon() {

    }

    public luaChon(char maLuaChon, String maCau, String noiDung, boolean dapAn) {
        this.maCau = maCau;
        this.maLuaChon = maLuaChon;
        this.noiDung = noiDung;
        this.dapAn = dapAn;
    }

    public void setDapAn(boolean dapAn) {
        this.dapAn = dapAn;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public boolean getDapAn() {
        return dapAn;
    }

    public void setMaLuaChon(char maLuaChon) {
        this.maLuaChon = maLuaChon;
    }

    public char getMaLuaChon() {
        return maLuaChon;
    }

    public void setMaCau(String maCau) {
        this.maCau = maCau;
    }

    public String getMaCau() {
        return maCau;
    }

    public void nhap() {
        System.out.println("Nhap ma lua chon: ");
        maLuaChon = nhap.kiemTraLuaChon();
        System.out.println("Nhap ma cau hoi: ");
        maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap noi dung lua chon: ");
        noiDung = nhap.kiemTraChuoi();
        System.out.println("Nhap dap an lua chon (dung/ sai):");
        dapAn = nhap.kiemTraBoolean();
    }

    @Override
    public String getPk(){
        return maCau+maLuaChon;
    }
    @Override
    public void xuat() {
        System.out.println("Ma cau hoi: " + maCau);
        System.out.println("Ma lua chon: " + maLuaChon);
        System.out.println("Noi dung lua chon: " + noiDung);
        System.out.println("Dap an: " + dapAn);
    }

    public void xuatLuaChon(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-80s|\n",maCau, maLuaChon,  noiDung);
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-90s|\n", maLuaChon, maCau, dapAn, noiDung);
    }

    public void sua() {
        do {
            System.out.println("---------------------");
            System.out.println("|   1. Ma lua chon  |");
            System.out.println("|   2. Ma cau       |");
            System.out.println("|   3. Noi dung     |");
            System.out.println("|   4. Dung/Sai     |");
            System.out.println("---------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 4));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap ma lua chon moi:");
                maLuaChon = nhap.kiemTraLuaChon();
                break;
            }

            case '2': {
                System.out.println("Nhap ma cau hoi moi:");
                maCau =nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }
            
            case '3': {
                System.out.println("Nhap noi dung moi:");
                noiDung = nhap.kiemTraChuoi();
                break;
            }
            
            case '4': {
                System.out.println("Nhap tinh dung/sai moi:");
                dapAn = nhap.kiemTraBoolean();
                break;
            }

            default: {
                System.out.println("Nhap sai!!!");
                break;
            }
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua lua chon.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }
}