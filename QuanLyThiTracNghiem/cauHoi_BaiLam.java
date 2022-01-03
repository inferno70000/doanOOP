package QuanLyThiTracNghiem;


public class cauHoi_BaiLam extends abCauHoi {
    private String maBaiLam;
    private char dapAnChon;

    public cauHoi_BaiLam() {

    }

    public cauHoi_BaiLam(String maCau, String noiDung, char dapAnChon, String maBaiLam) {
        super(maCau,noiDung);
        this.dapAnChon = dapAnChon;
        this.maBaiLam = maBaiLam;
    }

    public void setMaBaiLam(String maBaiLam) {
        this.maBaiLam = maBaiLam;
    }

    public String getMaBaiLam() {
        return this.maBaiLam;
    }

    public void setdapAnChon(char dapAnChon) {
        this.dapAnChon = dapAnChon;
    }

    public char getdapAnChon() {
        return dapAnChon;
    }

    public void nhap() {
        System.out.println("Nhap ma bai lam:");
        maBaiLam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma cau hoi:");
        maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap noi dung cau hoi:");
        noiDung = nhap.kiemTraChuoi();
        System.out.println("Nhap dap an duoc chon cua cau hoi:");
        dapAnChon = nhap.kiemTraLuaChon();
    }

    @Override
    public void xuat() {
        System.out.println("Ma cau hoi: " + maCau);
        System.out.println("Ma bai lam: " + maBaiLam);
        System.out.println("Ma bai lam: " + noiDung);
        System.out.println("Dap an duoc chon : " + dapAnChon);
    }

    @Override
    public String getPk(){
        return maCau+maBaiLam;
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("----------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-18s|\n", maBaiLam, maCau, dapAnChon);
    }

    public void sua() {
        do {
            System.out.println("--------------------------");
            System.out.println("|   1. Ma bai lam        |");
            System.out.println("|   2. Ma cau            |");
            System.out.println("|   3. Dap An Chon       |");
            System.out.println("--------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 3));
            switch (menu.charAt(0)) {
            case '1': {
                System.out.println("Nhap ma bai lam moi:");
                maBaiLam = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '2': {
                System.out.println("Nhap ma cau moi:");
                maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                break;
            }

            case '3': {
                System.out.println("Nhap dap an duoc chon moi:");
                dapAnChon = nhap.kiemTraLuaChon();
                break;
            }

            default:
                break;
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua nhom cau hoi.");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }



    public static void main(String[] args) {
        // giangVien sv = new giangVien("001","Van a","123","2002","23423","Nam");
        // System.out.println(sv);
        // System.out.println("Xuat:");
        // sv.xuat();
        // System.out.println("Xuat danh sach:");
        // sv.xuatDanhSach();
        // cauHoi_BaiLam tmp=new cauHoi_BaiLam();
        // System.out.println(tmp.getMaBaiLam());
    }
}
