package QuanLyThiTracNghiem;

public class giangVien extends conNguoi {

    private String maGV;

    public giangVien() {

    }

    public giangVien(String maGV, String hoTen, String queQuan, date ngaySinh, String sdt, String gioiTinh) {
        super(hoTen, queQuan, ngaySinh, sdt, gioiTinh);
        this.maGV = maGV;
    }

    public String getmaGV() {
        return this.maGV;
    }

    public void setmaGV(String maGV) {
        this.maGV = maGV;
    }

    public void taoDeThi() {

    }

    public void themCauHoi() {

    }

    public void taoKiThi() {

    }

    @Override
    public String getPk(){
        return maGV;
    }
    @Override
    public void nhap() {
    //     System.out.println("Nhap ma giang vien: ");
    //     maGV = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        super.nhap();
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-25s|%-15s|%-25s|%-20s|\n", maGV, hoTen, queQuan, ngaySinh, sdt, gioiTinh);
    }

    @Override
    public void xuat() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-25s|%-15s|%-25s|%-20s|\n", "MaGV", "Ho va Ten","Que quan", "Ngay sinh", "Dien Thoai", "Gioi tinh");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-25s|%-15s|%-25s|%-20s|\n", maGV, hoTen, queQuan, ngaySinh, sdt, gioiTinh);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "{" + " maGV='" + getmaGV() + "'" + " hoTen='" + getHoTen() + "'" + ", queQuan='" + getQueQuan() + "'"
                + ", ngaySinh='" + getNgaySinh() + "'" + ", sdt='" + getSdt() + "'" + ", gioiTinh='" + getGioiTinh()
                + "'" + "}";
    }

    @Override
    public void sua() {
        do {
            System.out.println("---------------------------");
            System.out.println("|   1. Ma giang vien      |");
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
                System.out.println("Nhap ma giang vien moi:");
                maGV = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("Nhap ho ten moi:");
                hoTen = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                break;
            }

            case '3': {
                System.out.println("Nhap que quan moi:");
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
                sdt = nhap.kiemTraSoDienThoai();
                ;
                break;
            }

            case '6': {
                System.out.println("Nhap gioi tinh moi:");
                gioiTinh = nhap.kiemTraGioiTinh();
                break;
            }
            default:
                break;
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua cau hoi.");
        } while (!(nhap.kiemTraChuoi().equals("t")));
    }
}
