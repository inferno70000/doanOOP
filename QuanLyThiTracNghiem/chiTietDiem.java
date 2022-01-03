package QuanLyThiTracNghiem;

import java.io.*;

public class chiTietDiem implements iClass, Serializable {
	private String maBangDiem;
	private String maHocPhan;
	private float diem;
	private String maBoDe;

	public String getMaBangDiem() {
		return maBangDiem;
	}

	public void setMaBangDiem(String maBangDiem) {
		this.maBangDiem = maBangDiem;
	}

	public String getMaHocPhan() {
		return maHocPhan;
	}

	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}

	public void setMaBoDe(String maBoDe) {
        this.maBoDe = maBoDe;
    }

    public String getMaBoDe() {
        return maBoDe;
    }
	
	public chiTietDiem() {
	}

	public chiTietDiem(String maBangDiem,String maBoDe, String maHocPhan, float diem) {
		this.maBangDiem = maBangDiem;
		this.maHocPhan = maHocPhan;
		this.diem = diem;
		this.maBoDe=maBoDe;
	}

	public void nhap() {
		System.out.println("Ma bang diem: ");
		maBangDiem = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Ma hoc phan: ");
		maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Diem: ");
		diem = nhap.kiemTraDiem(0, 10);
	}

	@Override
    public String getPk(){
        return maBangDiem+maBoDe;
    }

	@Override
	public void xuatDanhSach() {
		System.out.println("------------------------------------------------------------------");
		System.out.printf("|%-17s|%-17s|%-17s|%-10s| \n", maBangDiem ,maBoDe,maHocPhan, diem);
	}

	@Override
	public void xuat() {
		System.out.println("------------------------------------------------------------------");
		System.out.printf("|%-17s|%-17s|%-17s|%-10s| \n", " Ma bang diem","Ma bo de " ," Ma hoc phan", " Diem");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("|%-17s|%-17s|%-17s|%-10s| \n", maBangDiem ,maBoDe,maHocPhan, diem);
		System.out.println("------------------------------------------------------------------");
	}

	public void sua() {

		do {
			System.out.println("----------------------");
			System.out.println("|   1. Ma bang diem  |");
			System.out.println("|   2. Ma hoc phan   |");
			System.out.println("|   3. Diem          |");
			System.out.println("----------------------");
			System.out.println("Nhap thong tin can sua:");
			int chon = nhap.kiemTraSo(1);
			switch (chon) {
				case 1:
					System.out.println("Ma bang diem moi:");
					maBangDiem = nhap.kiemTraMa(nhap.soLuongKyTuMa);
					break;
				case 2:
					System.out.println("Ma hoc phan moi:");
					maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
					break;
				case 3:
					System.out.println("Diem moi:");
					diem = nhap.kiemTraDiem(0, 10);
					break;
				default:
					System.out.println("Ban nhap sai!!!");
					break;
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua chi tiet diem.");
		} while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
	}
}
