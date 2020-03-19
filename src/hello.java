public class Hello {
    String name;
    String mssv;
    int age;
    String email;
    private float gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Sinh vien [Ten: " + this.name + ", mssv: " + this.mssv + ", tuoi: " + this.age
                + ", email: " + this.email +", gpa: " + this.gpa + "]";
    }
}
