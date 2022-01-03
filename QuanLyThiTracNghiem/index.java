package QuanLyThiTracNghiem;

import java.math.*;

public class index {

    private String userCurent;
    private int hocKi = 1;
    private String namHoc = "2021";
    private String maKhoa = "80201";

    private danhSachBaiLam BaiLam = new danhSachBaiLam();
    private danhSachBangDiem BangDiem = new danhSachBangDiem();
    private danhSachBoDe BoDe = new danhSachBoDe();
    private danhSachCauHoiBaiLam CauHoiBaiLam = new danhSachCauHoiBaiLam();
    private danhSachCauHoiBoDe CauHoiBoDe = new danhSachCauHoiBoDe();
    private danhSachCauTrucDeThi CauTrucDeThi = new danhSachCauTrucDeThi();
    private danhSachChiTietCauTrucDeThi ChiTietCauTrucDeThi = new danhSachChiTietCauTrucDeThi();
    private danhSachChiTietDiem ChiTietDiem = new danhSachChiTietDiem();
    private danhSachChiTietNhom ChiTietNhom = new danhSachChiTietNhom();
    private danhSachChuong Chuong = new danhSachChuong();
    private danhSachGiangVien GiangVien = new danhSachGiangVien();
    private danhSachHocPhan HocPhan = new danhSachHocPhan();
    private danhSachLuaChon LuaChon = new danhSachLuaChon();
    private danhSachNhomCauHoi NhomCauHoi = new danhSachNhomCauHoi();
    private danhSachNhomHocPhan NhomHocPhan = new danhSachNhomHocPhan();
    private danhSachSinhVien SinhVien = new danhSachSinhVien();
    private nganHangCauHoi NganHangCauHoi = new nganHangCauHoi();
    private danhSachTaiKhoan TaiKhoan = new danhSachTaiKhoan();

    public void LuaChon() {
        danhSachLuaChon a = new danhSachLuaChon();
        a.them(new luaChon('a', "12001", "luon luon phai co de may tinh hoat dong", false));
        a.them(new luaChon('b', "12001", "dieu khien thiet bi phan cung ", false));
        a.them(new luaChon('c', "12001", "quan ly va phan phoi tai nguyen may tinh phuc vu cho cac ung dung", true));
        a.them(new luaChon('d', "12001", "Tat ca cac cau tren deu dung", false));

        a.them(new luaChon('a', "12002", "viec mo rong chuc nang se de dang ", false));
        a.them(new luaChon('b', "12002", "chi nhung chuc nang co ban moi duoc hien thuc trong kernel  ", false));
        a.them(new luaChon('c', "12002", "phan lon cac dich vu duoc hien thuc trong user space ", false));
        a.them(new luaChon('d', "12002",
                "giao tiep giua client va service duoc thuc hien thong qua co che shared memory ", true));

        a.them(new luaChon('a', "12003", "cac thanh ghi ", false));
        a.them(new luaChon('b', "12003", "stack", false));
        a.them(new luaChon('c', "12003", "vung nho trong bo nho chinh ", false));
        a.them(new luaChon('d', "12003", "Tat ca cac cau tren deu dung", true));

        a.them(new luaChon('a', "12004", "Chi phi quan ly cac process nho hon ", false));
        a.them(new luaChon('b', "12004", "Tang hieu suat cua CPU ", false));
        a.them(new luaChon('c', "12004", "Thoi gian dap ung response time nho hon", true));
        a.them(new luaChon('d', "12004", " Giam burst time cua process ", false));

        a.them(new luaChon('a', "12005", "dia chi bien a trong khong gian nho cua process ", true));
        a.them(new luaChon('b', "12005", "dia chi hien tai cua bien a trong RAM ", false));
        a.them(new luaChon('c', "12005", "dia chi thuc cua bien a ", false));
        a.them(new luaChon('d', "12005", "chua biet ", false));

        a.them(new luaChon('a', "12006", "mot phan tu trong ban trang ", false));
        a.them(new luaChon('b', "12006", "PR present bit  ", false));
        a.them(new luaChon('c', "12006", "PF page frame number ", true));
        a.them(new luaChon('d', "12006", "hai phan tu trong ban trang ", false));

        a.them(new luaChon('a', "12007", "khong con vung nho de chay chuong trinh ", false));
        a.them(new luaChon('b', "12007", "chuong trinh co kich thuoc lon hon vung nho ", true));
        a.them(new luaChon('c', "12007", "chuong trinh co kich thuoc nho hon vung nho ", false));
        a.them(new luaChon('d', "12007", "co vung nho de chay chuong trinh ", false));

        a.them(new luaChon('a', "12008", "tien hanh thu gom nhung Hole nho thanh Hole lon hon ", true));
        a.them(new luaChon('b', "12008", "loai bo bot mot so process ", false));
        a.them(new luaChon('c', "12008", "treo may ", false));
        a.them(new luaChon('d', "12008", "bo mot process ", false));

        a.them(new luaChon('a', "12009", "colspan", false));
        a.them(new luaChon('b', "12009", "td", true));
        a.them(new luaChon('c', "12009", "UL", false));
        a.them(new luaChon('d', "12009", "table", false));

        a.them(new luaChon('a', "12010", "body", true));
        a.them(new luaChon('b', "12010", "head ", false));
        a.them(new luaChon('c', "12010", "font", false));
        a.them(new luaChon('d', "12010", "title", false));

        a.them(new luaChon('a', "12011", "dl", false));
        a.them(new luaChon('b', "12011", "ol", true));
        a.them(new luaChon('c', "12011", "ul", false));
        a.them(new luaChon('d', "12011", "list", false));

        a.them(new luaChon('a', "12012", "ul type='circle'", true));
        a.them(new luaChon('b', "12012", "ul 'circle' ", false));
        a.them(new luaChon('c', "12012", "ul type='round'", false));
        a.them(new luaChon('d', "12012", "ul type='square'", false));

        a.them(new luaChon('a', "12013", "pic", false));
        a.them(new luaChon('b', "12013", "ser ", false));
        a.them(new luaChon('c', "12013", "img", true));
        a.them(new luaChon('d', "12013", "None", false));

        a.them(new luaChon('a', "12014", "Head", true));
        a.them(new luaChon('b', "12014", "Arm ", false));
        a.them(new luaChon('c', "12014", "Body", false));
        a.them(new luaChon('d', "12014", "title ", false));

        a.them(new luaChon('a', "12015", "colspan=n", false));
        a.them(new luaChon('b', "12015", "rowspan=n ", true));
        a.them(new luaChon('c', "12015", "Both rowspan=n and colspan=n", false));
        a.them(new luaChon('d', "12015", "None", false));

        a.them(new luaChon('a', "12016", "Hyper Text Markup Language", true));
        a.them(new luaChon('b', "12016", "Hyperlinks and Text Markup Language", false));
        a.them(new luaChon('c', "12016", "Home Tool Markup Language", false));
        a.them(new luaChon('d', "12016", "None", false));
        LuaChon = a;
    }

    public void NganHangCauHoi() {
        nganHangCauHoi a = new nganHangCauHoi();
        a.them(new cauHoi_NganHang("12001", "He dieu hanh la phan mem", "42001"));
        a.them(new cauHoi_NganHang("12002", "He dieu hanh kieu micro khong co dac trung sau", "42001"));
        a.them(new cauHoi_NganHang("12003", "Viec truyen tu ung dung den he dieu hanh co the thuc hien bang cach",
                "42002"));
        a.them(new cauHoi_NganHang("12004", "Uu diem chinh cua time sharing system so voi multiprogrammed system ",
                "42002"));
        a.them(new cauHoi_NganHang("12005", "Trong ngon ngu C a se cho biet ", "42003"));
        a.them(new cauHoi_NganHang("12006", "Mot trang bo nho duoc quan ly boi ", "42003"));
        a.them(new cauHoi_NganHang("12007", "Ky thuat Overlay duoc ap dung khi ", "42004"));
        a.them(new cauHoi_NganHang("12008", "Khi bo nho co hien tuong phan manh qua nhieu thi HDH se ", "42004"));
        a.them(new cauHoi_NganHang("12009", "What tag is used to add columns to tables ?", "42005"));
        a.them(new cauHoi_NganHang("12010", "Which tag  set the background color for your page ?", "42005"));
        a.them(new cauHoi_NganHang("12011", "How can you make a list that lists the items with numbers ?", "42006"));
        a.them(new cauHoi_NganHang("12012", "To start a list using circles use which of these tags ", "42006"));
        a.them(new cauHoi_NganHang("12013",
                "When you count to 15 using hexadecimal numbers, the highest number is what ?", "42007"));
        a.them(new cauHoi_NganHang("12014", "The title tag belongs where in your HTML ?", "42007"));
        a.them(new cauHoi_NganHang("12015", "Which property tells how many rows a cell should span ?", "42008"));
        a.them(new cauHoi_NganHang("12016", "What does HTML stand for ?", "42008"));
        NganHangCauHoi = a;
    }

    public void NhomCauHoi() {
        danhSachNhomCauHoi a = new danhSachNhomCauHoi();
        a.them(new nhomCauHoi("42001", "33001", "1"));
        a.them(new nhomCauHoi("42002", "33001", "2"));
        a.them(new nhomCauHoi("42003", "33002", "1"));
        a.them(new nhomCauHoi("42004", "33002", "2"));
        a.them(new nhomCauHoi("42005", "33003", "1"));
        a.them(new nhomCauHoi("42006", "33003", "2"));
        a.them(new nhomCauHoi("42007", "33004", "1"));
        a.them(new nhomCauHoi("42008", "33004", "2"));
        NhomCauHoi = a;
    }

    public void Chuong() {
        danhSachChuong a = new danhSachChuong();
        a.them(new chuong("33001", "hdh 01", "nhap mon hdh", "41022"));
        a.them(new chuong("33002", "hdh 02", "lam quen hdh", "41022"));
        a.them(new chuong("33003", "ltw 01", "nhap mon web", "41044"));
        a.them(new chuong("33004", "ltw 02", "lam quen web", "41044"));
        Chuong = a;
    }

    public void CauTrucDeThi() {
        danhSachCauTrucDeThi a = new danhSachCauTrucDeThi();
        a.them(new cauTrucDeThi("60521", 50, 1, "41022", 3));
        a.them(new cauTrucDeThi("60522", 60, 1, "41044", 3));
        CauTrucDeThi = a;
    }

    public void ChiTietCauTrucDeThi() {
        danhSachChiTietCauTrucDeThi a = new danhSachChiTietCauTrucDeThi();
        a.them(new chiTietCauTrucDeThi("60521", "33001", "1", 1));
        a.them(new chiTietCauTrucDeThi("60521", "33002", "2", 2));
        a.them(new chiTietCauTrucDeThi("60522", "33003", "1", 1));
        a.them(new chiTietCauTrucDeThi("60522", "33004", "2", 2));
        ChiTietCauTrucDeThi = a;
    }

    public void ChiTietNhom() {
        danhSachChiTietNhom a = new danhSachChiTietNhom();
        a.them(new chiTietNhom("30071", "10033"));
        a.them(new chiTietNhom("30071", "10060"));
        a.them(new chiTietNhom("30071", "10007"));
        a.them(new chiTietNhom("30072", "10085"));
        a.them(new chiTietNhom("30072", "10107"));
        a.them(new chiTietNhom("30072", "10121"));
        a.them(new chiTietNhom("30073", "10122"));
        a.them(new chiTietNhom("30073", "10128"));
        a.them(new chiTietNhom("30073", "10130"));
        a.them(new chiTietNhom("30073", "10132"));
        a.them(new chiTietNhom("30074", "10033"));
        a.them(new chiTietNhom("30074", "10060"));
        a.them(new chiTietNhom("30074", "10007"));
        a.them(new chiTietNhom("30075", "10085"));
        a.them(new chiTietNhom("30075", "10107"));
        a.them(new chiTietNhom("30075", "10121"));
        a.them(new chiTietNhom("30075", "10122"));
        a.them(new chiTietNhom("30076", "10128"));
        a.them(new chiTietNhom("30076", "10130"));
        a.them(new chiTietNhom("30077", "10033"));
        a.them(new chiTietNhom("30077", "10060"));
        a.them(new chiTietNhom("30078", "10132"));
        a.them(new chiTietNhom("30079", "10085"));
        ChiTietNhom = a;
    }

    public void GiangVien() {
        danhSachGiangVien a = new danhSachGiangVien();
        a.them(new giangVien("50991", "Nguyen Thanh Sang", "Ho Chi Minh", new date(9, 9, 1990), "0923471234", "nam"));
        a.them(new giangVien("50322", "Nguyen Quoc Huy", "Lam Dong", new date(3, 7, 1985), "0723482623", "nam"));
        a.them(new giangVien("50323", "Phan Tan Quoc", "Gia Lai", new date(6, 6, 1985), "0127436582", "nam"));
        a.them(new giangVien("50324", "Luong Minh Huan", "Binh Phuoc", new date(25, 03, 1991), "0913246723", "nam"));
        a.them(new giangVien("50325", "Vu Ngoc Thanh Sang", "Gia Lai", new date(7, 4, 1980), "0934787912", "nam"));
        GiangVien = a;
    }

    public void HocPhan() {
        danhSachHocPhan a = new danhSachHocPhan();
        a.them(new hocPhan("41022", "He dieu hanh", "80201", 3));
        a.them(new hocPhan("41044", "Lap trinh web", "80201", 4));
        a.them(new hocPhan("41108", "Cau truc du lieu", "80201", 4));
        a.them(new hocPhan("41404", "Mang may tinh", "80201", 3));
        a.them(new hocPhan("41109", "Co so du lieu", "80201", 4));
        HocPhan = a;
    }

