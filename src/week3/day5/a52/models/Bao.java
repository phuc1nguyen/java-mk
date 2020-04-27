package week3.day5.a52.models;

public class Bao extends Tailieu {
    private int ngayPhatHanh;

    public Bao() {

    }

    public Bao(Tailieu tl, int ngayPhatHanh) {
        this.setMaTaiLieu(tl.getMaTaiLieu());
        this.setNxb(tl.getNxb());
        this.setSoBanPhatHanh(tl.getSoBanPhatHanh());
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "maTaiLieu=" + super.getMaTaiLieu() +
                ", nxb='" + super.getNxb() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                ", ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
