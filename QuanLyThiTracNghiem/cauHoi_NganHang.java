package QuanLyThiTracNghiem;

public class cauHoi_NganHang extends abCauHoi {
    private String maNhom;

    public cauHoi_NganHang() {

    }

    public cauHoi_NganHang(String maCau, String noiDung, String maNhom) {
        super(maCau,noiDung);
        this.maNhom = maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public String getMaNhom() {
        return maNhom;
    }

    @Override
    public String getPk(){
        return maCau;
    }

    public void nhap() {
        System.out.println("Nhap ma cau hoi:");
        maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma nhom cau hoi:");
        maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap noi dung cau hoi:");
        noiDung = nhap.kiemTraChuoi();
    }

    @Override
    public void xuat() {
        System.out.println("Ma cau hoi: " + maCau);
        System.out.println("Noi dung cau hoi: " + noiDung);
        System.out.println("Ma nhom cau hoi: " + maNhom);
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-10s|%-100s|\n", maCau, maNhom, noiDung);
    }

    public void sua() {
        do {
            System.out.println("--------------------------");
            System.out.println("|   1. Ma cau            |");
            System.out.println("|   2. Ma nhom           |");
            System.out.println("|   3. Noi dung          |");
            System.out.println("--------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 3));
            switch (menu.charAt(0)) {
                case '1': {
                    System.out.println("Nhap ma cau moi:");
                    maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                case '2': {
                    System.out.println("Nhap ma bo de moi:");
                    maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                case '3': {
                    System.out.println("Nhap noi dung moi:");
                    noiDung = nhap.kiemTraChuoi();
                    break;
                }

                default:
                    break;
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua cau hoi(ngan hang cau hoi).");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));

    }

    public void sua(cauHoi_NganHang obj) {
        this.maCau = obj.maCau;
        this.noiDung = obj.noiDung;
        this.maNhom = obj.maNhom;
    }
}
