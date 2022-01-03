package QuanLyThiTracNghiem;

import java.io.*;

public class nhomHocPhan implements iClass, Serializable{
	private String maNhom;
	private String maHocPhan;
	private int soLuong;
	// Scanner sc=new Scanner(System.in);
	public nhomHocPhan() {
		
	}
	
	public nhomHocPhan(String maNhom, String maHocPhan, int soluong) {
		this.maNhom = maNhom;
		this.maHocPhan = maHocPhan;
		this.soLuong = soluong;
	}
	public void nhap()
	{
		System.out.println("Ma nhom: ");
		maNhom=nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Ma hoc phan: ");
		maHocPhan=nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("So luong: ");
		soLuong=nhap.kiemTraSo(0);
	}

	@Override
    public String getPk(){
        return maNhom;
    } 
	@Override
	public void xuat()
	{
		System.out.println("--------------------------------------------");
		System.out.printf("|%-15s|%-15s|%-10s|\n","Ma nhom","Ma hoc phan","So luong");
		System.out.println("--------------------------------------------");
		System.out.printf("|%-15s|%-15s|%-10s|\n"," "+maNhom," "+maHocPhan," "+soLuong);
		System.out.println("--------------------------------------------");
	}
	@Override
	public void xuatDanhSach() {
		System.out.println("--------------------------------------------");
		System.out.printf("|%-15s|%-15s|%-10s|\n"," "+maNhom," "+maHocPhan," "+soLuong);
		
	}
	public void setMaNhom(String maNhom)
	{
		this.maNhom=maNhom;
	}
	public String getMaNhom()
	{
		return maNhom;
	}
	
	public String getMaHocPhan() {
		return maHocPhan;
	}
	public void setMaHocPhan(String maHocPhan) {
		this.maHocPhan = maHocPhan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soluong) {
		this.soLuong = soluong;
	}
	public void sua()
	{
		do {
			System.out.println("---------------------");
            System.out.println("|   1. Ma nhom       |");
            System.out.println("|   2. Ma hoc phan   |");
            System.out.println("|   3. So luong      |");
            System.out.println("---------------------");
            System.out.println("Nhap thong tin can sua:");
			int chon=nhap.kiemTraSo(1);
			switch(chon)
			{
			case 1:
				
				System.out.println("Ma nhom moi:");
				maNhom=nhap.kiemTraMa(nhap.soLuongKyTuMa);
				break;
			case 2:
				
				System.out.println("Ma hoc phan moi:");
				maHocPhan=nhap.kiemTraMa(nhap.soLuongKyTuMa);
				break;
			case 3:
				
				System.out.println("So luong moi:");
				soLuong=nhap.kiemTraSo(0);
				break;
			default:
				System.out.println("Ban nhap sai!!!");
				break;
			}
			System.out.println("-----------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua nhom hoc phan.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
	}	
}
