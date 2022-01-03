package QuanLyThiTracNghiem;

import java.io.*;

public class chiTietNhom implements iClass , Serializable{
	private String maNhom;
	private String maSv;
	
	public chiTietNhom() {
	}

	public chiTietNhom(String maNhom, String maSv) {
		this.maNhom = maNhom;
		this.maSv = maSv;
	}

	public void nhap() {
		System.out.println("Ma nhom: ");
		maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Ma sinh vien: ");
		maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
	}

	@Override
    public String getPk(){
        return maNhom+maSv;
    }
	@Override
	public void xuat() {
		System.out.println("--------------------------------------");
		System.out.printf("|%-15s|%-20s|\n", " Ma nhom", " Ma sinh vien");
		System.out.println("--------------------------------------");
		System.out.printf("|%-15s|%-20s|\n", " " + maNhom, " " + maSv);
		System.out.println("--------------------------------------");
	}

	@Override
	public void xuatDanhSach() {
		System.out.println("--------------------------------------");
		System.out.printf("|%-15s|%-20s|\n", " " + maNhom, " " + maSv);
	}

	public String getMaNhom() {
		return maNhom;
	}

	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}


	public void sua() {
		do {
			System.out.println("-----------------------");
			System.out.println("| 1. Ma nhom 		  |");
			System.out.println("| 2. Ma sinh vien     |");
			System.out.println("-----------------------");
			System.out.println("Nhap thong tin can sua:");
			int chon = nhap.kiemTraSo(1,2);
			switch (chon) {
			case 1:
				System.out.println("Ma nhom moi:");
				maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
				break;
			case 2:
				System.out.println("Ma sinh vien moi:");
				maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
				break;
			default:
				System.out.println("Ban nhap sai!!");
				break;
			}
			System.out.println("-----------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua nhom.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
	}
}
