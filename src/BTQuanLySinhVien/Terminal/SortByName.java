package QuanLySinhVien.Terminal;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student stu1, Student stu2) {
        return stu1.getName().compareTo(stu2.getName());
    }
}
