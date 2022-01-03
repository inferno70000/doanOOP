package QuanLyThiTracNghiem;

import java.io.*;

public class date implements Serializable{
    private int ngay;
    private int thang;
    private int nam;

    public date() {
        
    }

    public date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void nhap(){
        System.out.println("Nhap ngay sinh:");
        ngay=nhap.kiemTraSo(1, 31);
        System.out.println("Nhap thang sinh:");
        thang=nhap.kiemTraSo(1,12);
        System.out.println("Nhap nam sinh:");
        nam=nhap.kiemTraSo(1940);
    }

    public int getNgay() {
        return this.ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return this.thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return this.nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof date)) {
            return false;
        }
        date date = (date) o;
        return ngay == date.ngay && thang == date.thang && nam == date.nam;
    }

    @Override
    public String toString() {
        return getNgay()+"/"+getThang()+"/"+getNam();
    }

}
