package week3.day5.a52.models;

public class Sach extends Tailieu {
    private String tacGia;
    private int soTrang;

    public Sach() {

    }

    public Sach(Tailieu tl, String tacGia, int soTrang) {
        this.setMaTaiLieu(tl.getMaTaiLieu());
        this.setNxb(tl.getNxb());
        this.setSoBanPhatHanh(tl.getSoBanPhatHanh());
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu=" + super.getMaTaiLieu() +
                ", nxb='" + super.getNxb() + '\'' +
                ", soBanPhatHanh=" + super.getSoBanPhatHanh() +
                ", tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
