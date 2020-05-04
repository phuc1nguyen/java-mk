package QuanLySinhVien.Terminal;

import java.util.Comparator;

public class SortByGpa implements Comparator<Student> {
    @Override
    public int compare(Student stu1, Student stu2) {
        if (stu1.getGpa() > stu2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