    public void SinhVien() {
        danhSachSinhVien a = new danhSachSinhVien();
        a.them(new sinhVien("10033", "Nguyen Trieu Anh", "Bac Thai", new date(11, 4, 2002), "0974327432", "nam"));
        a.them(new sinhVien("10060", "Phan Van Bang", "Bac Thai", new date(9, 4, 2002), "0703247432", "nam"));
        a.them(new sinhVien("10007", "Tran Chi Cuong", "Lam Dong", new date(6, 7, 2002), "0947392375", "nam"));
        a.them(new sinhVien("10085", "Do Thanh Duy", "Dak Nong", new date(10, 10, 2002), "0934728741", "nam"));
        a.them(new sinhVien("10107", "Vu Van Dai", "Quang Ngai", new date(3, 4, 2002), "0709372821", "nam"));
        a.them(new sinhVien("10121", "Pham Quoc Dat", "Lam Dong", new date(20, 05, 2002), "0987612312", "nam"));
        a.them(new sinhVien("10122", "Tran Vinh Tan Dat", "Ninh Thuan", new date(21, 04, 2002), "0122789462", "nam"));
        a.them(new sinhVien("10128", "Nguyen Duc De", "Lam Dong", new date(5, 10, 2002), "0984283753", "nam"));
        a.them(new sinhVien("10130", "Nguyen Ngoc Dinh", "Quang Ninh", new date(29, 10, 2002), "0924728148", "nam"));
        a.them(new sinhVien("10132", "Nguyen Hieu Dong", "Dak Lak", new date(13, 01, 2002), "0122375284", "nam"));
        SinhVien = a;
    }

    public void NhomHocPhan() {
        danhSachNhomHocPhan a = new danhSachNhomHocPhan();
        a.them(new nhomHocPhan("30071", "41022", 3));
        a.them(new nhomHocPhan("30072", "41022", 3));
        a.them(new nhomHocPhan("30073", "41044", 4));
        a.them(new nhomHocPhan("30074", "41044", 3));
        a.them(new nhomHocPhan("30075", "41404", 4));
        a.them(new nhomHocPhan("30076", "41404", 2));
        a.them(new nhomHocPhan("30077", "41404", 2));
        a.them(new nhomHocPhan("30078", "41109", 1));
        a.them(new nhomHocPhan("30079", "41109", 1));
        NhomHocPhan = a;
    }

    public void BaiLam() {
    danhSachBaiLam a = new danhSachBaiLam();
    a.them(new baiLam("78324", "86821", 1, "41022", "10033", 5));
    a.them(new baiLam("78325", "86822", 1, "41044", "10060", 5));
    a.them(new baiLam("78326", "86821", 1, "41022", "10007", 5));
    a.them(new baiLam("78327", "86822", 1, "41022", "10085", 5));
    a.them(new baiLam("78328", "86822", 1, "41044", "10107", 5));
    BaiLam = a;
    }

    public void CauHoiBaiLam() {
        danhSachCauHoiBaiLam a = new danhSachCauHoiBaiLam();
        a.them(new cauHoi_BaiLam("12001",	"quan ly va phan phoi tai nguyen may tinh phuc vu cho cac ung dung", 'c', "78324"));
        a.them(new cauHoi_BaiLam("12002",	"giao tiep giua client va service duoc thuc hien thong qua co che shared memory", 'd', "78324"));
        a.them(new cauHoi_BaiLam("12003",	"vung nho trong bo nho chinh", 'c', "78324"));
        a.them(new cauHoi_BaiLam("12016",	"None", 'd', "78325"));
        a.them(new cauHoi_BaiLam("12012",	"ul type='circle'", 'a', "78325"));
        a.them(new cauHoi_BaiLam("12015",	"colspan=n", 'a', "78325"));
        a.them(new cauHoi_BaiLam("12001",	"quan ly va phan phoi tai nguyen may tinh phuc vu cho cac ung dung", 'c', "78326"));
        a.them(new cauHoi_BaiLam("12002",	"giao tiep giua client va service duoc thuc hien thong qua co che shared memory", 'd', "78326"));
        a.them(new cauHoi_BaiLam("12003",	"Tat ca cac cau tren deu dung", 'd', "78326"));
        a.them(new cauHoi_BaiLam("12016",	"Hyper Text Markup Language", 'a', "78327"));
        a.them(new cauHoi_BaiLam("12012",	"ul type='circle'", 'a', "78327"));
        a.them(new cauHoi_BaiLam("12015",	"rowspan=n", 'b', "78327"));
        a.them(new cauHoi_BaiLam("12016",	"None", 'd', "78328"));
        a.them(new cauHoi_BaiLam("12012",	"ul 'circle'", 'b', "78328"));
        a.them(new cauHoi_BaiLam("12015",	"colspan=n", 'a', "78328"));
        CauHoiBaiLam = a;
    }

    public void BoDe() {
        danhSachBoDe a = new danhSachBoDe();
        a.them((boDe) (new deTuTao("86821", "41022", 50, 3, "50324")));
        a.them((boDe) (new deTuTao("86822", "41044", 60, 3, "50321")));
        BoDe = a;
    }

    public void CauHoiBoDe() {
        danhSachCauHoiBoDe a = new danhSachCauHoiBoDe();
        a.them(new cauHoi_BoDe("86821", "12015", "Which property tells how many rows a cell should span ?"));
        a.them(new cauHoi_BoDe("86821", "12016", "What does HTML stand for ?"));
        a.them(new cauHoi_BoDe("86821", "12012", "To start a list using circles use which of these tags "));
        a.them(new cauHoi_BoDe("86822", "12001", "He dieu hanh la phan mem"));
        a.them(new cauHoi_BoDe("86822", "12002", "He dieu hanh kieu micro khong co dac trung sau"));
        a.them(new cauHoi_BoDe("86822", "12003",
                "Viec truyen tu ung dung den he dieu hanh co the thuc hien bang cach"));
        CauHoiBoDe = a;
    }

    public void taoBangDiem() {
        BangDiem = new danhSachBangDiem();
        for (int i = 0; i < SinhVien.soLuong(); i++) {
            bangDiem tmp = new bangDiem(Integer.toString(BangDiem.idNext()), SinhVien.at(i).getMSSV(), namHoc, hocKi);
            BangDiem.them(tmp);
        }
    }

    public void taoLaiTaiKhoan() {
        TaiKhoan = new danhSachTaiKhoan();
        taiKhoan admin = new taiKhoan("admin", "admin", "admin");
        TaiKhoan.them(admin);
        for (int i = 0; i < SinhVien.soLuong(); i++) {
            sinhVien sv = SinhVien.at(i);
            String pass = Integer.toString(sv.getNgaySinh().getNgay()) + Integer.toString(sv.getNgaySinh().getThang())
                    + Integer.toString(sv.getNgaySinh().getNam());
            taiKhoan tmp = new taiKhoan(sv.getMSSV(), pass, "sv");
            TaiKhoan.them(tmp);
        }
        for (int i = 0; i < GiangVien.soLuong(); i++) {
            giangVien gv = GiangVien.at(i);
            String pass = Integer.toString(gv.getNgaySinh().getNgay()) + Integer.toString(gv.getNgaySinh().getThang())
                    + Integer.toString(gv.getNgaySinh().getNam());
            taiKhoan tmp = new taiKhoan(gv.getmaGV(), pass, "gv");
            TaiKhoan.them(tmp);
        }
    }

    public void updateNhomHocPhan() {
        // Cap nhan so luong nhom Hoc phan
        for (int j = 0; j < NhomHocPhan.soLuong(); j++) {
            int cnt = 0;
            for (int i = 0; i < ChiTietNhom.soLuong(); i++) {
                if (ChiTietNhom.at(i).getMaNhom().equals(NhomHocPhan.at(j).getMaNhom())) {
                    cnt++;
                }
            }
            NhomHocPhan.at(j).setSoLuong(cnt);
        }
    }


    public void updateCauTrucDeThi() {
        for (int i = 0; i < CauTrucDeThi.soLuong(); i++) {
            int sum = 0;
            for (int j = 0; j < ChiTietCauTrucDeThi.soLuong(); j++) {
                if (ChiTietCauTrucDeThi.at(j).getMaDe().equals(CauTrucDeThi.at(i).getMaCauTrucDeThi())) {
                    sum += ChiTietCauTrucDeThi.at(j).getSoCau();
                }
            }
            CauTrucDeThi.at(i).setSoCau(sum);
        }
    }

    public void updateDiem() {
        taoBangDiem();
        ChiTietDiem =new danhSachChiTietDiem();
        for (int i = 0; i < BaiLam.soLuong(); i++) {
            chamBai(BaiLam.at(i).getMaBailam());
        }
    }

    public void Init() {
        LuaChon();
        NganHangCauHoi();
        NhomCauHoi();
        Chuong();
        CauTrucDeThi();
        ChiTietCauTrucDeThi();
        ChiTietNhom();
        GiangVien();
        HocPhan();
        SinhVien();
        NhomHocPhan();
        BaiLam();
        CauHoiBaiLam();

        BoDe();
        CauHoiBoDe();
        taoBangDiem();
        taoLaiTaiKhoan();
        updateNhomHocPhan();
        updateCauTrucDeThi();
        updateDiem();
    }

    public void docFile() {
        BaiLam.docFile();
        CauHoiBaiLam.docFile();

        BangDiem.docFile();
        ChiTietDiem.docFile();

        CauHoiBoDe.docFile();
        BoDe.docFile();
        CauTrucDeThi.docFile();
        ChiTietCauTrucDeThi.docFile();
        NganHangCauHoi.docFile();
        NhomCauHoi.docFile();
        Chuong.docFile();
        LuaChon.docFile();

        ChiTietNhom.docFile();
        GiangVien.docFile();
        HocPhan.docFile();
        SinhVien.docFile();
        NhomHocPhan.docFile();
        TaiKhoan.docFile();
    }

    public void ghiFile() {
        BaiLam.ghiFile();
        BangDiem.ghiFile();
        BoDe.ghiFile();
        CauHoiBaiLam.ghiFile();
        CauHoiBoDe.ghiFile();
        CauTrucDeThi.ghiFile();
        ChiTietCauTrucDeThi.ghiFile();
        ChiTietDiem.ghiFile();
        ChiTietNhom.ghiFile();
        Chuong.ghiFile();
        GiangVien.ghiFile();
        HocPhan.ghiFile();
        LuaChon.ghiFile();
        NhomCauHoi.ghiFile();
        SinhVien.ghiFile();
        NganHangCauHoi.ghiFile();
        TaiKhoan.ghiFile();
        NhomHocPhan.ghiFile();
    }

    public void menuChinh() {
        do {
            System.out.println("        Menu ");
            System.out.println("-----------------------------------");
            System.out.println("|   1.Xem thong tin               |");
            System.out.println("|   2.Dang nhap                   |");
            System.out.println("|   3.Thoat                       |");
            System.out.println("-----------------------------------");
            System.out.println("Nhap lua chon cua ban.");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    xemThongTin();
                    break;

                case 2:
                    dangNhap();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        } while (true);
    }

    public void thayDoiNam_HocKi() {
        System.out.println("Nhap nam hoc: ");
        namHoc = Integer.toString(nhap.kiemTraSo(2020));
        System.out.println("Nhap hoc ki: ");
        hocKi = nhap.kiemTraSo(1, 3);
        nhap.waiting();
    }

