package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachHocPhan implements iDanhSach, Serializable {
	private hocPhan[] ds;
	private int soLuong;

	public danhSachHocPhan() {

	}

	public danhSachHocPhan(int soLuong) {
		this.soLuong = soLuong;
		ds = new hocPhan[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap hoc phan thu " + (i + 1) + ":");
			ds[i] = new hocPhan();
			ds[i].nhap();
		}
	}

	public hocPhan[] getDs() {
		return ds;
	}

	public void setDs(hocPhan[] ds) {
		this.ds = ds;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public hocPhan at(int i) {
		return ds[i];
	}

	@Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachHocPhan.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachHocPhan tmp=new danhSachHocPhan();
            tmp=(danhSachHocPhan)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachHocPhan.txt");
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
            Logger.getLogger(danhSachHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


	@Override
	public void nhap() {
		System.out.println("Nhap so luong hoc phan: ");
		soLuong = nhap.kiemTraSo(0);
		ds = new hocPhan[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap hoc phan thu " + (i + 1) + ":");
			ds[i] = new hocPhan();
			ds[i].nhap();
		}
	}

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(hocPhan obj){
        return kiemTraKhoaChinh(obj.getPk());
    }

	public boolean kiemTraKhoaChinh(String Pk){
		for(int i=0;i<soLuong;i++){
            if(Pk.equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

	@Override
	public void xuat() {
		sapXep();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("|%-15s|%-30s|%-15s|%-15s| \n", " Ma hoc phan", " Ten hoc phan", " Ma khoa", " So tin chi");
		for (int i = 0; i < soLuong; i++) {
			ds[i].xuatDanhSach();
		}
		System.out.println("--------------------------------------------------------------------------------");
	}

	@Override
	public int soLuong() {
		return soLuong;
	}

	@Override
	public void them() {
		System.out.println("Nhap hoc phan thu " + (soLuong + 1) + ":");
		hocPhan tmp = new hocPhan();
		tmp.nhap();
		them(tmp);
	}

	public void them(hocPhan obj) {
		hocPhan arrnew[] = new hocPhan[soLuong + 1];
		for (int i = 0; i < soLuong; i++) {
			arrnew[i] = ds[i];
		}
		arrnew[soLuong] = new hocPhan();
		arrnew[soLuong] = obj;
		ds = arrnew;
		soLuong++;
	}

	@Override
	public void sua() {
		System.out.println("Nhap ma hoc phan can sua: ");
		String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		sua(maHocPhan);
	}

	public void sua(String maHocPhan) {
		int k = timKiem(maHocPhan);
		if (k == -1)
			System.out.println("Khong tim thay!!!");
		else
			ds[k].sua();
	}

	public void sua(hocPhan obj) {
		sua(obj.getMaHocPhan());
	}

	@Override
	public void xoa() {
		System.out.println("Nhap ma hoc phan can xoa: ");
		String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		xoa(maHocPhan);
	}

	public void xoa(String maXoa) {

		int k = timKiem(maXoa);
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

	public void xoa(hocPhan obj) {
		xoa(obj.getMaHocPhan());
	}

	@Override
	public void timKiem() {
		System.out.println("Nhap ma hoc phan can tim: ");
		String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		int k = timKiem(maHocPhan);
		if (k == -1)
			System.out.println("Khong tim thay");
		else
			ds[k].xuat();
	}

	public int timKiem(String maHocPhan) {
		for (int i = 0; i < soLuong; i++) {
			if (ds[i].getMaHocPhan().equals(maHocPhan)) {
				return i;
			}
		}
		return -1;
	}

	public int idNext(){
        int max=41022;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getMaHocPhan())){
                max=Integer.parseInt(ds[i].getMaHocPhan());
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
        // danhSachHocPhan a = new danhSachHocPhan(), b = new danhSachHocPhan();
        // // a.nhap();
        // // a.ghiFile();
        // b.docFile();
        // b.xuat();
    }
}
