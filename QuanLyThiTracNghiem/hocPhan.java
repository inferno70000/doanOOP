package QuanLyThiTracNghiem;

import java.io.*;

public class hocPhan implements iClass, Serializable{
	private String maHocPhan;
	private String tenHocPhan;
	private String maKhoa;
	private int soTinChi;
	
	public hocPhan() {
		
	}
	public hocPhan(String maHocPhan, String tenHocPhan, String maKhoa, int soTinChi) {
		super();
		this.maHocPhan = maHocPhan;
		this.tenHocPhan = tenHocPhan;
		this.maKhoa = maKhoa;
		this.soTinChi = soTinChi;
	}
	@Override
    public String getPk(){
        return maHocPhan;
    }

	public void nhap()
	{
		// System.out.println("Ma hoc phan: ");
		// maHocPhan=nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Ten hoc phan: ");
		tenHocPhan=nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
		// System.out.println("Ma khoa: ");
		// maKhoa = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("So tin chi: ");
		soTinChi=nhap.kiemTraSo(2,4);
	}
	@Override
	public void xuat()
	{
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("|%-15s|%-30s|%-15s|%-15s| \n"," Ma hoc phan"," Ten hoc phan"," Ma khoa"," So tin chi");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("|%-15s|%-30s|%-15s|%-15s| \n"," "+maHocPhan," "+tenHocPhan," "+maKhoa," "+soTinChi);
		System.out.println("--------------------------------------------------------------------------------");
	}
	@Override
	public void xuatDanhSach() {
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("|%-15s|%-30s|%-15s|%-15s| \n"," "+maHocPhan," "+tenHocPhan," "+maKhoa," "+soTinChi);
	}

	public String getMaHocPhan() {
		return maHocPhan;
	}

	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}

	public String getTenHocPhan() {
		return tenHocPhan;
	}

	public void setTenHocPhan(String tenHocPhan) {
		this.tenHocPhan = tenHocPhan;
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	public void sua()
	{
		do {
			System.out.println("Chon thong tin can sua");
			System.out.println("----------------------");
            System.out.println("|   1. Ma khoa        |");
            System.out.println("|   2. So tin chi     |");
			System.out.println("|   3. Ten hoc phan   |");
			System.out.println("|   4. Thoat          |");
			System.out.println("----------------------");
            System.out.println("Nhap thong tin can sua:");
			int chon=nhap.kiemTraSo(1, 4);
			switch(chon)
			{
			case 1:
				System.out.println("Ma khoa moi:");
				maKhoa=nhap.kiemTraMa(nhap.soLuongKyTuMa);
				break;
			case 2:
				System.out.println("So tin chi moi:");
				soTinChi=nhap.kiemTraSo(2,4);
				break;
			case 3:
				System.out.println("Nhap ten hoc phan");
				tenHocPhan=nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
				break;
			default:
				return;
			}
        } while (true);
	}	
}
