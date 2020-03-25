package week3.day5.a51;

import week3.day5.a51.models.CanBo;

public abstract class QLCBInterface {
    abstract CanBo addCanBo(String name, int age, String gender, String add);
    abstract CanBo searchByName(String name, CanBo[] cbList);
    abstract void displayCanBoList(CanBo[] cbList);
}
