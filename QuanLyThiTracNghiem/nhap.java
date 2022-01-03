package QuanLyThiTracNghiem;
import java.util.*;
import java.io.Console;

public class nhap {


	private static Scanner sc = new Scanner(System.in);

	public static final int soLuongKyTuMa = 5;
	public static final int soLuongKyTuChuoi = 25;


	public static void waiting(){
		System.out.println("Nhan Enter de tiep tuc");
        sc.nextLine();
	}
	public static boolean xacNhan(){
		System.out.println("-------------------");
		System.out.println("|   1.Xac Nhan     |");
		System.out.println("|   2.Khong        |");
		System.out.println("--------------------");
		int result=nhap.kiemTraSo(1, 2);
		return result==1;
	}
	public static String nhapMk(){
		Console con = System.console();

        if (con == null) {
            System.out.print("No console available");
            return null;
        }
        // System.out.println("Enter the password: ");
        char[] ch = con.readPassword();

        String pass = String.valueOf(ch);
        // System.out.println("Password is: " + pass);
		return pass;
	}
	// check so nguyen o dang chuoi
	public static String kiemTraMa(int soKyTuGioiHan) {
		String result = "";
		while (true) {
			result = String.valueOf(nhap.kiemTraSo(0));
			if (result.length() <= soKyTuGioiHan) {
				String tmp = "";
				for (int i = result.length(); i < soKyTuGioiHan; i++) {
					tmp += '0';
				}
				result = tmp + result;
				break;
			}
			System.out.printf("Gioi han chi %d ky tu, vui long nhap lai\n", soKyTuGioiHan);
		}
		return result;
	}

	// check so nguyen\
	public static int kiemTraSo(int min) {
		int result;
		while (true) {
			while (!sc.hasNextInt()) {
				System.out.println("Nhap sai dinh dang!!!");
				System.out.println("Moi nhap lai:");
				sc.next();
			}
			result = sc.nextInt();
			sc.nextLine();
			if (result >= min) {
				break;
			}
			System.out.printf("So phai >= %d   , vui long nhap lai\n", min);
		}
		return result;
	}

	public static int kiemTraSo(int min, int max) {
		int result;
		while (true) {
			while (!sc.hasNextInt()) {
				System.out.println("Nhap sai dinh dang!!!");
				System.out.println("Moi nhap lai:");
				sc.next();
			}
			result = sc.nextInt();
			sc.nextLine();
			if (result >= min && result <= max) {
				break;
			}
			System.out.printf("Gioi han tu trong khoang %d  -  %d , vui long nhap lai\n", min, max);
		}
		return result;
	}

	public static float kiemTraDiem(int min, int max) {
		float result;
		while (true) {
			while (!sc.hasNextFloat()) {
				System.out.println("Nhap sai dinh dang!!!");
				System.out.println("Moi nhap lai:");
				sc.next();
			}
			result = sc.nextFloat();
			sc.nextLine();
			if (result >= min && result <= max) {
				break;
			}
			System.out.printf("Gioi han tu trong khoang %d  -  %d , vui long nhap lai\n", min, max);
		}
		return result;
	}

	public static String kiemTraGioiTinh(){
		String result;
		while(true)
		{
			result=kiemTraChuoi();
			if(result.toLowerCase().equals("nam")||result.toLowerCase().equals("nu"))
				break;
			System.out.println("Chi duoc nhap nam hoac nu, vui long nhap lai");
		}
		return result;
	}

	public static String kiemTraChuoi() {
		String result;
		while(true)
		{
			result=sc.nextLine();
			if(result.trim()!=""){
				break;
			}
			System.out.println("Khong duoc phep la chuoi trong!!");

		}
		return result;
	}

	public static String kiemTraChuoi(int soKyTuGioiHan) {
		String result;
		while (true) {
			result = nhap.kiemTraChuoi();
			if (result.length() <= soKyTuGioiHan) {
				break;
			}
			System.out.printf("Gioi han chi %d ky tu, vui long nhap lai\n", soKyTuGioiHan);
		}
		return result;
	}

	public static char kiemTraLuaChon() {
		char result;
		while (true) {
			String tmp=sc.nextLine().toLowerCase();
			if(tmp.length()!=1){
				System.out.println("Ban chi duoc nhap 1 ki tu A,B,C hoac D");
				continue;
			}
			result = tmp.charAt(0);
			if (result >= 'a' && result <= 'd')
				break;
			System.out.println("Ban phai nhap A, B, C hoac D, vui long nhap lai");
		}
		return result;
	}

	public static boolean kiemTraBoolean() {
		boolean result;
		while (true) {
			String tmp = sc.nextLine().toLowerCase();
			// System.out.println(tmp);
			if (tmp.equals("dung")) {
				result = true;
				break;
			}
			if (tmp.equals("sai")) {
				result = false;
				break;
			}
			System.out.println("Nhap sai dinh dang!!!(ban phai nhap dung / sai)");
			System.out.println("Moi nhap lai:");
		}
		return result;
	}
	public static String kiemTraSoDienThoai(){
		String regex ="(84|0[3|5|7|8|9])+([0-9]{8,9})";
		String result="";
		while(true){
			result=sc.nextLine();
			if(result.matches(regex))
				break;
			System.out.println("Khong phai so dien thoai, vui long nhap lai:");
		}
		return result;
	}

	public static void main(String[] args) {

		nhap.kiemTraSoDienThoai();
	}
}