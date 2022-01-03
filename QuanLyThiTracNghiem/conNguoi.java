package QuanLyThiTracNghiem;

import java.io.*;

public abstract class conNguoi implements iClass, Serializable{
    protected String hoTen;
    protected String sdt;
    protected date ngaySinh;
    protected String queQuan;
    protected String gioiTinh;
    

    public conNguoi() {
        ngaySinh=new date();
    }

    public conNguoi(String hoTen, String queQuan, date ngaySinh, String sdt, String gioiTinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return this.queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public date getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "{" +
            " hoTen='" + getHoTen() + "'" +
            ", queQuan='" + getQueQuan() + "'" +
            ", ngaySinh='" + getNgaySinh() + "'" +
            ", sdt='" + getSdt() + "'" +
            ", gioiTinh='" + getGioiTinh() + "'" +
            "}";
    }
    
    public void nhap() {
        System.out.println("Nhap ho ten: ");
        hoTen = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
        System.out.println("Nhap que quan: ");
        queQuan = nhap.kiemTraChuoi();
        ngaySinh.nhap();
        System.out.println("Nhap so dien thoai:");
        sdt = nhap.kiemTraSoDienThoai();
        System.out.println("Nhap gioi tinh:");
        gioiTinh = nhap.kiemTraGioiTinh();
    }


    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Que quan: " + queQuan);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("Gioi tinh: " + gioiTinh);
    }

    public abstract void xuatDanhSach();
    public abstract void sua();
}