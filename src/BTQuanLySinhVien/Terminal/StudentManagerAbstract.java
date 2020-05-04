package QuanLySinhVien.Terminal;

import java.util.ArrayList;

public abstract class StudentManagerAbstract {
    abstract Student addStudent(int id, String name, int age, String address, double gpa);
    abstract Student editById(int id, String name, int age, String address, double gpa, ArrayList<Student> stuList);
    abstract void deleteById(int id, ArrayList<Student> stuList);
//    abstract void sortByGpa();
//    abstract void sortByName();
    abstract void showStudent(ArrayList<Student> stuList);
}
