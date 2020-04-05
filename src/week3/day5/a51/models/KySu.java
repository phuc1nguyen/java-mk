package week3.day5.a51.models;

public class KySu extends CanBo {
    private String major;

    public KySu() {
    }

    public KySu(CanBo cb, String major) {
        this.setName(cb.getName());
        this.setAge(cb.getAge());
        this.setGender(cb.getGender());
        this.setAddress(cb.getAddress());
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
