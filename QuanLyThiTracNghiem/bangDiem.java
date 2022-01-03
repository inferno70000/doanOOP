package QuanLyThiTracNghiem;

import java.io.*;

public class bangDiem implements iClass, Serializable{
	private String maBangDiem;
	private String maSv;
	private String namHoc;
	private int hocKi;
	
	public bangDiem() {

	}
	public bangDiem(String maBangDiem, String maSv, String namHoc, int hocKi) {
		this.maBangDiem = maBangDiem;
		this.maSv = maSv;
		this.namHoc = namHoc;
		this.hocKi = hocKi;
	}
	public String getMaBangDiem() {
		return maBangDiem;
	}
	public void setMaBangDiem(String maBangDiem) {
		this.maBangDiem = maBangDiem;
	}
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public String getNamHoc() {
		return namHoc;
	}
	public void setNamHoc(String namHoc) {
		this.namHoc = namHoc;
	}
	public int getHocKi() {
		return hocKi;
	}
	public void setHocKi(int hocKi) {
		this.hocKi = hocKi;
	}
	public void nhap()
	{
		System.out.println("Ma bang diem: ");
		maBangDiem=nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Ma sinh vien: ");
		maSv=nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Nam hoc: ");
		namHoc=nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
		System.out.println("Hoc ki: ");
		hocKi=nhap.kiemTraSo(1, 3);
	}

    @Override
    public String getPk(){
        return maBangDiem;
    }

	@Override
	public void xuatDanhSach() {
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|%-17s|%-20s|%-15s|%-10s| \n"," "+maBangDiem," "+maSv," "+namHoc," "+hocKi);
	}
	@Override
	public void xuat() {
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|%-17s|%-20s|%-15s|%-10s| \n"," Ma bang diem"," Ma sinh vien"," Nam hoc"," Hoc ki");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|%-17s|%-20s|%-15s|%-10s| \n"," "+maBangDiem," "+maSv," "+namHoc," "+hocKi);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void sua()
	{
		do {
			System.out.println("----------------------");
            System.out.println("|   1. Ma bang diem  |");
            System.out.println("|   2. Ma sinh vien  |");
            System.out.println("|   3. Nam hoc       |");
            System.out.println("|   4. Hoc ki        |");
            System.out.println("----------------------");
            System.out.println("Nhap thong tin can sua:");
            int chon=nhap.kiemTraSo(1);
            switch(chon)
            {
            case 1:
				System.out.println("Ma bang diem moi:");
				maBangDiem=nhap.kiemTraMa(nhap.soLuongKyTuMa);
				break;
			case 2:
				System.out.println("Ma sinh vien moi:");
				maSv=nhap.kiemTraMa(nhap.soLuongKyTuMa);
				break;
			case 3:
				System.out.println("Nam hoc moi:");
				namHoc=nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
				break;
			case 4:
				System.out.println("Hoc ki moi:");
				hocKi=nhap.kiemTraSo(1,3);
				break;
			default:
				System.out.println("Ban nhap sai!!!");
				break;
            }
			System.out.println("-----------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua chi tiet de thi.");
        } 
		while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
	}
	
}
