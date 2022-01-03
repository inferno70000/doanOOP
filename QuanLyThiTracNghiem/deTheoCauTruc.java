package QuanLyThiTracNghiem;

public class deTheoCauTruc extends boDe {
    private String maCauTruc;

    public deTheoCauTruc() {
        type="De Theo Cau Truc";
    }

    public deTheoCauTruc(String maDe, String hocPhan, int thoiGian, int soCau, String maCauTruc) {
        super(maDe, hocPhan, thoiGian, soCau);
        this.maCauTruc = maCauTruc;
        type="De Theo Cau Truc";
    }

    public String getMaCauTruc() {
        return this.maCauTruc;
    }

    public void setMaCauTruc(String maCauTruc) {
        this.maCauTruc = maCauTruc;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap ma cau truc de thi: ");
        maCauTruc = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.println("Ma cau truc de thi: " + maCauTruc);
        super.xuat();
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-25s|%-20s|\n", maDe, maHocPhan, thoiGian, soCau,maCauTruc,type);
    }

    @Override
    public void sua() {
        do {
            System.out.println("---------------------------------");
            System.out.println("|   1. Ma cau truc de thi       |");
            System.out.println("|   2. Ma de                    |");
            System.out.println("|   3. Ma hoc phan              |");
            System.out.println("|   4. Thoi gian                |");
            System.out.println("|   5. So cau                   |");
            System.out.println("---------------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 5));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap ma cau truc de thi moi:");
                maCauTruc = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("Nhap ma de moi:");
                maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '3': {
                System.out.println("Nhap ma hoc phan moi:");
                maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }
            case '4': {
                System.out.println("Nhap thoi gian moi:");
                thoiGian = nhap.kiemTraSo(1);
                break;
            }

            case '5': {
                System.out.println("Nhap so cau moi:");
                soCau = nhap.kiemTraSo(1);
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
        
    }
}
