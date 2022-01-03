package QuanLyThiTracNghiem;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachChiTietNhom implements iDanhSach , Serializable{
	private chiTietNhom[] ds;
	private int soLuong;

	public danhSachChiTietNhom() {

	}

	public danhSachChiTietNhom(int soLuong) {
		this.soLuong = soLuong;
		ds = new chiTietNhom[soLuong];
		for (int i = 0; i < soLuong; i++) {
			ds[i] = new chiTietNhom();
			ds[i].nhap();
		}
	}

	public chiTietNhom[] getDs() {
		return ds;
	}

	public void setDs(chiTietNhom[] ds) {
		this.ds = ds;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachChiTietNhom.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachChiTietNhom.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachChiTietNhom tmp=new danhSachChiTietNhom();
            tmp=(danhSachChiTietNhom)ois.readObject();
            this.ds=tmp.getDs();
            this.soLuong=tmp.soLuong();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public void ghiFile(){
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream(".\\data\\danhSachChiTietNhom.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        ObjectOutputStream oos=null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }       
      
        try {
            oos.writeObject(this);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        try {
            // -----------------------------dong luong---------------------------
            fos.close();
        } catch (NotSerializableException ex) {
            Logger.getLogger(danhSachChiTietNhom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachChiTietNhom.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachChiTietNhom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(chiTietNhom obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

	public void nhap() {
		System.out.println("Nhap so luong danh sach chi tiet nhom: ");
		soLuong = nhap.kiemTraSo(1);
		ds = new chiTietNhom[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap danh sach chi tiet nhom thu " + (i + 1) + ":");
			ds[i] = new chiTietNhom();
			ds[i].nhap();
		}
	}

	@Override
	public void xuat() {
		sapXep();
		System.out.println("--------------------------------------");
		System.out.printf("|%-15s|%-20s|\n", " Ma nhom", " Ma sinh vien");
		for (int i = 0; i < soLuong; i++) {
			ds[i].xuatDanhSach();
		}
		System.out.println("--------------------------------------");
	}

	public chiTietNhom at(int index) {
		return ds[index];
	}

	@Override
	public int soLuong() {
		return soLuong;
	}

	@Override
	public void them() {
		System.out.println("Nhap danh sach chi tiet nhom thu " + (soLuong + 1) + ":");
		chiTietNhom arrnew = new chiTietNhom();
		arrnew.nhap();
		them(arrnew);
	}

	public void them(chiTietNhom obj) {
		chiTietNhom arrnew[] = new chiTietNhom[soLuong + 1];
		for (int i = 0; i < soLuong; i++) {
			arrnew[i] = ds[i];
		}
		arrnew[soLuong] = new chiTietNhom();
		arrnew[soLuong] = obj;
		ds = arrnew;
		soLuong++;
	}

	public void xoa(int i) {
		for (; i < soLuong - 1; i++) {
			ds[i] = ds[i + 1];

		}
		soLuong--;
	}

	@Override
	public void xoa() {
		System.out.println("Nhap ma nhom muon xoa:");
		String maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Nhap ma sinh vien muon xoa:");
		String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		xoa(maNhom, maSv);
	}

	public void xoa(String maNhom, String maSv) {
		int k = timKiem(maNhom, maSv);
		if (k == -1) {
			System.out.println("Khong co ma de xoa");
			return;
		}
		xoa(k);

	}

	public void xoa(chiTietNhom obj) {
		xoa(obj.getMaNhom(), obj.getMaSv());
	}

	
	public void xoaNhomHocPhan(String maNhom){
		for(int i=0;i<getSoLuong();i++){
			if(ds[i].getMaNhom().equals(maNhom)){
				xoa(i);
				i--;
			}
		}
	}

	@Override
	public void timKiem() {
		System.out.println("Nhap ma nhom can tim: ");
		String maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Nhap ma sv can tim: ");
		String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		int k = timKiem(maNhom, maSv);
		if (k == -1)
			System.out.println("Khong tim thay");
		else
			ds[k].xuat();
	}

	public int timKiem(String maNhom, String maSv) {
		for (int i = 0; i < soLuong; i++) {
			if (ds[i].getMaNhom().equals(maNhom) && ds[i].getMaNhom().equals(maSv)) {
				return i;
			}
		}
		return -1;
	}

	public void timKiemNhom(String maNhom) {
		System.out.println("--------------------------------------");
		System.out.printf("|%-15s|%-20s|\n", " Ma nhom", " Ma sinh vien");
		for (int i = 0; i < soLuong; i++) {
			if (ds[i].getMaNhom().equals(maNhom)) {
				ds[i].xuatDanhSach();
			}
		}
	}

	public void timKiemMaSv(String maSv) {
		System.out.println("--------------------------------------");
		System.out.printf("|%-15s|%-20s|\n", " Ma nhom", " Ma sinh vien");
		for (int i = 0; i < soLuong; i++) {
			if (ds[i].getMaNhom().equals(maSv)) {
				ds[i].xuatDanhSach();
			}
		}
	}

	@Override
	public void sua() {
		System.out.println("Nhap ma nhom muon sua:");
		String maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		System.out.println("Nhap ma sinh vien muon sua:");
		String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		sua(maNhom, maSv);
	}

	public void sua(String maNhom, String maSv) {
		int index = timKiem(maNhom, maSv);
		if (index == -1)
			System.out.println("Khong tim thay!!!");
		else {
			ds[index].sua();
		}
	}

	@Override
	public void sapXep() {
		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (Double.parseDouble(ds[i].getMaNhom()) > Double.parseDouble(ds[j].getMaNhom())) {
					chiTietNhom gan = ds[i];
					ds[i] = ds[j];
					ds[j] = gan;
				}
			}
		}

	}

	public int idNext(){

        return -1;
    }
}
