package week2.day4.a41;

public class Rectangle {
    private float length;
    private float width;
    private float chuVi;

    public Rectangle() {
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float chuVi(float length, float width) {     // Day moi la phuong thuc/procedure tinh chu vi
        return (length+width)*2;
    }

    public float dienTich(float length, float width) {      // Phuong thuc tinh dien tich
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle: Chieu dai va chieu rong lan luot la " + this.length + " va " + this.width + ".";
    }
}
