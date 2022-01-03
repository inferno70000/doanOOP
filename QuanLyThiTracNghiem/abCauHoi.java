package QuanLyThiTracNghiem;

import java.io.*;

public abstract class abCauHoi implements iClass , Serializable{
   protected String maCau;
   protected String noiDung;

    public abCauHoi() {

    }

    public abCauHoi(String maCau, String noiDung) {
        this.maCau = maCau;
        this.noiDung = noiDung;
    }

    public void setMaCau(String maCau) {
        this.maCau = maCau;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getMaCau() {
        return maCau;
    }

    public String getNoiDung() {
        return noiDung;
    }

}