package week3.day5.a51.models;

public class NhanVien extends CanBo {
    private String job;

    public NhanVien() {
    }

    public NhanVien(CanBo cb, String job) {
        this.setName(cb.getName());
        this.setAge(cb.getAge());
        this.setGender(cb.getGender());
        this.setAddress(cb.getAddress());
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
