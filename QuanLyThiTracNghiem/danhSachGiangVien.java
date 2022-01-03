package QuanLyThiTracNghiem;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class danhSachGiangVien implements iDanhSach, Serializable {
    private int soLuong;
    private giangVien[] ds;

    public danhSachGiangVien() {
    }

    public danhSachGiangVien(int soLuong, giangVien[] ds) {
        this.soLuong = soLuong;
        this.ds = ds;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public giangVien[] getDs() {
        return this.ds;
    }

    public void setDs(giangVien[] ds) {
        this.ds = ds;
    }

    public int soLuong() {
        return soLuong;
    }

    public giangVien at(int index) {
        return ds[index];
    }

    @Override
    public void docFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\data\\danhSachGiangVien.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(danhSachGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        //-------------------B2.Doc du lieu-------------------------------------
    
        try {
            danhSachGiangVien tmp=new danhSachGiangVien();
            tmp=(danhSachGiangVien)ois.readObject();
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
            fos = new FileOutputStream(".\\data\\danhSachGiangVien.txt");
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
            Logger.getLogger(danhSachGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(danhSachGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(danhSachGiangVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean kiemTraKhoaChinh(){

        return false;
    }
    public boolean kiemTraKhoaChinh(giangVien obj){
        for(int i=0;i<soLuong;i++){
            if(obj.getPk().equals(ds[i].getPk()))
                return false;
        }
        return true;
    }

    public void nhap() {
        System.out.println("Nhap so luong giang vien:");
        int n = nhap.kiemTraSo(0);
        ds = new giangVien[soLuong];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap giang vien thu: " + (i + 1));
            them();
        }
    }

    public void them() {
        giangVien tmp = new giangVien();
        tmp.nhap();
        them(tmp);
    }

    public void them(giangVien obj) {
        giangVien[] tmp = new giangVien[soLuong + 1];
        for (int i = 0; i < soLuong; i++) {
            tmp[i] = new giangVien();
            tmp[i] = ds[i];
        }
        tmp[soLuong] = new giangVien();
        tmp[soLuong] = obj;
        ds = tmp;
        soLuong++;
    }

    @Override
    public void xuat() {
        sapXep();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-25s|%-15s|%-25s|%-20s|\n", "Ma giang vien", "Ten", "Que quan ", "Ngay sinh",
                "So dien thoai", "Gioi tinh ");
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatDanhSach();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void xoa() {
        System.out.println("Nhap giang vien can xoa:");
        String maGv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoa(maGv);
    }

    public void xoa(String maGv) {
        int index = timKiem(maGv);
        if (index == -1) {
            System.out.println("Khong tim thay giang vien");
        } else {
            xoa(index);
        }
    }

    public void xoa(int i) {
        soLuong--;
        for (; i < soLuong; i++) {
            ds[i] = ds[i + 1];
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma giang vien can tim:");
        String maGv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = timKiem(maGv);
        if (index == -1) {
            System.out.println("Khong tim thay giang vien");
        } else {
            ds[index].xuat();
        }
    }

    public int timKiem(String maGv) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getmaGV().equals(maGv)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma so cau truc de thi can sua:");
        String maGV = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        sua(maGV);
    }

    public void sua(String maGv) {
        int index = timKiem(maGv);
        if (index == -1)
            System.out.println("Khong tim thay!!!");
        else {
            ds[index].sua();
        }
    }

    public void sua(giangVien giangVien) {
        sua(giangVien.getmaGV());
    }

    public int idNext(){
        int max=50321;
        for(int i=0;i<soLuong;i++){
            if(max< Integer.parseInt(ds[i].getmaGV())){
                max=Integer.parseInt(ds[i].getmaGV());
            }
        }
        return max+1;
    }

    public danhSachGiangVien timTheoTen(String ten){
        danhSachGiangVien result=new danhSachGiangVien();
        String regex=".*("+ten.toLowerCase()+")$";
        for(int i=0;i<soLuong();i++){
            if(ds[i].getHoTen().toLowerCase().matches(regex)==true){
                result.them(ds[i]);
            }
        }
        return result;
    }

    @Override
    public void sapXep() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i; j < soLuong; j++) {
                if (Integer.parseInt(ds[i].getmaGV()) > Integer.parseInt(ds[j].getmaGV())) {
                    giangVien tmp = ds[j];
                    ds[j] = ds[i];
                    ds[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // danhSachGiangVien a = new danhSachGiangVien(), b = new danhSachGiangVien();
        // // a.nhap();
        // // a.ghiFile();
        // b.docFile();
        // b.xuat();
    }
}
