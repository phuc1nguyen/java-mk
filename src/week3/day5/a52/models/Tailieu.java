package week3.day5.a52.models;

public class Tailieu {
    private int maTaiLieu;
    private String nxb;
    private int soBanPhatHanh;

    public Tailieu() {

    }

    public Tailieu(int maTaiLieu, String nxb, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nxb = nxb;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "Tailieu{" +
                "maTaiLieu=" + maTaiLieu +
                ", nxb='" + nxb + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
