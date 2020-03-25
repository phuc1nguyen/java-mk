package week3.day5.a52;

import week3.day5.a52.models.Tailieu;

public interface QLSInterface {
    Tailieu addTaiLieu(int code, String publisher, int copies);
    Tailieu deleteTaiLieu(int code, Tailieu[] tlList);
    void displayTaiLieu(Tailieu[] tlList);
    Tailieu searchByType(String type, Tailieu[] tlList);
}
