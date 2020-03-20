package week3.day5.a52.models;

public class Magazine extends Tailieu {
    private int issueNum;       //So phat hanh
    private int publishedMonth;        //Thang phat hanh

    public Magazine() {
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public int getPublishedMonth() {
        return publishedMonth;
    }

    public void setPublishedMonth(int publishedMonth) {
        this.publishedMonth = publishedMonth;
    }
}
