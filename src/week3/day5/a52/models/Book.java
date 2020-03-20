package week3.day5.a52.models;

public class Book extends Tailieu {
    private String author;      //Ten tac gia
    private int pageNum;        //So trang

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
