package week3.day5.a51;

public interface QLCBInterface {
    CanBo addCanBo(String name, int age, String gender, String add);
    CanBo searchByName(String name, CanBo[] cbList);
    void displayCanBoList(CanBo[] cbList);
}
