package QuanLyThiTracNghiem;


public class cauHoi_BoDe extends abCauHoi {
    private String maBoDe;

    public cauHoi_BoDe() {

    }

    public cauHoi_BoDe( String maBoDe, String maCau, String noiDung) {
        super(maCau, noiDung);
        this.maBoDe = maBoDe;
    }

    public String getMaBoDe() {
        return this.maBoDe;
    }

    public void setMaBoDe(String maBoDe) {
        this.maBoDe = maBoDe;
    }


    @Override
    public String getPk(){
        return maCau+maBoDe;
    }

    public void nhap() {
        System.out.println("Nhap ma bo de cau hoi:");
        maBoDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap ma cau hoi:");
        maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        System.out.println("Nhap noi dung cau hoi:");
        noiDung = nhap.kiemTraChuoi();
    }

    @Override
    public void xuat() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-90s|\n",  maBoDe, maCau, noiDung);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void xuatDanhSach() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-90s|\n",  maBoDe, maCau, noiDung);
    }

    public void sua() {
        do {
            System.out.println("--------------------------");
            System.out.println("|   1. Ma bo de          |");
            System.out.println("|   2. Ma cau            |");
            System.out.println("--------------------------");
            System.out.println("Nhap thong tin can sua:");
            String menu = String.valueOf(nhap.kiemTraSo(1, 3));
            switch (menu.charAt(0)) {

                case '1': {
                    System.out.println("Nhap ma bo de moi:");
                    maBoDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                case '2': {
                    System.out.println("Nhap ma cau moi:");
                    maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    break;
                }

                default:
                    break;
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("Nhap t de thoat, bat ki phim nao de tiep tuc sua cau hoi(bo de).");
        } while (!nhap.kiemTraChuoi().toLowerCase().equals("t"));
    }

}
