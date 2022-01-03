package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachNhomHocPhan implements iDanhSach , Serializable{
	private nhomHocPhan[] ds;
	private int soLuong;

	public danhSachNhomHocPhan() {
	}

	public danhSachNhomHocPhan(int soLuong) {
		this.soLuong = soLuong;
		ds = new nhomHocPhan[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap nhom hoc phan " + (i + 1) + ":");
			ds[i] = new nhomHocPhan();
			ds[i].nhap();
		}
	}

	public nhomHocPhan[] getDs() {
		return ds;
	}

	public void setDs(nhomHocPhan[] ds) {
		this.ds = ds;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public nhomHocPhan at(int i) {
		return ds[i];
	}

	@Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachNhomHocPhan.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachNhomHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachNhomHocPhan tmp=new danhSachNhomHocPhan();
            tmp=(danhSachNhomHocPhan)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachNhomHocPhan.txt");
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
            Logger.getLogger(danhSachNhomHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachNhomHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachNhomHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


	@Override
	public void nhap() {
		System.out.println("Nhap so luong nhom hoc phan: ");
		soLuong = nhap.kiemTraSo(0);
		ds = new nhomHocPhan[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap nhom hoc phan " + (i + 1) + ":");
			ds[i] = new nhomHocPhan();
			ds[i].nhap();
		}
	}

	public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(nhomHocPhan obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

	@Override
	public void xuat() {
		sapXep();
		System.out.println("--------------------------------------------");
		System.out.printf("|%-15s|%-15s|%-10s|\n", " Ma nhom", " Ma hoc phan", " So luong");
		for (int i = 0; i < soLuong; i++) {
			ds[i].xuatDanhSach();
		}
		System.out.println("--------------------------------------------");
	}

	@Override
	public int soLuong() {
		return soLuong;
	}

	@Override
	public void them() {
		System.out.println("Nhap nhom hoc phan thu " + (soLuong + 1) + ":");
		nhomHocPhan tmp = new nhomHocPhan();
		tmp.nhap();
		them(tmp);
	}

	public void them(nhomHocPhan obj) {
		nhomHocPhan arrnew[] = new nhomHocPhan[soLuong + 1];
		for (int i = 0; i < soLuong; i++) {
			arrnew[i] = ds[i];
		}
		arrnew[soLuong] = new nhomHocPhan();
		arrnew[soLuong] = obj;
		ds = arrnew;
		soLuong++;
	}

	@Override
	public void sua() {
		System.out.println("Nhap ma nhom hoc phan can sua: ");
		String maNhomHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		sua(maNhomHocPhan);
	}

	public void sua(String maNhomHocPhan) {
		int k = timKiem(maNhomHocPhan);
		if (k == -1)
			System.out.println("Khong tim thay!!!");
		else
			ds[k].sua();
	}

	public void sua(nhomHocPhan obj) {
		sua( obj.getMaNhom());
	}

	@Override
	public void xoa() {
		System.out.println("Nhap ma nhom hoc phan can xoa: ");
		String maNhomHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		xoa(maNhomHocPhan);
	}

	public void xoa(String maNhomHocPhan) {
		int k = timKiem(maNhomHocPhan);
		if (k == -1) {
			System.out.println("Khong co ma de xoa");
			return;
		}
		xoa(k);
	}

	public void xoa(int i) {
		soLuong--;
		for (; i < soLuong; i++) {
			ds[i] = ds[i + 1];
		}
	}

	public void xoa(nhomHocPhan obj) {
		xoa(obj.getMaNhom());
	}

	@Override
	public void timKiem() {
		System.out.println("Nhap ma nhom hoc phan can tim: ");
		String maNhomHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		int k = timKiem(maNhomHocPhan);
		if (k == -1)
			System.out.println("Khong tim thay");
		else
			ds[k].xuat();
	}

	public int timKiem(String maNhomHocPhan) {
		for (int i = 0; i < soLuong; i++) {
			if (ds[i].getMaNhom().equals(maNhomHocPhan)) {
				return i;
			}
		}
		return -1;
	}

	public int idNext(){
        int max=30071;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getMaNhom())){
                max=Integer.parseInt(ds[i].getMaNhom());
            }
        }
        return max+1;
    }

	@Override
	public void sapXep() {
		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (Double.parseDouble(ds[i].getMaHocPhan()) > Double.parseDouble(ds[j].getMaHocPhan())) {
					var gan = ds[i];
					ds[i] = ds[j];
					ds[j] = gan;
				}
			}
		}
	}

	public static void main(String[] args) {
        // danhSachNhomHocPhan a = new danhSachNhomHocPhan(), b = new danhSachNhomHocPhan();
        // // a.nhap();
        // // a.ghiFile();
        // b.docFile();
        // b.xuat();
    }
}
