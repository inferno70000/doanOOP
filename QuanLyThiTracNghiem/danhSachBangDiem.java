package QuanLyThiTracNghiem;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachBangDiem implements iDanhSach, Serializable {
	private bangDiem[] ds;
	private int soLuong;

	public danhSachBangDiem() {

	}

	public danhSachBangDiem(int soLuong) {
		this.soLuong = soLuong;
		ds = new bangDiem[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap danh sach bang diem thu " + (i + 1) + ":");	
			ds[i] = new bangDiem();
			ds[i].nhap();
		}
	}
	
	public bangDiem at(int i) {
		return ds[i];
	}

	public bangDiem[] getDs() {
		return ds;
	}

	public void setDs(bangDiem[] ds) {
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
            fis = new FileInputStream(".\\data\\danhSachBangDiem.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachBangDiem tmp=new danhSachBangDiem();
            tmp=(danhSachBangDiem)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachBangDiem.txt");
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
            Logger.getLogger(danhSachBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachBangDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


	@Override
	public void nhap() {
		System.out.println("Nhap so luong danh sach bang diem: ");
		soLuong = nhap.kiemTraSo(0);
		ds = new bangDiem[soLuong];
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap danh sach bang diem thu " + (i + 1) + ":");
			ds[i] = new bangDiem();
			ds[i].nhap();
		}
	}

	public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(bangDiem obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

	@Override
	public void xuat() {
		sapXep();
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("|%-17s|%-20s|%-15s|%-10s| \n", " Ma bang diem", " Ma sinh vien", " Nam hoc", " Hoc ki");
		for (int i = 0; i < soLuong; i++) {
			ds[i].xuatDanhSach();
		}		
		System.out.println("-------------------------------------------------------------------");
	}

	@Override
	public int soLuong() {
		return soLuong;
	}

	@Override
	public void them() {
		System.out.println("Nhap danh sach bang diem thu " + (soLuong + 1) + ":");
		bangDiem arrnew = new bangDiem();
		arrnew.nhap();
		them(arrnew);
	}

	public void them(bangDiem obj) {
		bangDiem arrnew[] = new bangDiem[soLuong + 1];
		for (int i = 0; i < soLuong; i++) {
			arrnew[i] = ds[i];
		}
		arrnew[soLuong] = new bangDiem();
		arrnew[soLuong] = obj;
		ds = arrnew;
		soLuong++;
	}

	@Override
	public void sua() {
		System.out.println("Nhap ma bang diem can sua: ");
		String maSua = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		sua(maSua);
	}

	public void sua(String maSua) {
		int k = timKiem(maSua);
		if (k == -1)
			System.out.println("Khong tim thay!!!");
		else
			ds[k].sua();
	}

	public void sua(bangDiem maSua) {
		sua(maSua.getMaBangDiem());
	}

	@Override
	public void xoa() {
		System.out.println("Nhap ma bang diem can xoa: ");
		String maXoa = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		xoa(maXoa);
	}

	public void xoa(String maXoa) {
		bangDiem[] arrxoa = new bangDiem[soLuong - 1];
		int k = timKiem(maXoa);
		if (k == -1) {
			System.out.println("Khong co ma de xoa");
			return;
		}
		for (int i = 0; i < soLuong - 1; i++) {
			if (i < k) {
				arrxoa[i] = ds[i];
			} else {
				arrxoa[i] = ds[i + 1];
			}
		}
		ds = arrxoa;
		soLuong--;
	}

	public void xoa(bangDiem maXoa) {
		xoa(maXoa.getMaBangDiem());
	}

	@Override
	public void timKiem() {
		System.out.println("Nhap ma bang diem can tim: ");
		String maTim = nhap.kiemTraMa(nhap.soLuongKyTuMa);
		int k = timKiem(maTim);
		if (k == -1)
			System.out.println("Khong tim thay");
		else
			ds[k].xuat();
	}

	public int timKiem(String maSv) {
		for (int i = 0; i < soLuong; i++) {
			if (ds[i].getMaSv().equals(maSv)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void sapXep() {
		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = i + 1; j < soLuong; j++) {
				if (Double.parseDouble(ds[i].getMaBangDiem()) > Double.parseDouble(ds[j].getMaBangDiem())) {
					bangDiem gan = ds[i];
					ds[i] = ds[j];
					ds[j] = gan;
				}
			}
		}
	}
    public int idNext(){
        int max=20021;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getMaBangDiem())){
                max=Integer.parseInt(ds[i].getMaBangDiem());
            }
        }
        return max+1;
    }
}
