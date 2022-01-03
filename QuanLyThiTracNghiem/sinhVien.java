package QuanLyThiTracNghiem;

public class sinhVien extends conNguoi {
    private String MSSV;

    public sinhVien() {
        super();
    }

    public sinhVien(String MSSV, String hoTen, String diaChi, date ngaySinh, String sdt, String gioiTinh) {
        super(hoTen, diaChi, ngaySinh, sdt, gioiTinh);
        this.MSSV = MSSV;
    }

    public String getMSSV() {
        return this.MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void xemdiem() {

    }

    public void xemDethi() {

    }

    @Override
    public String getPk(){
        return MSSV;
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-15s|%-15s|%-25s|%-20s|\n", MSSV, hoTen, queQuan,ngaySinh, sdt, gioiTinh);
    }

    @Override
    public void xuat() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-15s|%-15s|%-25s|%-20s|\n", "Ma sinh vien", "Ten", "Que quan", "Ngay sinh","So dien thoai", "Gioi tinh");
        // System.out.println("____________________________________________________________________________________________________________________");
        // System.out.printf("|%-14s | %-30s | %-12s | %-25s | %-12s | %-10s |\n", MSSV,
        // hoTen, ngaySinh, diaChi , sdt ,gioiTinh);
        this.xuatDanhSach();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "{" + " MSSV='" + getMSSV() + "'" + " hoTen='" + getHoTen() + "'" + ", queQuan='" + getQueQuan() + "'"
                + ", ngaySinh='" + getNgaySinh() + "'" + ", sdt='" + getSdt() + "'" + ", gioiTinh='" + getGioiTinh()
                + "'" + "}";
    }
    
    @Override
    public void nhap() {
        // System.out.println("Nhap ma so sinh vien: ");
        // MSSV = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        super.nhap();
    }

    @Override
    public void sua() {
        do {
            System.out.println("---------------------------");
            System.out.println("|   1. Ma so sinh vien    |");
            System.out.println("|   2. Ho ten             |");
            System.out.println("|   3. Que quan           |");
            System.out.println("|   4. Ngay sinh          |");
            System.out.println("|   5. So dien thoai      |");
            System.out.println("|   6. Gioi tinh          |");
            System.out.println("---------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 6));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap ma so sinh vien moi:");
                MSSV = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("Nhap ho ten moi:");
                hoTen = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                break;
            }

            case '3': {
                System.out.println("Nhap dia chi moi:");
                queQuan = nhap.kiemTraChuoi();
                break;
            }

            case '4': {
                System.out.println("Nhap so dien thoai moi:");
                ngaySinh.nhap();
                break;
            }
            case '5': {
                System.out.println("Nhap thoi gian moi:");
                sdt = nhap.kiemTraChuoi();
                ;
                break;
            }

            case '6': {
                System.out.println("Nhap gioi tinh moi:");
                gioiTinh = nhap.kiemTraSoDienThoai();
                break;
            }
            default:
                break;
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua cau hoi.");
        } while (!(nhap.kiemTraChuoi().equals("t")));
    }
    public static void main(String[] args) {
        sinhVien a=new sinhVien();
        a.nhap();
        a.xuat();
    }
}
