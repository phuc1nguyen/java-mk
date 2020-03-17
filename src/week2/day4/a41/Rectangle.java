package week2.day4.a41;

public class Rectangle {
    private float chieuDai;
    private float chieuRong;
    private float chuVi;
    private float dienTich;

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float getChuVi() {
        return (this.chieuDai+this.chieuRong)*2;
    }

    public float getDienTich() {
        return this.chieuDai*this.chieuRong;
    }

    @Override
    public String toString() {
        return "Rectangle: Chieu dai va chieu rong lan luot la " + chieuDai + " va " + chieuRong;
    }
}
