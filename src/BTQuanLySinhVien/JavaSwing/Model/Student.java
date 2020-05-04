package QuanLySinhVien.JavaSwing.Model;

public class Student {
    private String name;
    private int age;
    private int id;
    private double gpa;
    private String hobby;

    public Student() {
    }

    public Student(String name, int age, int id, int gpa) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + gpa +
                '}';
    }
}
