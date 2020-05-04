package QuanLySinhVien.Terminal;

import java.util.ArrayList;

public class StudentManager extends StudentManagerAbstract {

    @Override
    Student addStudent(int id, String name, int age, String address, double gpa) {
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);
        stu.setGpa(gpa);
        return stu;
    }

    @Override
    Student editById(int id, String name, int age, String address, double gpa, ArrayList<Student> stuList) {
        for (Student stu:stuList) {
            if (id == stu.getId()) {
                stu.setName(name);
                stu.setAge(age);
                stu.setAddress(address);
                stu.setGpa(gpa);
                return stu;
            }
        }
        return null;
    }

    @Override
    void deleteById(int id, ArrayList<Student> stuList) {
        for (Student stu:stuList)
            if (stu.getId() == id) {
                stuList.remove(stu);
                return;
            }
        System.out.println("Deleted.");
    }

    @Override
    void showStudent(ArrayList<Student> stuList) {
        System.out.println("Danh sach sinh vien: ");
        for (Student stu:stuList) {
            System.out.println(stu.toString());
        }
    }
}
