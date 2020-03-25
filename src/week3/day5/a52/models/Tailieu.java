package week3.day5.a52.models;

public class Tailieu {
    private int code;       //Ma tai lieu duy nhat
    private String publisher;       //Nha xuat ban
    private int copies;     //So ban phat hanh

    public Tailieu() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Tailieu{" +
                "code=" + code +
                ", publisher='" + publisher + '\'' +
                ", copies=" + copies +
                '}';
    }
}
