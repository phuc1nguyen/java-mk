package week3.day5.a51.models;

public class CanBo {
    private String name;
    private int age;
    private String gender;
    private String address;

    public CanBo() {            // No-args constructor, neu ko khai bao constructor thi chuong trinh cung se tao ra default constructor khi tao object cua mot class
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
