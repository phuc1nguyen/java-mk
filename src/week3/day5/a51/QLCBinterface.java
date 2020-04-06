package week3.day5.a51;

import week3.day5.a51.models.CanBo;

import java.util.LinkedList;
import java.util.List;

public abstract class QLCBInterface {
    abstract CanBo addCanBo(String name, int age, String gender, String add);
    abstract CanBo searchByName(String name, List<CanBo> cbList);
    abstract CanBo searchByAge(int age, List<CanBo> cbList);
    abstract void displayCanBoList(LinkedList<LinkedList<CanBo>> cbList);
}