    public void xemThongTin() {
        while (true) {
            System.out.println("    Thong tin      ");
            System.out.println("---------------------");
            System.out.println("|  1.Giang vien     |");
            System.out.println("|  2.Sinh vien      |");
            System.out.println("|  3.Hoc phan       |");
            System.out.println("|  4.Nhom hoc phan  |");
            System.out.println("|  5.Thoat          |");
            System.out.println("---------------------");
            System.out.println("Nhap lua chon cua ban.");
            int luachon = nhap.kiemTraSo(1, 5);
            switch (luachon) {
                case 1:
                    xemGiangVien();
                    break;

                case 2:
                    xemSinhVien();
                    break;
                case 3:
                    xemHocPhan();
                    break;
                case 4:
                    xemNhomMonHoc();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }

    public void xemGiangVien() {
        GiangVien.xuat();
        nhap.waiting();
    }

    public void xemHocPhan() {
        HocPhan.xuat();
        nhap.waiting();
    }

    public void xemNhomMonHoc() {
        updateNhomHocPhan();
        while (true) {
            System.out.println("    Nhom hoc phan");
            System.out.println("--------------------------");
            System.out.println("|   1.Xem tat ca         |");
            System.out.println("|   2.Xem theo hoc phan  |");
            System.out.println("|   3.Thoat              |");
            System.out.println("--------------------------");
            System.out.println("Nhap lua chon cua ban.");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    NhomHocPhan.xuat();
                    nhap.waiting();
                    break;

                case 2:
                    xemNhomTheoHocPhan();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }

    }

    public void xemNhomTheoHocPhan() {
        System.out.println("Nhap ma hoc phan: ");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = HocPhan.timKiem(maHocPhan);
        if (index == -1) {
            System.out.println("Hoc phan khong ton tai");
            return;
        }
        danhSachNhomHocPhan tmp = new danhSachNhomHocPhan();
        for (int i = 0; i < NhomHocPhan.soLuong(); i++) {
            if (NhomHocPhan.at(i).getMaHocPhan().equals(maHocPhan)) {
                tmp.them(NhomHocPhan.at(i));
            }
        }
        if (tmp.soLuong() == 0) {
            System.out.printf("Hoc phan %s khong co nhom hoc phan nao duoc mo.\n", maHocPhan);
        } else {
            tmp.xuat();
        }
        nhap.waiting();
    }

    public void xemSinhVien() {
        while (true) {
            System.out.println(" Xem thong tin sinh vien      ");
            System.out.println("--------------------------");
            System.out.println("|  1.Xem tat ca           |");
            System.out.println("|  2.Xem theo hoc phan    |");
            System.out.println("|  3.Xem theo nhom        |");
            System.out.println("|  4.Tim kiem             |");
            System.out.println("|  5.Thoat                |");
            System.out.println("--------------------------");
            System.out.println("Nhap lua chon cua ban.");
            int luachon = nhap.kiemTraSo(1, 5);
            switch (luachon) {
                case 1:
                    SinhVien.xuat();
                    nhap.waiting();
                    break;
                case 2:
                    xemSinhVienTheoHocPhan();
                    break;
                case 3:
                    xemSinhVienTheoNhom();
                    break;
                case 4:
                    timSinhVien();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }

    public void timSinhVien() {
        while (true) {
            System.out.println("          Tim sinh vien   ");
            System.out.println("-----------------------------------");
            System.out.println("|   1.Tim theo ten                |");
            System.out.println("|   2.Tim theo ma so sinh vien    |");
            System.out.println("|   3.Thoat                       |");
            System.out.println("-----------------------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    SinhVien.timTheoTen();
                    nhap.waiting();
                    break;

                case 2:
                    SinhVien.timKiem();
                    nhap.waiting();
                    break;

                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public void xemSinhVienTheoNhom() {
        System.out.println("Nhap ma nhom:");
        String maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = NhomHocPhan.timKiem(maNhom);
        if (index == -1) {
            System.out.println("Ma nhom khong ton tai!!");
        } else {
            xemSinhVienTheoNhom(maNhom);
        }
        nhap.waiting();
    }

    public void xemSinhVienTheoNhom(String maNhom) {
        danhSachSinhVien tmp = new danhSachSinhVien();
        for (int i = 0; i < ChiTietNhom.getSoLuong(); i++) {
            if (ChiTietNhom.at(i).getMaNhom().equals(maNhom)) {
                tmp.them(SinhVien.at(SinhVien.timKiem(ChiTietNhom.at(i).getMaSv())));
            }
        }
        if (tmp.soLuong() != 0) {
            System.out.println("Thong tin nhom:" + maNhom);
            tmp.xuat();
        } else {
            System.out.printf("Ma nhom %s khong co sinh vien nao \n", maNhom);
        }
    }

    public void xemSinhVienTheoHocPhan() {
        System.out.println("Nhap ma hoc phan:");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = HocPhan.timKiem(maHocPhan);
        if (index == -1) {
            System.out.println("Ma hoc phan nay khong ton tai!!");
        } else {
            for (int i = 0; i < NhomHocPhan.soLuong(); i++) {
                if (NhomHocPhan.at(i).getMaHocPhan().equals(maHocPhan)) {
                    xemSinhVienTheoNhom(NhomHocPhan.at(i).getMaNhom());
                }
            }
        }
        nhap.waiting();
    }

    public void dangNhap() {
        System.out.println("Dang nhap");
        System.out.println("Nhap ma so ca nhan:");
        String id = nhap.kiemTraChuoi();
        System.out.println("Nhap mat khau:");
        String pass = nhap.nhapMk();
        int index = TaiKhoan.timKiem(id);
        if (index == -1) {
            System.out.println("Tai khoan khong ton tai!!!");
            nhap.waiting();
            return;
        }
        if (TaiKhoan.at(index).getPass().equals(pass)) {
            userCurent = id;
            switch (TaiKhoan.at(index).getType()) {
                case "sv":
                    menuSv();
                    break;
                case "gv":
                    menuGv();
                    break;
                case "admin":
                    menuAdmin();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Sai mat khau !!!");
            nhap.waiting();
        }

    }

    public void doiMatKhau() {
        System.out.println("Nhap mat khau cu:");
        String mkcu = nhap.nhapMk();
        int index = TaiKhoan.timKiem(userCurent);
        if (TaiKhoan.at(index).getPass().equals(mkcu)) {
            System.out.println("Nhap mat khau moi:");
            String mkmoi1 = nhap.nhapMk();
            System.out.println("Nhap lai mat khau moi:");
            String mkmoi2 = nhap.nhapMk();
            if (mkmoi1.equals(mkmoi2)) {
                TaiKhoan.at(index).setPass(mkmoi1);
                System.out.println("Doi mat khau thanh cong.");
            } else {
                System.out.println("Mat khau khong khop!!");
            }
        } else {
            System.out.println("Mat khau khong dung!!!");
        }
        nhap.waiting();
    }

    /**
     * in ra man hinh menu Sinh vien
     */
    public void menuSv() {
        while (true) {
            SinhVien.at(SinhVien.timKiem(userCurent)).xuat();
            System.out.println("Menu Sinh Vien");
            System.out.println("--------------------------------");
            System.out.println("|    1.Xem diem                 |");
            System.out.println("|    2.Lam bai kiem tra         |");
            System.out.println("|    3.Xem lai bai lam          |");
            System.out.println("|    4.Doi thong tin ca nhan    |");
            System.out.println("|    5.Thoat                    |");
            System.out.println("--------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 5);
            switch (luachon) {
                case 1:
                    xemDiem();
                    break;
                case 2:
                    lamBaiKiemTra();
                    break;
                case 3:
                    xemBaiLamSv();
                    break;
                case 4:
                    doiThongTinSV(userCurent);
                    break;
                case 5:
                    return;

                default:
                    break;
            }
        }
    }

    public void xemBaiLamSv(){
        String maSv=userCurent;
        System.out.println("Nhap ma bo de:");
        String maDe=nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if(BoDe.timKiem(maDe)==-1){
            System.out.println("Ma de khong ton tai!!");
            nhap.waiting();
            return;
        }
        
        if(BaiLam.timKiem(maSv,maDe)==-1){
            System.out.println("Sinh vien chua lam de nay!!");
            nhap.waiting();
            return;
        }
        System.out.println("          ================De=================         ");
        danhSachCauHoiBoDe De = CauHoiBoDe.timKiem(maDe);
        for (int j = 0; j < De.soLuong(); j++) {
            System.out.printf("Cau %d :\n", j + 1);
            System.out.println();
            De.at(j).xuat();
            LuaChon.timKiemTheoCauHoi(De.at(j).getMaCau()).xuatLuaChon();
            System.out.println();
        }
        BaiLam.at(BaiLam.timKiem(maSv, maDe)).xuat();
        CauHoiBaiLam.timKiem(BaiLam.at(BaiLam.timKiem(maSv, maDe)).getMaBailam());
        nhap.waiting();
    }

    public void xemDiem() {
        SinhVien.at(SinhVien.timKiem(userCurent)).xuat();
        danhSachChiTietDiem tmp = new danhSachChiTietDiem();
        for (int i = 0; i < BangDiem.soLuong(); i++) {
            if (BangDiem.at(i).getMaSv().equals(userCurent)) {
                BangDiem.at(i).xuat();
                for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
                    if (ChiTietDiem.at(j).getMaBangDiem().equals((BangDiem.at(i).getMaBangDiem()))) {
                        tmp.them(ChiTietDiem.at(j));
                    }
                }
                break;
            }
        }
        if (tmp.soLuong() == 0) {
            System.out.println("Sinh vien chua co diem!!");
        } else {
            tmp.xuat();
        }
        nhap.waiting();
    }

    public void lamBaiKiemTra() {
        System.out.println("Nhap ma de:");
        String maDe = nhap.kiemTraChuoi(nhap.soLuongKyTuMa);
        int index = BoDe.timKiem(maDe);
        if (index == -1) {
            System.out.println("Ma de khong ton tai!!");
            nhap.waiting();
            return;
        }
        for (int i = 0; i < BaiLam.soLuong(); i++) {
            if (BaiLam.at(i).getMaDe().equals(maDe) && BaiLam.at(i).getMssv().equals(userCurent)) {
                System.out.println("Sinh vien da lam ma de nay, khong the lam lai!!!");
                nhap.waiting();
                return;
            }
        }
        final long startTime = System.currentTimeMillis();

        String maHocPhan = BoDe.at(index).maHocPhan;
        String maBaiLam = Integer.toString(BaiLam.idNext());
        BoDe.at(index).xuat();
        danhSachCauHoiBoDe De = CauHoiBoDe.timKiem(maDe);
        for (int j = 0; j < De.soLuong(); j++) {
            System.out.printf("Cau %d :\n", j + 1);
            System.out.println();
            De.at(j).xuat();
            LuaChon.timKiemTheoCauHoi(De.at(j).getMaCau()).xuatLuaChon();
            System.out.println();
        }
        for (int i = 0; i < De.soLuong(); i++) {
            String maCau = De.at(i).getMaCau();
            String noiDung = De.at(i).getNoiDung();
            System.out.printf("Nhap cau tra loi cho cau %s :\n", maCau);
            char luaChon = nhap.kiemTraLuaChon();
            CauHoiBaiLam.them(new cauHoi_BaiLam(maCau, noiDung, luaChon, maBaiLam));
        }
        boolean Found = true;
        while (Found) {
            System.out.println("-----------------------");
            System.out.println("|   1.Sua bai lam    |");
            System.out.println("|   2.Nop bai        |");
            System.out.println("-----------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int luachon = nhap.kiemTraSo(1, 2);
            switch (luachon) {
                case 1:
                    System.out.println("Nhap ma cau muon sua: ");
                    String maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    int i = De.timKiem(maDe, maCau);
                    if (i == -1) {
                        System.out.println("Ma cau khong ton tai trong de!!");
                    } else {

                        System.out.printf("Nhap cau tra loi cho cau %s :\n", maCau);
                        char luaChon = nhap.kiemTraLuaChon();

                        CauHoiBaiLam.at(CauHoiBaiLam.timKiem(maBaiLam, maCau)).setdapAnChon(luaChon);
                    }
                    nhap.waiting();
                    break;

                case 2:
                    Found = false;
                    break;
                default:
                    break;
            }

        }
        final long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        BaiLam.them(new baiLam(maBaiLam, maDe, hocKi, maHocPhan, userCurent, time));
        float diem = chamBai(maBaiLam);
        System.out.println("Diem: " + diem);

        nhap.waiting();

    }

    public float chamBai(String maBaiLam) {
        float diem = 0;
        baiLam tmp = BaiLam.at(BaiLam.timKiem(maBaiLam));
        long timeLimit = BoDe.at(BoDe.timKiem(tmp.getMaDe())).getThoiGian() * 60000;
        if (tmp.getThoiGianLamBai() > timeLimit) {
            return 0;
        }
        double diemMoiCau = 10.0 / (BoDe.at(BoDe.timKiem(tmp.getMaDe())).soCau);
        for (int i = 0; i < CauHoiBaiLam.soLuong(); i++) {
            if (CauHoiBaiLam.at(i).getMaBaiLam().equals(maBaiLam)) {
                String maCau = CauHoiBaiLam.at(i).getMaCau();
                danhSachLuaChon dapAn = LuaChon.timKiemTheoCauHoi(maCau);
                for (int j = 0; j < dapAn.soLuong(); j++) {
                    if (dapAn.at(j).getMaLuaChon() == CauHoiBaiLam.at(i).getdapAnChon()) {
                        if (dapAn.at(j).getDapAn()) {
                            diem += diemMoiCau;
                        }
                    }
                }
            }
        }
        String maBangDiem = BangDiem.at(BangDiem.timKiem(tmp.getMssv())).getMaBangDiem();
        ChiTietDiem.them(new chiTietDiem(maBangDiem, tmp.getMaDe(), tmp.getHocPhan(), diem));
        return diem;
    }

    public void doiThongTinSV(String maSV) {
        while (true) {
            System.out.println("   Thay doi thong tin ca nhan");
            System.out.println("----------------------------------");
            System.out.println("|   1.Ho va Ten                  |");
            System.out.println("|   2.Que quan                   |");
            System.out.println("|   3.Ngay sinh                  |");
            System.out.println("|   4.So dien thoai              |");
            System.out.println("|   5.Gioi tinh                  |");
            System.out.println("|   6.Mat khau                   |");
            System.out.println("|   7.Thoat                      |");
            System.out.println("----------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 7);
            switch (luachon) {
                case 1:
                    System.out.println("Nhap Ho va ten: ");
                    String hoTen = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                    SinhVien.at(SinhVien.timKiem(maSV)).setHoTen(hoTen);
                    break;
                case 2:
                    System.out.println("Nhap que quan: ");
                    String queQuan = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                    SinhVien.at(SinhVien.timKiem(maSV)).setQueQuan(queQuan);
                    break;
                case 3:
                    date ngaySinh = new date();
                    ngaySinh.nhap();
                    SinhVien.at(SinhVien.timKiem(maSV)).setNgaySinh(ngaySinh);
                    break;
                case 4:
                    System.out.println("Nhap so dien thoai: ");
                    String sdt = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                    SinhVien.at(SinhVien.timKiem(maSV)).setSdt(sdt);
                    break;
                case 5:
                    System.out.println("Nhap gioi tinh: ");
                    String gioiTinh = nhap.kiemTraGioiTinh();
                    SinhVien.at(SinhVien.timKiem(maSV)).setGioiTinh(gioiTinh);
                    break;
                case 6:
                    doiMatKhau();
                    break;
                case 7:
                    return;
                default:
                    break;
            }
        }
    }

    public void menuGv() {
        while (true) {
            GiangVien.at(GiangVien.timKiem(userCurent)).xuat();
            System.out.println("       Menu Giang Vien");
            System.out.println("--------------------------------------");
            System.out.println("|    1.De thi                        |");
            System.out.println("|    2.Cau truc de                   |");
            System.out.println("|    3.Cau hoi                       |");
            System.out.println("|    4.Xem diem                      |");
            System.out.println("|    5.Xem bai lam                   |");
            System.out.println("|    6.Doi thong tin ca nhan         |");
            System.out.println("|    7.Doi nam hoc,hoc ki            |");
            System.out.println("|    8.Thoat                         |");
            System.out.println("--------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 8);
            switch (luachon) {
                case 1:
                    menuDeThi();
                    break;
                case 2:
                    menuCauTrucDe();
                    break;
                case 3:
                    menuCauHoi();
                    break;
                case 4:
                    xemDiemGv();
                    break;

                case 5:
                    xemBaiLam();
                    break;
                case 6:
                    doiThongTinGV(userCurent);
                    break;
                case 7:
                    thayDoiNam_HocKi();
                    break;
                case 8:
                    return;
                default:
                    break;
            }
        }

    }

    public void xemBaiLam(){
        System.out.println("Nhap ma sinh vien: ");
        String maSv=nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if(SinhVien.timKiem(maSv)==-1){
            System.out.println("Ma sinh vien khong ton tai!!");
            nhap.waiting();
            return;
        }
        danhSachBaiLam tmp = BaiLam.timKiemTheoSinhVien(maSv);
        if(tmp.soLuong()==0){
            System.out.println("Sinh vien khong co bai lam!!");
            nhap.waiting();
            return ;
        }
        System.out.println("Danh sach bai lam cua sinh vien");
        tmp.xuat();
        System.out.println("Nhap ma bo de:");
        String maDe=nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if(BoDe.timKiem(maDe)==-1){
            System.out.println("Ma de khong ton tai!!");
            nhap.waiting();
            return;
        }
        
        if(BaiLam.timKiem(maSv,maDe)==-1){
            System.out.println("Sinh vien chua lam de nay!!");
            nhap.waiting();
            return;
        }
        System.out.println("          ================De=================         ");
        danhSachCauHoiBoDe De = CauHoiBoDe.timKiem(maDe);
        for (int j = 0; j < De.soLuong(); j++) {
            System.out.printf("Cau %d :\n", j + 1);
            System.out.println();
            De.at(j).xuat();
            LuaChon.timKiemTheoCauHoi(De.at(j).getMaCau()).xuat();
            System.out.println();
        }
        BaiLam.at(BaiLam.timKiem(maSv, maDe)).xuat();
        CauHoiBaiLam.timKiem(BaiLam.at(BaiLam.timKiem(maSv, maDe)).getMaBailam());
        nhap.waiting();
    }

    public void menuCauTrucDe() {
        while (true) {
            System.out.println("   Cau truc de thi ");
            System.out.println("-----------------------------");
            System.out.println("|   1.Xem cau truc de thi   |");
            System.out.println("|   2.Them cau truc de thi  |");
            System.out.println("|   3.Xoa cau truc de thi   |");
            System.out.println("|   4.Sua cau truc de thi   |");
            System.out.println("|   5.Thoat                 |");
            System.out.println("-----------------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int luachon = nhap.kiemTraSo(1, 5);
            switch (luachon) {
                case 1:
                    xemCauTrucDe();
                    break;
                case 2:
                    themCauTrucDe();
                    break;
                case 3:
                    xoaCauTrucDe();
                    break;
                case 4:
                    suaCauTrucDe();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }

    public void menuDeThi() {
        System.out.println("    De Thi  ");
        System.out.println("---------------------");
        System.out.println("|   1.Xem de thi   |");
        System.out.println("|   2.Them de thi  |");
        System.out.println("|   3.Xoa de thi   |");
        System.out.println("|   4.Sua de thi   |");
        System.out.println("|   5.Thoat        |");
        System.out.println("---------------------");
        System.out.println("Nhap lua chon cua ban: ");
        int luachon = nhap.kiemTraSo(1, 5);
        switch (luachon) {
            case 1:
                xemDeThi();
                break;
            case 2:
                themDeThi();
                break;
            case 3:
                xoaDeThi();
                break;
            case 4:
                suaDeThi();
                break;
            case 5:
                return;
            default:
                break;
        }
    }

    public void xoaDeThi() {
        System.out.println("Nhap ma de thi ban muon xoa: ");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = BoDe.timKiem(maDe);
        if (index == -1) {
            System.out.println("De thi khong ton tai!!");
            nhap.waiting();
            return;
        }
        xoaDeThi(maDe);
        System.out.println("Xoa thanh cong");
        nhap.waiting();
    }

    public void xoaDeThi(String maDe) {
        BoDe.xoa(maDe);
        CauHoiBoDe.xoa(maDe);
        xoaBaiLamTheoDe(maDe);
    }

    public void xoaBaiLamTheoDe(String maDe) {
        for (int i = 0; i < BaiLam.soLuong(); i++) {
            if (BaiLam.at(i).getMaDe().equals(maDe)) {
                CauHoiBaiLam.xoa(BaiLam.at(i).getMaDe());
                BaiLam.xoa(i);
                i--;
            }
        }
    }

    public void themDeThi() {
        System.out.println("Nhap so luong de thi ban muon them: ");
        int n = nhap.kiemTraSo(1);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap de thi thu %d :\n", i + 1);
            taoDeThi();
        }
    }

    public void menuCauHoi() {
        while(true){
            System.out.println(" Menu cau hoi");
            System.out.println("-----------------------");
            System.out.println("|    1.Them cau hoi   |");
            System.out.println("|    2.Xoa cau hoi    |");
            System.out.println("|    3.Sua cau hoi    |");
            System.out.println("|    4.Xem cau hoi    |");
            System.out.println("|    5.Thoat          |");
            System.out.println("-----------------------");
            int luachon = nhap.kiemTraSo(1, 5);
            switch (luachon) {
                case 1:
                    themCauHoi();
                    nhap.waiting();
                    break;
                case 2:
                    xoaCauHoi();
                    nhap.waiting();
                    break;  
                case 3:
                    suaCauHoi();
                    break;
                case 4:
                    xemCauHoi();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void xoaCauHoi() {
        System.out.println("Nhap ma cau hoi muon xoa");
        String maCau = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (NganHangCauHoi.timKiem(maCau) == -1) {
            System.out.println("Ma cau khong ton tai");
            return;
        }
        NganHangCauHoi.xoa(maCau);
        danhSachLuaChon tmp = LuaChon.timKiemTheoCauHoi(maCau);
        for (int i = 0; i < tmp.soLuong(); i++) {
            LuaChon.xoa(tmp.at(i));
        }
        System.out.println("Xoa cau hoi thanh cong");
    }

    public void themCauHoi() {
        System.out.println("Nhap hoc phan cua cau hoi ");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (HocPhan.timKiem(maHocPhan) == -1) {
            System.out.println("Hoc phan khong ton tai!!");
            return;
        }
        System.out.println("Nhap so cau hoi ban muon them:");
        int soluong = nhap.kiemTraSo(0);
        for (int i = 0; i < soluong; i++) {
            System.out.println("Cau hoi thu " + (i + 1) + ": ");
            taoCauHoi(maHocPhan);
        }
    }

    public void taoCauHoi(String maHocPhan) {
        cauHoi_NganHang cauHoi = new cauHoi_NganHang();
        cauHoi.setMaCau(Integer.toString(NganHangCauHoi.idNext()));
        danhSachChuong chuongCuaHocPhan = Chuong.timKiemTheoHocPhan(maHocPhan);
        chuongCuaHocPhan.xuat();
        System.out.println("Nhap ma chuong: ");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (chuongCuaHocPhan.timKiem(maChuong) == -1) {
            System.out.println("Ma chuong khong ton tai trong hoc phan nay!!");
            System.out.println("----------------------------");
            System.out.println("|   1.Nhap lai ma chuong   |");
            System.out.println("|   2.Tao chuong moi       |");
            System.out.println("|   3.Thoat                |");
            System.out.println("----------------------------");
            int luaChon = nhap.kiemTraSo(1, 3);
            switch (luaChon) {
                case 1:
                    taoCauHoi(maHocPhan);
                    return;
                case 2:
                    System.out.println("Nhap ten chuong:");
                    String ten = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                    System.out.println("Nhap noi dung chuong:");
                    String noidung = nhap.kiemTraChuoi();
                    taoChuong(maChuong, ten, noidung, maHocPhan);
                    System.out.println("Them chuong moi thanh cong: ");
                    nhap.waiting();
                case 3:
                    return;
                default:
                    break;
            }
        }
        System.out.println("Nhap muc do kho:");
        String maMucDo = Integer.toString(nhap.kiemTraSo(1, 2));
        String maNhom = NhomCauHoi.at(NhomCauHoi.timKiem(maChuong, maMucDo)).getMaNhom();
        System.out.println("Nhap noi dung cau hoi: ");
        String noiDung = nhap.kiemTraChuoi();
        String maCau = Integer.toString(NganHangCauHoi.idNext());
        NganHangCauHoi.them(new cauHoi_NganHang(maCau, noiDung, maNhom));
        System.out.println("Nhap noi dung cac lua chon: ");
        String[] noiDungLuaChon = new String[4];
        String tmp = "abcd";
        for (int i = 0; i < 4; i++) {
            System.out.printf("Noi dung lua chon %c: \n", tmp.charAt(i));
            noiDungLuaChon[i] = nhap.kiemTraChuoi();
        }
        System.out.println("Nhap dap an dung");
        char dapAn = nhap.kiemTraLuaChon();
        for (int i = 0; i < 4; i++) {
            LuaChon.them(new luaChon(tmp.charAt(i), maCau, noiDungLuaChon[i], tmp.charAt(i) == dapAn));
        }
    }

    public void taoChuong(String maChuong, String tenChuong, String noiDung, String maHocPhan) {
        Chuong.them(new chuong(maChuong, tenChuong, noiDung, maHocPhan));
        NhomCauHoi.them(new nhomCauHoi(Integer.toString(NhomCauHoi.idNext()), maChuong, "1"));
        NhomCauHoi.them(new nhomCauHoi(Integer.toString(NhomCauHoi.idNext()), maChuong, "2"));
    }

    public void xemDeThi() {
        while (true) {
            System.out.println(" De thi");
            System.out.println("------------------------------");
            System.out.println("|   1.Xem tat ca             |");
            System.out.println("|   2.Xem theo hoc phan      |");
            System.out.println("|   3.Xem chi tiet de thi    |");
            System.out.println("|   4.Thoat                  |");
            System.out.println("------------------------------");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    BoDe.xuat();
                    nhap.waiting();
                    break;
                case 2:
                    xemDeThiTheoHocPhan();
                    nhap.waiting();
                    break;
                case 3:
                    xemChiTietDeThi();
                    nhap.waiting();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    public void xemDeThiTheoHocPhan() {
        System.out.println("Nhap ma hoc phan");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = HocPhan.timKiem(maHocPhan);
        if (index == -1) {
            System.out.println("Hoc phan khong ton tai!!");
            return;
        }
        BoDe.timKiemTheoHocPhan(maHocPhan).xuat();
    }

    public void suaDeThi() {
        System.out.println("Nhap ma de ban muon");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = BoDe.timKiem(maDe);
        if (index == -1) {
            System.out.println("Ma de khong ton tai!!");
            return;
        }
        // danhSachCauHoiBoDe de = CauHoiBoDe.timKiem(maDe);
        while (true) {
            System.out.println("        Sua de thi");
            System.out.println("-----------------------------");
            System.out.println("|    1.Thay doi cau hoi     |");
            System.out.println("|    2.Doi noi dung cau hoi |");
            System.out.println("|    3.Thoat                |");
            System.out.println("-----------------------------");
            System.out.println("Nhap lua chon cua ban");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1: {
                    System.out.println("Nhap ma cau hoi ban muon thay:");
                    String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    int i = CauHoiBoDe.timKiem(maDe, maCauHoi);
                    int j = NganHangCauHoi.timKiem(maCauHoi);
                    if (j == -1) {
                        System.out.println("Cau hoi khong co trong ngan hang cau hoi!!");
                        nhap.waiting();
                    } else if (i == -1) {
                        System.out.println("Cau hoi khong co trong de nay!!");
                        nhap.waiting();
                    } else {
                        System.out.println("Nhap ma cau hoi moi: ");
                        String maCauHoiMoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                        CauHoiBoDe.at(i).setMaCau(maCauHoiMoi);
                        CauHoiBoDe.at(i).setNoiDung(NganHangCauHoi.at(j).getNoiDung());
                    }
                }
                    break;

                case 2:
                    System.out.println("Nhap ma cau hoi ban muon sua:");
                    String maCauHoiSua = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    int i = CauHoiBoDe.timKiem(maDe, maCauHoiSua);
                    int j = NganHangCauHoi.timKiem(maCauHoiSua);
                    if (j == -1) {
                        System.out.println("Cau hoi khong co trong ngan hang cau hoi!!");
                        nhap.waiting();
                    } else if (i == -1) {
                        System.out.println("Cau hoi khong co trong de nay!!");
                        nhap.waiting();
                    }
                    suaCauHoi(maCauHoiSua);
                    CauHoiBoDe.at(i).setNoiDung(NganHangCauHoi.at(j).getNoiDung());
                    System.out.println("Sua cau hoi thanh cong");
                    nhap.waiting();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public void suaCauHoi() {
        System.out.println("Nhap cau hoi ban muon sua:");
        String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int j = NganHangCauHoi.timKiem(maCauHoi);
        if (j == -1) {
            System.out.println("Cau hoi khong co trong ngan hang cau hoi!!");
            return;
        }
        suaCauHoi(maCauHoi);
    }

    public void suaCauHoi(String maCauHoi) {
        System.out.println("    Sua cau hoi ");
        System.out.println("----------------------");
        System.out.println("|   1.Sua noi dung   |");
        System.out.println("|   2.Sua lua chon   |");
        System.out.println("|   3.Thoat          |");
        System.out.println("----------------------");
        System.out.println("Nhap lua chon cua ban: ");
        int luachon = nhap.kiemTraSo(1, 3);
        switch (luachon) {
            case 1:
                System.out.println("Nhap noi dung moi: ");
                String noiDung = nhap.kiemTraChuoi();
                NganHangCauHoi.at(NganHangCauHoi.timKiem(maCauHoi)).setNoiDung(noiDung);
                System.out.println("Sua thanh cong");
                nhap.waiting();
                break;
            case 2:
                suaLuaChon(maCauHoi);
                break;
            case 3:
                return;
            default:
                break;
        }
    }

    public void suaLuaChon(String maCauHoi) {
        while (true) {
            danhSachLuaChon cacLuaChon = LuaChon.timKiemTheoCauHoi(maCauHoi);
            cacLuaChon.xuat();
            System.out.println("-------------------------------");
            System.out.println("|   1.Sua noi dung lua chon   |");
            System.out.println("|   2.Sua dap an dung         |");
            System.out.println("|   3.Thoat                   |");
            System.out.println("-------------------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int key = nhap.kiemTraSo(1, 3);
            switch (key) {
                case 1:
                    System.out.println("Nhap ma lua chon ban muon sua:");
                    char maLuaChon = nhap.kiemTraLuaChon();
                    System.out.println("Nhap noi dung moi: ");
                    String noiDung = nhap.kiemTraChuoi();
                    LuaChon.at(LuaChon.timKiem(maCauHoi, maLuaChon)).setNoiDung(noiDung);
                    System.out.println("Sua thanh cong!!");
                    nhap.waiting();
                    break;
                case 2:
                    System.out.println("Nhap ma lua chon dung");
                    char luaChonDung = nhap.kiemTraLuaChon();
                    LuaChon.at(LuaChon.timKiem(maCauHoi, 'a')).setDapAn(luaChonDung == 'a');
                    LuaChon.at(LuaChon.timKiem(maCauHoi, 'b')).setDapAn(luaChonDung == 'b');
                    LuaChon.at(LuaChon.timKiem(maCauHoi, 'c')).setDapAn(luaChonDung == 'c');
                    LuaChon.at(LuaChon.timKiem(maCauHoi, 'd')).setDapAn(luaChonDung == 'd');
                    break;
                case 3:
                    return;
            }
        }
    }

    public void xemChiTietDeThi() {
        System.out.println("Nhap ma de thi ban muon xem");
        String maDeThi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = BoDe.timKiem(maDeThi);
        if (index == -1) {
            System.out.println("Ma de khong ton tai!!!");
            return;
        }
        BoDe.at(index).xuat();
        danhSachCauHoiBoDe de = CauHoiBoDe.timKiem(maDeThi);
        for (int i = 0; i < de.soLuong(); i++) {
            System.out.println("                            ====////=====");
            xemChiTietCauHoi(de.at(i).getMaCau());
        }
    }

    public void taoDeThi() {
        while (true) {
            System.out.println("      Tao De Thi");
            System.out.println("--------------------------");
            System.out.println("|   1.De tu tao         |");
            System.out.println("|   2.De theo cau truc  |");
            System.out.println("|   3.Thoat             |");
            System.out.println("--------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    taoDeTuTao();
                    break;
                case 2:
                    taoDeTheoCauTruc();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public void taoDeTuTao() {
        deTuTao de = new deTuTao();
        de.setMaGvTaoDe(userCurent);
        de.setMaDe(Integer.toString(BoDe.idNext()));
        de.nhap();
        while (HocPhan.timKiem(de.getmaHocPhan()) == -1) {
            System.out.println("Hoc phan khong ton tai, khong the tao de");
            System.out.println("--------------------------");
            System.out.println("|   1.Nhap lai hoc phan  |");
            System.out.println("|   2.Xem hoc phan       |");
            System.out.println("|   3.Thoat              |");
            System.out.println("--------------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    System.out.println("Nhap ma hoc phan: ");
                    String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    de.setMaHocPhan(maHocPhan);
                    break;
                case 2:
                    xemHocPhan();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
        BoDe.them(de);
        while (true) {
            System.out.println("   Them cau hoi vao de ");
            System.out.println("------------------------------");
            System.out.println("|   1.Them cau hoi           |");
            System.out.println("|   2.Xem danh sach cau hoi  |");
            System.out.println("|   3.Thoat                  |");
            System.out.println("------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    System.out.println("Nhap ma cau hoi: ");
                    String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    int index = NganHangCauHoi.timKiem(maCauHoi);
                    if (index == -1) {
                        System.out.println("Cau hoi khong ton tai!!!");
                    } else {
                        cauHoi_BoDe cauhoi = new cauHoi_BoDe(de.getMaDe(), maCauHoi,
                                NganHangCauHoi.at(index).getNoiDung());
                        CauHoiBoDe.them(cauhoi);
                        System.out.println("Them cau hoi thanh cong !!");
                    }
                    nhap.waiting();
                    break;
                case 2:
                    xemCauHoi();
                    break;
                case 3:
                    System.out.println("Tao de thi thanh cong!!");
                    nhap.waiting();
                    updateDeThi();
                    return;
                default:
                    break;
            }
        }
    }

    public void updateDeThi(){
        for(int i=0;i<BoDe.soLuong();i++){
            int n=0;
            for(int j=0;j<CauHoiBoDe.soLuong();j++){
                if(CauHoiBoDe.at(j).getMaBoDe().equals(BoDe.at(i).getMaDe())){
                    n++;
                }
            }
            BoDe.at(i).setSoCau(n);
        }
    }

    public void taoHocPhan(String maHocPhan) {
        hocPhan tmp = new hocPhan();
        tmp.nhap();
        tmp.setMaKhoa(maKhoa);
        tmp.setMaHocPhan(maHocPhan);
        HocPhan.them(tmp);
        System.out.println("Them hoc phan thanh cong");
    }

    public void taoDeTheoCauTruc() {

        boolean flag = true;
        while (flag) {
            System.out.println("----------------------------");
            System.out.println("|   1.Nhap ma cau truc de  |");
            System.out.println("|   2.Xem cau truc de      |");
            System.out.println("|   3.Thoat                |");
            System.out.println("----------------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    System.out.println("Nhap ma cau truc de: ");
                    String maCauTruc = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    int index = CauTrucDeThi.timKiem(maCauTruc);
                    if (index == -1) {
                        System.out.println("Ma cau truc de khong ton tai!!");
                    } else {
                        taoDeTheoCauTruc(maCauTruc);
                        return;
                    }
                    break;
                case 2:
                    xemCauTrucDe();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }


    public void taoDeTheoCauTruc(String maCauTruc) {
        cauTrucDeThi cauTruc = CauTrucDeThi.at(CauTrucDeThi.timKiem(maCauTruc));
        String maBoDe = Integer.toString(BoDe.idNext());
        BoDe.them((boDe) new deTheoCauTruc(maBoDe, cauTruc.getMaHocPhan(), cauTruc.getThoiGianThi(), cauTruc.getSoCau(),
                cauTruc.getMaCauTrucDeThi()));
        danhSachChiTietCauTrucDeThi chitietde = ChiTietCauTrucDeThi.timKiemMaCauTrucDe(maCauTruc);
        for (int i = 0; i < chitietde.soLuong(); i++) {
            String maChuong = chitietde.at(i).getMaChuong();
            String maMucDo = chitietde.at(i).getMaMucDo();
            int soCauMax = chitietde.at(i).getSoCau();
            String maNhom = NhomCauHoi.at(NhomCauHoi.timKiem(maChuong, maMucDo)).getMaNhom();
            nganHangCauHoi boCauHoi = NganHangCauHoi.timKiemTheoMaNhom(maNhom);
            int stepMax = boCauHoi.soLuong() / soCauMax;
            int soCau = 0;
            for (int j = (int) Math.random()
                    % (stepMax); soCau < soCauMax; j = (int) (j + Math.random() % (stepMax) + 1)) {
                cauHoi_BoDe tmp = new cauHoi_BoDe(maBoDe, boCauHoi.at(j).getMaCau(), boCauHoi.at(j).getNoiDung());
                CauHoiBoDe.them(tmp);
                soCau++;
            }
        }
        System.out.println("Tao de theo cau truc thanh cong");
    }

    public void xemCauTrucDe() {
        while (true) {
            System.out.println("     Cau truc de thi ");
            System.out.println("--------------------------");
            System.out.println("|   1.Xem tat ca         |");
            System.out.println("|   2.Xem theo hoc phan  |");
            System.out.println("|   3.Xem chi tiet       |");
            System.out.println("|   4.Thoat              |");
            System.out.println("--------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    CauTrucDeThi.xuat();
                    nhap.waiting();
                    break;
                case 2:
                    xemCauTrucDeTheoHocPhan();
                    nhap.waiting();
                    break;
                case 3:
                    xemChiTietCauTrucDe();
                    nhap.waiting();
                    break;
                case 4:
                    return;
            }

        }

    }

    public void xemCauTrucDeTheoHocPhan() {
        HocPhan.xuat();
        System.out.println("Nhap ma hoc phan ban muon xem:");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (HocPhan.timKiem(maHocPhan) == -1) {
            System.out.println("Hoc phan khong ton tai!!");
            return;
        }
        xemCauHoiHocPhan(maHocPhan);
    }

    public void xemCauTrucDeTheoHocPhan(String maHocPhan) {
        CauTrucDeThi.timKiemTheoHocPhan(maHocPhan).xuat();
    }

    public void xemChiTietCauTrucDe() {
        System.out.println("Nhap ma cau truc de thi:");
        String maCauTruc = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = CauTrucDeThi.timKiem(maCauTruc);
        if (index == -1) {
            System.out.println("Ma cau truc de thi khong ton tai!!");
            return;
        }
        CauTrucDeThi.at(index).xuat();
        ChiTietCauTrucDeThi.timKiemMaCauTrucDe(CauTrucDeThi.at(index).getMaCauTrucDeThi()).xuat();
    }

    public void suaCauTrucDe() {
        System.out.println("Nhap ma cau truc de thi:");
        String maCauTruc = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = CauTrucDeThi.timKiem(maCauTruc);
        if (index == -1) {
            System.out.println("Ma cau truc de thi khong ton tai!!");
            return;
        }
        boolean flag = true;
        while (flag) {
            System.out.println("Chi tiet de thi: ");
            ChiTietCauTrucDeThi.timKiemMaCauTrucDe(CauTrucDeThi.at(CauTrucDeThi.timKiem(maCauTruc)).getMaCauTrucDeThi())
                    .xuat();
            System.out.println("----------------------");
            System.out.println("|  1.Sua so luong    |");
            System.out.println("|  2.Them cau hoi    |");
            System.out.println("|  3.Xoa             |");
            System.out.println("|  4.Thoat           |");
            System.out.println("----------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1: {
                    System.out.println("Nhap ma chuong:");
                    String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    System.out.println("Nhap ma muc do");
                    String maMucDo = Integer.toString(nhap.kiemTraSo(1, 2));
                    if (ChiTietCauTrucDeThi.timKiem(maCauTruc, maChuong, maMucDo) == -1) {
                        System.out.println("Ma chuong,ma muc do khong ton tai trong cau truc de nay!!");
                        nhap.waiting();
                        continue;
                    }
                    System.out.println("Nhap so cau:");
                    ChiTietCauTrucDeThi.at(ChiTietCauTrucDeThi.timKiem(maCauTruc, maChuong, maMucDo)).setSoCau(nhap.kiemTraSo(1));
                    System.out.println("Sua so luong thanh cong!!");
                    updateCauTrucDeThi();
                    nhap.waiting();
                }
                    break;
                case 2: {
                    taoChiTietCauTruc(maCauTruc);
                    nhap.waiting();
                }
                    break;
                case 3: {
                    System.out.println("Nhap ma chuong:");
                    String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    System.out.println("Nhap ma muc do");
                    String maMucDo = Integer.toString(nhap.kiemTraSo(1, 2));
                    if (ChiTietCauTrucDeThi.timKiem(maCauTruc, maChuong, maMucDo) == -1) {
                        System.out.println("Ma chuong,ma muc do khong ton tai trong cau truc de nay!!");
                        nhap.waiting();
                        continue;
                    }
                    ChiTietCauTrucDeThi.xoa(ChiTietCauTrucDeThi.timKiem(maCauTruc, maChuong, maMucDo));
                    System.out.println("Xoa thanh cong");
                    nhap.waiting();
                }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void taoChiTietCauTruc(String maCauTruc) {
        System.out.println("Nhap ma chuong:");
        String maChuong = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = Chuong.timKiem(maChuong);
        if (index == -1) {
            System.out.println("Ma chuong khong ton tai!");
            System.out.println("Them chi tiet cau truc that bai!!");
            nhap.waiting();
            return;
        }
        System.out.println("Nhap ma muc do");
        String maMucDo = Integer.toString(nhap.kiemTraSo(1, 2));
        if (ChiTietCauTrucDeThi.timKiem(maCauTruc, maChuong, maMucDo) != -1) {
            System.out.println("Ma chuong,ma muc do da ton tai trong cau truc de nay!!");
            return;
        }
        System.out.println("Nhap so luong cau: ");
        int soluong = nhap.kiemTraSo(1);
        ChiTietCauTrucDeThi.them(new chiTietCauTrucDeThi(maCauTruc, maChuong, maMucDo, soluong));
        System.out.println("Them thanh cong!!");
    }

    public void xoaCauTrucDe() {
        System.out.println("Nhap ma cau truc de ban muon xoa:");
        String maCauTruc = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        xoaCauTrucDe(maCauTruc);
    }

    public void xoaCauTrucDe(String maCauTruc) {
        CauTrucDeThi.xoa(maCauTruc);
        ChiTietCauTrucDeThi.xoa(maCauTruc);
    }

    public void themCauTrucDe() {
        System.out.println("Nhap so luong cau truc de ban muon them: ");
        int n = nhap.kiemTraSo(1);
        for (int i = 0; i < n; i++) {
            taoCauTrucDe();
        }
    }

    public void taoCauTrucDe() {
        System.out.println("Nhap ma hoc phan:");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (HocPhan.timKiem(maHocPhan) == -1) {
            System.out.println("Hoc phan khong ton tai !!!");
            System.out.println("Tao cau truc de that bai.");
            return;
        }
        System.out.println("Nhap thoi gian thi:");
        int thoiGianThi = nhap.kiemTraSo(1);
        String maCauTrucDe = Integer.toString(CauTrucDeThi.idNext());
        CauTrucDeThi.them(new cauTrucDeThi(maCauTrucDe, thoiGianThi, hocKi, maHocPhan, 0));
        while (true) {
            System.out.println("Them cau hoi cho cau truc de");
            System.out.println("---------------------------");
            System.out.println("|   1.Them cau hoi        |");
            System.out.println("|   2.Thoat               |");
            System.out.println("---------------------------");
            int luachon = nhap.kiemTraSo(1, 2);
            switch (luachon) {
                case 1:
                    taoChiTietCauTruc(maCauTrucDe);
                    updateCauTrucDeThi();
                    break;
                case 2: {
                    danhSachChiTietCauTrucDeThi chitiet = ChiTietCauTrucDeThi.timKiemMaCauTrucDe(maCauTrucDe);
                    if (chitiet.soLuong() == 0) {
                        System.out.println("Luu y, ban chua them cau hoi cho cau truc de, cau truc de nay se bi xoa ");
                        CauTrucDeThi.xoa(maCauTrucDe);
                    }
                    return;
                }
                default:
                    break;
            }
        }
    }

    public void xemCauHoi() {
        while (true) {
            System.out.println("       Xem cau hoi");
            System.out.println("-----------------------------");
            System.out.println("|   1.Xem tat ca            |");
            System.out.println("|   2.Xem theo hoc phan     |");
            System.out.println("|   3.Xem chi tiet cau hoi  |");
            System.out.println("|   4.Thoat                 |");
            System.out.println("-----------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    for (int i = 0; i < HocPhan.getSoLuong(); i++) {
                        xemCauHoiHocPhan(HocPhan.at(i).getMaHocPhan());
                        System.out.println();
                    }
                    nhap.waiting();
                    break;
                case 2:
                    System.out.println("Nhap ma hoc phan ban muon xem: ");
                    String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    int index = HocPhan.timKiem(maHocPhan);
                    if (index == -1) {
                        System.out.println("Ma hoc phan khong ton tai, vui long nhap lai!!");
                    } else {
                        xemCauHoiHocPhan(maHocPhan);
                    }
                    nhap.waiting();
                    break;
                case 3:
                    System.out.println("Nhap ma cau hoi ban muon xem: ");
                    String maCauHoi = nhap.kiemTraMa(nhap.soLuongKyTuMa);
                    xemChiTietCauHoi(maCauHoi);
                    nhap.waiting();
                    break;
                case 4:
                    return;
            }
        }
    }

    public void xemChiTietCauHoi(String maCauHoi) {
        int index = NganHangCauHoi.timKiem(maCauHoi);
        if (index == -1) {
            System.out.println("Ma cau hoi khong ton tai!!!");
            return;
        }
        NganHangCauHoi.at(index).xuat();
        danhSachLuaChon luachon = LuaChon.timKiemTheoCauHoi(maCauHoi);
        luachon.xuat();
    }

    public void xemCauHoiHocPhan(String maHocPhan) {
        danhSachChuong chuong = Chuong.timKiemTheoHocPhan(maHocPhan);
        System.out.println("Danh sach cau hoi hoc phan  " + HocPhan.at(HocPhan.timKiem(maHocPhan)).getTenHocPhan() + " ( " + maHocPhan + " )" );
        for (int i = 0; i < chuong.soLuong(); i++) {
            danhSachNhomCauHoi nhomcauhoi = NhomCauHoi.timKiemTheoChuong(chuong.at(i).getMaChuong());
            System.out.printf("Chuong %s:\n %s :\n", chuong.at(i).getMaChuong(), chuong.at(i).getNoiDung());
            for (int j = 0; j < nhomcauhoi.soLuong(); j++) {
                System.out.println("Muc do " + nhomcauhoi.at(j).getMaMucDo());
                nganHangCauHoi nganhangcauhoi = NganHangCauHoi.timKiemTheoMaNhom(nhomcauhoi.at(j).getMaNhom());
                nganhangcauhoi.xuat();
            }
        }
    }

    public void xemDiemGv() {
        // updateDiem();
        while (true) {
            System.out.println("             Xem diem");
            System.out.println("-------------------------------------");
            System.out.println("|   1.Xem diem theo sinh vien       |");
            System.out.println("|   2.Xem diem theo hoc phan        |");
            System.out.println("|   3.Xem diem theo nhom hoc phan   |");
            System.out.println("|   4.Xem diem theo de              |");
            System.out.println("|   5.Thoat                         |");
            System.out.println("-------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 5);
            switch (luachon) {
                case 1:
                    xemDiemTheoSv();
                    break;
                case 2:
                    xemDiemTheoHocPhan();
                    break;
                case 3:
                    xemDiemTheoNhomHocPhan();
                    break;
                case 4:
                    xemDiemTheoDe();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }

    void xemDiem1Sv() {
        System.out.println("Nhap ma so sinh vien can xem diem:");
        String mssv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (SinhVien.timKiem(mssv) == -1) {
            System.out.println("Khong tim thay sinh vien!!!");
            return;
        }
        SinhVien.at(SinhVien.timKiem(mssv)).xuat();
        danhSachChiTietDiem tmp = new danhSachChiTietDiem();
        for (int i = 0; i < BangDiem.soLuong(); i++) {
            if (BangDiem.at(i).getMaSv().equals(mssv)) {
                // BangDiem.at(i).xuat();
                for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
                    if (ChiTietDiem.at(j).getMaBangDiem().equals((BangDiem.at(i).getMaBangDiem()))) {
                        tmp.them(ChiTietDiem.at(j));
                    }
                }
                break;
            }
        }
        if (tmp.soLuong() == 0) {
            System.out.println("Sinh vien chua co diem!!");
        } else {
            tmp.xuat();
        }
        nhap.waiting();
    }

    void xemDiemTatCaSv() {
        for (int k = 0; k < SinhVien.soLuong(); k++) {
            SinhVien.at(k).xuat();
            danhSachChiTietDiem tmp = new danhSachChiTietDiem();
            for (int i = 0; i < BangDiem.soLuong(); i++) {
                if (BangDiem.at(i).getMaSv().equals(SinhVien.at(k).getMSSV())) {
                    // BangDiem.at(i).xuat();
                    for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
                        if (ChiTietDiem.at(j).getMaBangDiem().equals((BangDiem.at(i).getMaBangDiem()))) {
                            tmp.them(ChiTietDiem.at(j));
                        }
                    }
                    break;
                }
            }
            if (tmp.soLuong() == 0) {
                System.out.println("Sinh vien chua co diem!!");
            } else {
                tmp.xuat();
            }
        }
        nhap.waiting();
    }

    void xemDiemTB1Sv() {
        System.out.println("Nhap ma so sinh vien can xem diem trung binh:");
        String mssv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (SinhVien.timKiem(mssv) == -1) {
            System.out.println("Khong tim thay sinh vien!!!");
            return;
        }
        double tb = 0, cnt = 0;
        for (int i = 0; i < BangDiem.soLuong(); i++) {
            if (BangDiem.at(i).getMaSv().equals(mssv)) {
                for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
                    if (ChiTietDiem.at(j).getMaBangDiem().equals((BangDiem.at(i).getMaBangDiem()))) {
                        tb += ChiTietDiem.at(j).getDiem();
                        cnt++;
                    }
                }
                break;
            }
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-15s|%-15s|%-25s|%-15s|%-15s|\n", " Ma sinh vien", " Ten", " Que quan",
                " Ngay sinh", " So dien thoai", " Gioi tinh", " Trung binh");
        if (cnt == 0) {
            bangSv(SinhVien.at(SinhVien.timKiem(mssv)), "Khong co");
        } else {
            String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
            bangSv(SinhVien.at(SinhVien.timKiem(mssv)), TB);
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------");
        nhap.waiting();
    }

    void xemDiemTBTatCaSv() {
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-15s|%-15s|%-25s|%-15s|%-15s|\n", " Ma sinh vien", " Ten", " Que quan",
                " Ngay sinh", " So dien thoai", " Gioi tinh", " Trung binh");
        for (int k = 0; k < SinhVien.soLuong(); k++) {
            double tb = 0, cnt = 0;
            for (int i = 0; i < BangDiem.soLuong(); i++) {
                if (BangDiem.at(i).getMaSv().equals(SinhVien.at(k).getMSSV())) {
                    for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
                        if (ChiTietDiem.at(j).getMaBangDiem().equals((BangDiem.at(i).getMaBangDiem()))) {
                            tb += ChiTietDiem.at(j).getDiem();
                            cnt++;
                        }
                    }
                    break;
                }
            }
            if (cnt == 0) {
                bangSv(SinhVien.at(k), "Khong co");
            } else {
                String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
                bangSv(SinhVien.at(k), TB);
            }
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------");
        nhap.waiting();
    }

    public void bangSv(sinhVien sinhVien, String tb) {
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-35s|%-15s|%-15s|%-25s|%-15s|%-15s|\n", " " + sinhVien.getMSSV(),
                " " + sinhVien.getHoTen(),
                sinhVien.getQueQuan(), " " + sinhVien.getNgaySinh(), " " + sinhVien.getSdt(),
                " " + sinhVien.getGioiTinh(), " " + tb);
    }

    void xemDiemTBSv() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("|   1.Xem diem trung binh 1 sinh vien       |");
            System.out.println("|   2.Xem diem trung binh tat ca sinh vien  |");
            System.out.println("|   3.Thoat                                 |");
            System.out.println("---------------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    xemDiemTB1Sv();
                    break;
                case 2:
                    xemDiemTBTatCaSv();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    void xemDiemTheoSv() {
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("|   1.Xem diem 1 sinh vien       |");
            System.out.println("|   2.Xem diem tat ca sinh vien  |");
            System.out.println("|   3.Xem diem diem trung binh   |");
            System.out.println("|   4.Thoat                      |");
            System.out.println("----------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    xemDiem1Sv();
                    break;
                case 2:
                    xemDiemTatCaSv();
                    break;
                case 3:
                    xemDiemTBSv();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    void xemDiemTBHocPhan() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("|   1.Xem diem trung binh 1 hoc phan        |");
            System.out.println("|   2.Xem diem trung binh tat ca hoc phan   |");
            System.out.println("|   3.Thoat                                 |");
            System.out.println("---------------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    xemDiemTB1HocPhan();
                    break;
                case 2:
                    xemDiemTBTatCaHocPhan();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public void bangTBHocPhan(hocPhan hocPhan, String tb) {
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-30s|%-15s|%-15s|%-15s| \n", " " + hocPhan.getMaHocPhan(),
                " " + hocPhan.getTenHocPhan(), " " + hocPhan.getMaKhoa(), " " + hocPhan.getSoTinChi(), " " + tb);
    }

    void xemDiemTB1HocPhan() {
        System.out.println("Nhap ma so hoc phan can xem diem:");
        String mahp = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (HocPhan.timKiem(mahp) == -1) {
            System.out.println("Khong tim thay hoc phan !!!");
            return;
        }
        // HocPhan.at(HocPhan.timKiem(mahp)).xuat();
        double tb = 0, cnt = 0;
        for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
            if (ChiTietDiem.at(j).getMaHocPhan().equals(mahp)) {
                tb += ChiTietDiem.at(j).getDiem();
                cnt++;
            }
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-30s|%-15s|%-15s|%-15s| \n", " Ma hoc phan", " Ten hoc phan", " Ma khoa",
                " So tin chi", " Trung binh");
        if (cnt == 0) {
            bangTBHocPhan(HocPhan.at(HocPhan.timKiem(mahp)), "Khong co");
        } else {
            String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
            bangTBHocPhan(HocPhan.at(HocPhan.timKiem(mahp)), TB);
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        nhap.waiting();
    }

    void xemDiemTBTatCaHocPhan() {
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-30s|%-15s|%-15s|%-15s| \n", " Ma hoc phan", " Ten hoc phan", " Ma khoa",
                " So tin chi", " Trung binh");
        for (int i = 0; i < HocPhan.soLuong(); i++) {
            String mahp = HocPhan.at(i).getMaHocPhan();
            double tb = 0, cnt = 0;
            for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
                if (ChiTietDiem.at(j).getMaHocPhan().equals(mahp)) {
                    tb += ChiTietDiem.at(j).getDiem();
                    cnt++;
                }
            }
            if (cnt == 0) {
                bangTBHocPhan(HocPhan.at(HocPhan.timKiem(mahp)), "Khong co");
            } else {
                String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
                bangTBHocPhan(HocPhan.at(HocPhan.timKiem(mahp)), TB);
            }
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        nhap.waiting();
    }

    void xemDiem1HP() {
        System.out.println("Nhap ma so hoc phan can xem diem:");
        String mahp = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (HocPhan.timKiem(mahp) == -1) {
            System.out.println("Khong tim thay hoc phan !!!");
            return;
        }
        HocPhan.at(HocPhan.timKiem(mahp)).xuat();
        danhSachChiTietDiem tmp = new danhSachChiTietDiem();
        for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
            if ((ChiTietDiem.at(i).getMaHocPhan().equals(mahp))) {
                tmp.them(ChiTietDiem.at(i));
            }
        }
        if (tmp.soLuong() == 0) {
            System.out.println("Hoc Phan chua co diem!!");
        } else {
            tmp.xuat();
        }
        nhap.waiting();
    }

    void xemDiemTatCaHocPhan() {
        for (int i = 0; i < HocPhan.soLuong(); i++) {
            HocPhan.at(i).xuat();
            String mahp = HocPhan.at(i).getMaHocPhan();
            danhSachChiTietDiem temp = new danhSachChiTietDiem();
            for (int j = 0; j < ChiTietDiem.soLuong(); j++) {
                if (ChiTietDiem.at(j).getMaHocPhan().equals(mahp)) {
                    temp.them(ChiTietDiem.at(j));
                }
            }
            if (temp.soLuong() == 0) {
                System.out.println("Hoc phan chua co diem!!");
            } else {
                temp.xuat();
            }
        }
        nhap.waiting();
    }

    void xemDiemTheoHocPhan() {
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("|   1.Xem diem 1 hoc phan           |");
            System.out.println("|   2.xem diem tat ca hoc phan      |");
            System.out.println("|   3.Xem diem trung binh hoc phan  |");
            System.out.println("|   4.Thoat                         |");
            System.out.println("-------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    xemDiem1HP();
                    break;
                case 2:
                    xemDiemTatCaHocPhan();
                    break;
                case 3:
                    xemDiemTBHocPhan();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    public void bangTBNhomHocPhan(nhomHocPhan nhomHocPhan, String tb) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-10s|%-15s|\n", " " + nhomHocPhan.getMaNhom(),
                " " + nhomHocPhan.getMaHocPhan(), " " + nhomHocPhan.getSoLuong(), " " + tb);

    }

    void xemDiem1NhomHocPhan() {
        System.out.println("Nhap ma so nhom hoc phan can xem diem:");
        String manhp = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (NhomHocPhan.timKiem(manhp) == -1) {
            System.out.println("Khong tim thay nhom hoc phan !!!");
            return;
        }
        String mahp = NhomHocPhan.at(NhomHocPhan.timKiem(manhp)).getMaHocPhan();
        danhSachChiTietDiem tmp = new danhSachChiTietDiem();
        for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
            if ((ChiTietDiem.at(i).getMaHocPhan().equals(mahp))) {
                tmp.them(ChiTietDiem.at(i));
            }
        }
        if (tmp.soLuong() == 0) {
            System.out.println("Nhom hoc phan chua co diem!!");
        } else {
            tmp.xuat();
        }
        nhap.waiting();
    }

    void xemDiemTatCaNhomHocPhan() {
        for (int k = 0; k < NhomHocPhan.soLuong(); k++) {
            NhomHocPhan.at(k).xuat();
            String mahp = NhomHocPhan.at(k).getMaHocPhan();
            danhSachChiTietDiem tmp = new danhSachChiTietDiem();
            for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
                if ((ChiTietDiem.at(i).getMaHocPhan().equals(mahp))) {
                    tmp.them(ChiTietDiem.at(i));
                }
            }
            if (tmp.soLuong() == 0) {
                System.out.println("Nhom hoc phan chua co diem!!");
            } else {
                tmp.xuat();
            }
        }
        nhap.waiting();
    }

    void xemDiemTBTatCaNhomHocPhan() {
        System.out.println("------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-10s|%-15s|\n", " Ma nhom", " Ma hoc phan", " So luong", " Trung binh");
        for (int k = 0; k < NhomHocPhan.soLuong(); k++) {
            String mahp = NhomHocPhan.at(k).getMaHocPhan();
            double tb = 0, cnt = 0;
            for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
                if ((ChiTietDiem.at(i).getMaHocPhan().equals(mahp))) {
                    tb += ChiTietDiem.at(i).getDiem();
                    cnt++;
                }
            }
            if (cnt == 0) {
                bangTBNhomHocPhan(NhomHocPhan.at(k), "Khong co");
            } else {
                String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
                bangTBNhomHocPhan(NhomHocPhan.at(k), TB);
            }
        }
        System.out.println("------------------------------------------------------------");
        nhap.waiting();
    }

    void xemDiemTB1NhomHocPhan() {
        System.out.println("Nhap ma so nhom hoc phan can xem diem trung binh:");
        String manhp = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (NhomHocPhan.timKiem(manhp) == -1) {
            System.out.println("Khong tim thay nhom hoc phan !!!");
            return;
        }
        NhomHocPhan.at(NhomHocPhan.timKiem(manhp)).xuat();
        String mahp = NhomHocPhan.at(NhomHocPhan.timKiem(manhp)).getMaHocPhan();
        double tb = 0, cnt = 0;
        for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
            if ((ChiTietDiem.at(i).getMaHocPhan().equals(mahp))) {
                tb += ChiTietDiem.at(i).getDiem();
                cnt++;
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-10s|%-15s|\n", " Ma nhom", " Ma hoc phan", " So luong", " Trung binh");
        if (cnt == 0) {
            bangTBNhomHocPhan(NhomHocPhan.at(NhomHocPhan.timKiem(manhp)), " Khong co");
        } else {
            String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
            bangTBNhomHocPhan(NhomHocPhan.at(NhomHocPhan.timKiem(manhp)), TB);
        }
        System.out.println("------------------------------------------------------------");
        nhap.waiting();
    }

    void xemDiemTBNhomHocPhan() {
        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println("|   1.Xem diem trung binh 1 nhom hoc phan        |");
            System.out.println("|   2.Xem diem trung binh tat ca nhom hoc phan   |");
            System.out.println("|   3.Thoat                                      |");
            System.out.println("--------------------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    xemDiemTB1NhomHocPhan();
                    break;
                case 2:
                    xemDiemTBTatCaNhomHocPhan();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    void xemDiemTheoNhomHocPhan() {
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("|   1.Xem diem 1 nhom hoc phan            |");
            System.out.println("|   2.xem diem tat ca nhom hoc phan       |");
            System.out.println("|   3.Xem diem trung binh nhom hoc phan   |");
            System.out.println("|   4.Thoat                               |");
            System.out.println("-------------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    xemDiem1NhomHocPhan();
                    break;
                case 2:
                    xemDiemTatCaNhomHocPhan();
                    break;
                case 3:
                    xemDiemTBNhomHocPhan();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    void xemDiem1De() {
        System.out.println("Nhap ma so bo de can xem diem:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (BoDe.timKiem(maDe) == -1) {
            System.out.println("Khong tim thay bo de !!!");
            return;
        }
        BoDe.at(BoDe.timKiem(maDe)).xuat();
        danhSachChiTietDiem tmp = new danhSachChiTietDiem();
        for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
            if ((ChiTietDiem.at(i).getMaBoDe().equals(maDe))) {
                tmp.them(ChiTietDiem.at(i));
            }
        }
        if (tmp.soLuong() == 0) {
            System.out.println("Bo de chua co diem!!");
        } else {
            tmp.xuat();
        }
        nhap.waiting();
    }

    void xemDiemTatCaDe() {
        for (int k = 0; k < BoDe.soLuong(); k++) {
            String maDe = BoDe.at(k).getMaDe();
            BoDe.at(k).xuat();
            danhSachChiTietDiem tmp = new danhSachChiTietDiem();
            for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
                if ((ChiTietDiem.at(i).getMaBoDe().equals(maDe))) {
                    tmp.them(ChiTietDiem.at(i));
                }
            }
            if (tmp.soLuong() == 0) {
                System.out.println("Bo de chua co diem!!");
            } else {
                tmp.xuat();
            }
        }
        nhap.waiting();
    }

    void xemDiemTBDe() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("|   1.Xem diem trung binh 1 bo de           |");
            System.out.println("|   2.Xem diem trung binh tat ca bo de      |");
            System.out.println("|   3.Thoat                                 |");
            System.out.println("---------------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    xemDiemTB1De();
                    break;
                case 2:
                    xemDiemTBTatCaDe();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public void bangTBDe(boDe boDe, String tb) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|\n", " " + boDe.getMaDe(), " " + boDe.getmaHocPhan(),
                " " + boDe.getThoiGian(), " " + boDe.getSoCau(), " " + tb);
    }

    void xemDiemTB1De() {
        System.out.println("Nhap ma bo de can xem diem trung binh:");
        String maDe = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (BoDe.timKiem(maDe) == -1) {
            System.out.println("Khong tim thay bo de !!!");
            return;
        }
        double tb = 0, cnt = 0;
        for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
            if ((ChiTietDiem.at(i).getMaBoDe().equals(maDe))) {
                tb += ChiTietDiem.at(i).getDiem();
                cnt++;
            }
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|\n", " Ma de", " Ma hoc phan", " Thoi gian", " So cau",
                " Trung binh");
        if (cnt == 0) {
            bangTBDe(BoDe.at(BoDe.timKiem(maDe)), "Khong co");
        } else {
            String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
            bangTBDe(BoDe.at(BoDe.timKiem(maDe)), TB);
        }
        System.out.println("---------------------------------------------------------------------------------");
        nhap.waiting();
    }

    void xemDiemTBTatCaDe() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|\n", " Ma de", " Ma hoc phan", " Thoi gian", " So cau",
                " Trung binh");
        for (int k = 0; k < BoDe.soLuong(); k++) {
            String maDe = BoDe.at(k).getMaDe();
            double tb = 0, cnt = 0;
            for (int i = 0; i < ChiTietDiem.soLuong(); i++) {
                if ((ChiTietDiem.at(i).getMaBoDe().equals(maDe))) {
                    tb += ChiTietDiem.at(i).getDiem();
                    cnt++;
                }
            }
            if (cnt == 0) {
                bangTBDe(BoDe.at(BoDe.timKiem(maDe)), "Khong co");
            } else {
                String TB = BigDecimal.valueOf(tb / cnt).setScale(3, RoundingMode.HALF_UP).toString();
                bangTBDe(BoDe.at(BoDe.timKiem(maDe)), TB);
            }
        }
        System.out.println("---------------------------------------------------------------------------------");
        nhap.waiting();
    }

    void xemDiemTheoDe() {
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("|   1.Xem diem 1 de              |");
            System.out.println("|   2.xem diem tat ca de         |");
            System.out.println("|   3.Xem diem trung binh de     |");
            System.out.println("|   4.Thoat                      |");
            System.out.println("----------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    xemDiem1De();
                    break;
                case 2:
                    xemDiemTatCaDe();
                    break;
                case 3:
                    xemDiemTBDe();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    public void doiThongTinGV(String maGv) {
        while (true) {
            System.out.println("   Thay doi thong tin ca nhan");
            System.out.println("----------------------------------");
            System.out.println("|   1.Ho va Ten                  |");
            System.out.println("|   2.Que quan                   |");
            System.out.println("|   3.Ngay sinh                  |");
            System.out.println("|   4.So dien thoai              |");
            System.out.println("|   5.Gioi tinh                  |");
            System.out.println("|   6.Mat khau                   |");
            System.out.println("|   7.Thoat                      |");
            System.out.println("----------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 7);
            switch (luachon) {
                case 1:
                    System.out.println("Nhap Ho va ten: ");

                    String hoTen = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                    GiangVien.at(GiangVien.timKiem(maGv)).setHoTen(hoTen);
                    break;
                case 2:
                    System.out.println("Nhap que quan: ");
                    String queQuan = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                    GiangVien.at(GiangVien.timKiem(maGv)).setQueQuan(queQuan);
                    break;
                case 3:
                    date ngaySinh = new date();
                    ngaySinh.nhap();
                    GiangVien.at(GiangVien.timKiem(maGv)).setNgaySinh(ngaySinh);
                    break;
                case 4:
                    System.out.println("Nhap so dien thoai: ");
                    String sdt = nhap.kiemTraChuoi(nhap.soLuongKyTuChuoi);
                    GiangVien.at(GiangVien.timKiem(maGv)).setSdt(sdt);
                    break;
                case 5:
                    System.out.println("Nhap gioi tinh: ");
                    String gioiTinh = nhap.kiemTraGioiTinh();
                    GiangVien.at(GiangVien.timKiem(maGv)).setGioiTinh(gioiTinh);
                    break;
                case 6:
                    doiMatKhau();
                    break;
                case 7:
                    return;
                default:
                    break;
            }
        }
    }

    public void menuAdmin() {
        while (true) {
            System.out.println("     Menu quan tri vien");
            System.out.println("--------------------------------");
            System.out.println("|   1.Sinh vien                |");
            System.out.println("|   2.Giang vien               |");
            System.out.println("|   3.Hoc phan                 |");
            System.out.println("|   4.Nhom hoc phan            |");
            System.out.println("|   5.Thoat                    |");
            System.out.println("--------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 5);
            switch (luachon) {
                case 1:
                    quanLySinhVien();
                    break;

                case 2:
                    quanLyGiangVien();
                    break;
                case 3:
                    quanLyHocPhan();
                    break;
                case 4:
                    quanLyNhom();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }

    public void quanLyGiangVien() {
        System.out.println("Quan Ly Giang Vien");
        System.out.println("-------------------------");
        System.out.println("|   1.Them giang vien   |");
        System.out.println("|   2.Xoa giang vien    |");
        System.out.println("|   3.Sua thong tin     |");
        System.out.println("|   4.Thoat             |");
        System.out.println("-------------------------");
        System.out.println("Nhap lua chon cua ban: ");
        int luachon = nhap.kiemTraSo(1, 4);
        switch (luachon) {
            case 1:
                themGiangVien();
                nhap.waiting();
                break;
            case 2:
                xoaGiangVien();
                nhap.waiting();
                break;
            case 3:
                suaThongTinGv();
                nhap.waiting();
                break;
            default:
                break;
        }
    }

    public void themGiangVien() {
        System.out.println("Nhap so luong giang vien muon them: ");
        int n = nhap.kiemTraSo(1);
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap giang vien thu " + i + " : ");
            giangVien gv = new giangVien();
            gv.nhap();
            gv.setmaGV(Integer.toString(GiangVien.idNext()));
            GiangVien.them(gv);
            String pass = Integer.toString(gv.getNgaySinh().getNgay()) + Integer.toString(gv.getNgaySinh().getThang())
            + Integer.toString(gv.getNgaySinh().getNam());
            taiKhoan tk = new taiKhoan(gv.getmaGV(), pass, "gv");
            TaiKhoan.them(tk);
        }
    }

    public void xoaGiangVien() {
        System.out.println("Nhap ma giang vien ban muon xoa: ");
        String maGv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        GiangVien.xoa(maGv);
        for (int i = 0; i < BoDe.soLuong(); i++) {
            if (BoDe.at(i) instanceof deTuTao) {
                deTuTao tmp = (deTuTao) BoDe.at(i);
                tmp.setMaGvTaoDe("Gv da bi xoa");
                BoDe.setAt(i, tmp);
            }
        }
        TaiKhoan.xoa(maGv);
    }

    public void suaThongTinGv() {
        System.out.println("Nhap ma so giang vien muon sua: ");
        String maGv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (GiangVien.timKiem(maGv) == -1) {
            System.out.println("Giang vien khong ton tai!!");
            return;
        }
        doiThongTinGV(maGv);
    }

    public void quanLySinhVien() {
        System.out.println("Quan Ly Sinh Vien");
        System.out.println("------------------------");
        System.out.println("|   1.Them sinh vien   |");
        System.out.println("|   2.Xoa sinh vien    |");
        System.out.println("|   3.Sua thong tin    |");
        System.out.println("|   4.Thoat            |");
        System.out.println("------------------------");
        System.out.println("Nhap lua chon cua ban: ");
        int luachon = nhap.kiemTraSo(1, 4);
        switch (luachon) {
            case 1:
                themSinhVien();
                nhap.waiting();
                break;
            case 2:
                xoaSinhVien();
                nhap.waiting();
                break;
            case 3:
                suaThongTinSv();
                nhap.waiting();
                break;
            default:
                break;
        }
    }

    public void themSinhVien() {
        System.out.println("Nhap so luong sinh vien muon them: ");
        int n = nhap.kiemTraSo(1);
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap sinh vien thu " + i + " : ");
            sinhVien sv = new sinhVien();
            sv.nhap();
            sv.setMSSV(Integer.toString(SinhVien.idNext()));
            SinhVien.them(sv);
            String pass = Integer.toString(sv.getNgaySinh().getNgay()) + Integer.toString(sv.getNgaySinh().getThang())
            + Integer.toString(sv.getNgaySinh().getNam());
            taiKhoan tk = new taiKhoan(sv.getMSSV(), pass, "sv");
            TaiKhoan.them(tk);
        }
    }

    public void xoaSinhVien() {
        System.out.println("Nhap ma sinh vien ban muon xoa: ");
        String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        SinhVien.xoa(maSv);
        for (int i = 0; i < ChiTietNhom.soLuong(); i++) {
            if (ChiTietNhom.at(i).getMaSv().equals(maSv)) {
                ChiTietNhom.xoa(i);
                i--;
            }
        }
        updateNhomHocPhan();
        for (int i = 0; i < BaiLam.soLuong(); i++) {
            if (BaiLam.at(i).getMssv().equals(maSv)) {
                CauHoiBaiLam.xoa(BaiLam.at(i).getMaBailam());
                BaiLam.xoa(i);
            }
        }
        taoBangDiem();
        TaiKhoan.xoa(maSv);
        updateDiem();
    }

    public void suaThongTinSv() {
        System.out.println("Nhap ma so sinh vien muon sua: ");
        String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = SinhVien.timKiem(maSv);
        if (index == -1) {
            System.out.println("Ma sinh vien khong ton tai!");
            return;
        }
        doiThongTinSV(maSv);
    }

    public void quanLyHocPhan() {
        while (true) {
            System.out.println("Menu Hoc Phan");
            System.out.println("--------------------------------");
            System.out.println("|    1.Them Hoc Phan           |");
            System.out.println("|    2.Sua Hoc Phan            |");
            System.out.println("|    3.Xoa Hoc Phan            |");
            System.out.println("|    4.Thoat                   |");
            System.out.println("--------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int luachon = nhap.kiemTraSo(1, 4);
            switch (luachon) {
                case 1:
                    themHocPhan();
                    nhap.waiting();
                    break;
                case 2:
                    suaHocPhan();
                    nhap.waiting();
                    break;
                case 3:
                    System.out.println("Viec xoa hoc phan se xoa tat ca nhom hoc phan lien quan");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("|                       1.Xac nhan                       |");
                    System.out.println("|                       2.Thoat                          |");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Nhap lua chon cua ban:");
                    int key = nhap.kiemTraSo(1, 2);
                    switch (key) {
                        case 1:
                            xoaHocPhan();
                            nhap.waiting();
                            break;
                        case 2:
                            continue;
                    }

                case 4:
                    return;

                default:
                    break;
            }

        }
    }

    public void themHocPhan() {
        System.out.println("Nhap so luong hoc phan ban muon them: ");
        int n = nhap.kiemTraSo(1);
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap hoc phan thu " + i + ": ");
            System.out.println("Nhap ma hoc phan:");
            String maHocPhan =nhap.kiemTraMa(nhap.soLuongKyTuMa);
            if(HocPhan.kiemTraKhoaChinh(maHocPhan)){
                taoHocPhan(maHocPhan);
            }
            else{
                System.out.println("Hoc phan da ton tai!!");
            }
        }
    }

    public void suaHocPhan() {
        System.out.println("Nhap ma hoc phan ban muon sua: ");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        int index = HocPhan.timKiem(maHocPhan);
        if (index == -1) {
            System.out.println("Hoc phan khong ton tai");
            return;
        }
        while(true){
            System.out.println("      Ban muon sua:");
            System.out.println("---------------------------");
            System.out.println("|  1. Ma hoc phan         |");
            System.out.println("|  2. Cac thong tin khac  |");
            System.out.println("|  3. Thoat               |");
            System.out.println("---------------------------");
            System.out.println("Nhap lua chon cua ban");
            int luachon=nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    suaMaHocPhan(maHocPhan);
                    break;
                case 2:
                    HocPhan.at(index).sua();
                    break;
                default:
                    return;
            }
        }
    }

    public void suaMaHocPhan(String maHocPhan){
        System.out.println("Nhap ma hoc phan moi");
        String maHocPhanMoi=nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if(!HocPhan.kiemTraKhoaChinh(maHocPhanMoi)){
            System.out.println("Ma hoc phan da ton tai!!");
            return;
        }
        HocPhan.at(HocPhan.timKiem(maHocPhan)).setMaHocPhan(maHocPhanMoi);
        System.out.printf("Ban co muon thay doi tat ca %s thanh %s khong ??\n", maHocPhan, maHocPhanMoi);
        System.out.println("--------------");
        System.out.println("|  1. Co     |");
        System.out.println("|  2. Khong  |");
        System.out.println("--------------");
        System.out.println("Nhap lua chon cua ban.");
        int luaChon=nhap.kiemTraSo(1, 2);
        if(luaChon==1){
            for(int i=0;i<BaiLam.soLuong();i++){
                if(BaiLam.at(i).getHocPhan().equals(maHocPhan)){
                    BaiLam.at(i).setHocPhan(maHocPhanMoi);
                }
            }

            for(int i=0;i<BoDe.soLuong();i++){
                if(BoDe.at(i).getmaHocPhan().equals(maHocPhan)){
                    BoDe.at(i).setMaHocPhan(maHocPhanMoi);
                }
            }

            for(int i=0;i<CauTrucDeThi.soLuong();i++){
                if(CauTrucDeThi.at(i).getMaHocPhan().equals(maHocPhan)){
                    CauTrucDeThi.at(i).setMaHocPhan(maHocPhanMoi);
                }
            }

            for(int i=0;i<Chuong.soLuong();i++){
                if(Chuong.at(i).getMaHocPhan().equals(maHocPhan)){
                    Chuong.at(i).setMaHocPhan(maHocPhanMoi);
                }
            }

            for(int i=0;i<NhomHocPhan.soLuong();i++){
                if(NhomHocPhan.at(i).getMaHocPhan().equals(maHocPhan)){
                    NhomHocPhan.at(i).setMaHocPhan(maHocPhanMoi);
                }
            }
        }
    }

    public void xoaHocPhan() {
        System.out.println("Nhap ma hoc phan ban muon xoa: ");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (HocPhan.timKiem(maHocPhan) == -1) {
            System.out.println("Ma hoc phan khong ton tai!!");
            return;
        }
        HocPhan.xoa(maHocPhan);
        for (int i = 0; i < NhomHocPhan.soLuong(); i++) {
            if (NhomHocPhan.at(i).getMaHocPhan().equals(maHocPhan)) {
                ChiTietNhom.xoaNhomHocPhan(NhomHocPhan.at(i).getMaNhom());
                NhomHocPhan.xoa(i);
                i--;
            }
        }

        for (int i = 0; i < CauTrucDeThi.soLuong(); i++) {
            if (CauTrucDeThi.at(i).getMaHocPhan().equals(maHocPhan)) {
                CauTrucDeThi.xoa(i);
                i--;
            }
        }

        for (int i = 0; i < BoDe.soLuong(); i++) {
            if (BoDe.at(i).getmaHocPhan().equals(maHocPhan)) {
                CauHoiBoDe.xoa(BoDe.at(i).getMaDe());
                xoaBaiLamTheoDe(BoDe.at(i).getMaDe());
                BoDe.xoa(i);
                i--;
            }
        }

    }

    public void quanLyNhom() {
        while (true) {
            System.out.println("Quan Ly Nhom");
            System.out.println("-------------------------------");
            System.out.println("| 1.Them Nhom Hoc Phan        |");
            System.out.println("| 2.Sua Nhom Hoc Phan         |");
            System.out.println("| 3.Xoa Nhom Hoc Phan         |");
            System.out.println("| 4.Thoat                     |");
            System.out.println("-------------------------------");
            int luaChon = nhap.kiemTraSo(1, 4);
            switch (luaChon) {
                case 1:
                    themNhomHocPhan();
                    nhap.waiting();
                    break;
                case 2:
                    suaNhomHocPhan();
                    nhap.waiting();
                    break;
                case 3:
                    xoaNhomHocPhan();
                    nhap.waiting();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    public void themNhomHocPhan() {
        System.out.println("Nhap ma hoc phan: ");
        String maHocPhan = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (HocPhan.timKiem(maHocPhan) == -1) {
            System.out.println("Hoc phan khong ton tai!!");
            System.out.println("Khong the tao nhom hoc phan!");
            return;
        }
        System.out.println("Nhap so luong nhom ban muon them: ");
        int n = nhap.kiemTraSo(1);
        for (int i = 1; i <= n; i++) {
            NhomHocPhan.them(new nhomHocPhan(Integer.toString(NhomHocPhan.idNext()), maHocPhan, 0));
        }
    }

    public void suaNhomHocPhan() {
        while (true) {

            System.out.println("-----------------------------------------");
            System.out.println("|    1.Them sinh vien vao nhom hoc phan |");
            System.out.println("|    2.Xoa sinh vien khoi nhom hoc phan |");
            System.out.println("|    3.Thoat                            |");
            System.out.println("-----------------------------------------");
            System.out.println("Nhap lua chon cua ban: ");
            int luachon = nhap.kiemTraSo(1, 3);
            switch (luachon) {
                case 1:
                    themSvVaoNhom();
                    break;
                case 2:
                    xoaSvKhoiNhom();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
            updateNhomHocPhan();
        }
    }

    public void themSvVaoNhom() {
        System.out.println("Nhap ma sinh vien: ");
        String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (SinhVien.timKiem(maSv) == -1) {
            System.out.println("Ma sinh vien khong ton tai!!");
            return;
        }
        System.out.println("Nhap ma nhom:");
        String maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (NhomHocPhan.timKiem(maNhom) == -1) {
            System.out.println("Ma nhom khong ton tai!!");
            return;
        }
        ChiTietNhom.them(new chiTietNhom(maNhom, maSv));
        updateNhomHocPhan();
    }

    public void xoaSvKhoiNhom() {
        System.out.println("Nhap ma sinh vien: ");
        String maSv = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (SinhVien.timKiem(maSv) == -1) {
            System.out.println("Ma sinh vien khong ton tai!!");
            return;
        }
        System.out.println("Nhap ma nhom:");
        String maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        if (NhomHocPhan.timKiem(maNhom) == -1) {
            System.out.println("Ma nhom khong ton tai!!");
            return;
        }
        ChiTietNhom.xoa(maNhom, maSv);
        updateNhomHocPhan();
    }

    public void xoaNhomHocPhan() {
        System.out.println("Nhap ma nhom hoc phan ban muon xoa: ");
        String maNhom = nhap.kiemTraMa(nhap.soLuongKyTuMa);
        ChiTietNhom.xoaNhomHocPhan(maNhom);
        NhomHocPhan.xoa(maNhom);
        System.out.println("Xoa nhom thanh cong");
    }

    public void check() {
        TaiKhoan.xuat();
        System.out.println(TaiKhoan.idNext());

        LuaChon.xuat();
        System.out.println(LuaChon.idNext());
        NganHangCauHoi.xuat();
        System.out.println(NganHangCauHoi.idNext());
        NhomCauHoi.xuat();
        System.out.println(NhomCauHoi.idNext());
        ChiTietNhom.xuat();
        System.out.println(ChiTietNhom.idNext());

        HocPhan.xuat();
        System.out.println(HocPhan.idNext());
        Chuong.xuat();
        System.out.println(Chuong.idNext());
        NhomHocPhan.xuat();
        System.out.println(NhomHocPhan.idNext());
        SinhVien.xuat();
        System.out.println(SinhVien.idNext());
        GiangVien.xuat();
        System.out.println(GiangVien.idNext());

        ChiTietCauTrucDeThi.xuat();
        System.out.println(ChiTietCauTrucDeThi.idNext());
        CauTrucDeThi.xuat();
        System.out.println(CauTrucDeThi.idNext());
        BoDe.xuat();
        System.out.println(BoDe.idNext());
        CauHoiBoDe.xuat();
        System.out.println(CauHoiBoDe.idNext());

        BangDiem.xuat();
        System.out.println(BangDiem.idNext());
        ChiTietDiem.xuat();
        System.out.println(ChiTietDiem.idNext());

        BaiLam.xuat();
        System.out.println(BaiLam.idNext());
        CauHoiBaiLam.xuat();
    }

    public void start() {
        docFile();
        // Ham Init dung de khoi tao lai du lieu dung cho kiem tra chuong trinh
        // Init(); 
        menuChinh();

        ghiFile();
    }
}