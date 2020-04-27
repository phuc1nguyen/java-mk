package week3.day5.a52.models;

public class Tapchi extends Tailieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public Tapchi() {

    }

    public Tapchi(Tailieu tl, int soPhatHanh, int thangPhatHanh) {
        this.setMaTaiLieu(tl.getMaTaiLieu());
        this.setNxb(tl.getNxb());
        this.setSoBanPhatHanh(tl.getSoBanPhatHanh());
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Tapchi{" +
                "maTaiLieu=" + super.getMaTaiLieu() +
                ", nxb='" + super.getNxb() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                ", soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
