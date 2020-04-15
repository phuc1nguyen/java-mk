//Day la mot doi tuong chuc nang
package week3.day5.a51;

import week3.day5.a51.models.CanBo;

import java.util.LinkedList;
import java.util.List;

public class QLCB extends QLCBInterface {
    @Override
    public CanBo addCanBo(String name, int age, String gender, String add) {
        CanBo cb = new CanBo();
        cb.setName(name);
        cb.setAge(age);
        cb.setGender(gender);
        cb.setAddress(add);
        return cb;
    }

    @Override
    public CanBo searchByName(String name, List<CanBo> cbList) {
        for(CanBo cb:cbList) {
            if(cb.getName().equals(name))
                return cb;
        }
        return null;
    }

    @Override
    public void displayCanBoList(LinkedList<LinkedList<CanBo>> cbList){
        /*for (LinkedList<CanBo> cb:cbList) {
            if (cb != null)
                System.out.println(cb.toString());
        }*/
        for (int i=0; i < cbList.size(); ++i) {
            if (i == 0) System.out.print("Cong Nhan: ");
            else if (i == 1) System.out.print("Ky Su: ");
            else System.out.print("Nhan Vien: ");
            System.out.println(cbList.get(i).toString());
        }
    }
}
