package QuanLyThiTracNghiem;

import java.io.*;

public class taiKhoan implements iClass, Serializable {
    private String id;
    private String pass;
    private String type;

    public taiKhoan() {
        
    }

    public taiKhoan(String id, String pass, String type) {
        this.id = id;
        this.pass = pass;
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }
    
    public String getType() {
        return type;
    }

    @Override
    public String getPk() {
        return id;
    }

    public void nhap() {
        System.out.println("Nhap id:");
        id = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap mat khau:");
        pass = nhap.kiemTraChuoi();
        System.out.println("Nhap chuc vu:");
        type = nhap.kiemTraChuoi();
    }

    @Override
    public void xuat() {
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-20s|\n", "Id", "Mat khau", "Chuc vu");
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-20s|\n", id, pass, type);
        System.out.println("------------------------------------------------------");
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-20s|\n", id, pass, type);
    }

    public void sua() {
        do {
            System.out.println("---------------------");
            System.out.println("|   1. Id           |");
            System.out.println("|   2. Mat khau     |");
            System.out.println("|   3. Chuc vu      |");
            System.out.println("---------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 3));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap id moi:");
                id = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("Nhap mat khau moi:");
                pass =nhap.kiemTraChuoi();
                break;
            }
            
            case '3': {
                System.out.println("Nhap chuc vu moi:");
                type = nhap.kiemTraChuoi();
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

    public static void main(String[] args) {
        taiKhoan a = new taiKhoan();
        a.nhap();
        a.xuat();
        a.sua();
        a.xuat();
    }
}
