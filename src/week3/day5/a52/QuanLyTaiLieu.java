package week3.day5.a52;

import week3.day5.a52.models.Tailieu;

import java.util.ArrayList;

public class QuanLyTaiLieu implements QLTLInterface {

    @Override
    public Tailieu themTL(int maTL, String nxb, int soBanPhatHanh) {
        Tailieu tl = new Tailieu();
        tl.setMaTaiLieu(maTL);
        tl.setNxb(nxb);
        tl.setSoBanPhatHanh(soBanPhatHanh);
        return tl;
    }

    @Override
    public void xoaTaiLieu(int maTL, ArrayList<Tailieu> tl) {
        for (Tailieu item:tl) {
            if (item.getMaTaiLieu() == maTL) {
                tl.remove(item);
                return;
            }
        }
    }

    @Override
    public void hienThiTL(ArrayList<Tailieu> tl) {
        for (Tailieu item:tl) {
            System.out.println(item.toString());
        }
    }

    @Override
    public Tailieu timKiemTL(int maTaiLieu, ArrayList<Tailieu> tl) {
        for (Tailieu item:tl) {
            if (item.getMaTaiLieu() == maTaiLieu)
                return item;
        }
        return null;
    }
}
