package week3.day5.a51;

import week3.day5.a51.models.CanBo;

import java.util.List;

public abstract class QLCBInterface {
    abstract CanBo addCanBo(String name, int age, String gender, String add);
    abstract Object searchByNameOrAge(String name, int age, List<CanBo> cbList);
    abstract void displayCanBoList(List<CanBo> cbList);
}
