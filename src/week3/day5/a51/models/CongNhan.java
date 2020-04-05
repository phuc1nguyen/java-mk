package week3.day5.a51.models;

public class CongNhan extends CanBo {
    private int level;

    public CongNhan() {
    }

    public CongNhan(CanBo cb, int level) {
        this.setName(cb.getName());
        this.setAge(cb.getAge());
        this.setGender(cb.getGender());
        this.setAddress(cb.getAddress());
        this.level = level;
    }

    /*public CongNhan(String name, int age, String gender, String add, int level) {
       this.setName(super.getName());
       this.setAge(super.getAge());
       this.setGender(super.getGender());
       this.setAddress(super.getAddress());
       this.level = level;
    }*/

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
