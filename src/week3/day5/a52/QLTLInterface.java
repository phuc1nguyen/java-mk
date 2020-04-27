package week3.day5.a52;

import week3.day5.a52.models.Tailieu;

import java.util.ArrayList;

public interface QLTLInterface {
    Tailieu themTL(int maTL, String nxb, int soBanPhatHanh);
    void xoaTaiLieu(int maTL, ArrayList<Tailieu> tl);
    void hienThiTL(ArrayList<Tailieu> tl);
    Tailieu timKiemTL(int maTaiLieu, ArrayList<Tailieu> tl);
}
