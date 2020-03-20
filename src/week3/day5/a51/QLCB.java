// Day la mot doi tuong chuc nang
package week3.day5.a51;

import week3.day5.a51.models.CanBo;

public class QLCB extends QLCBInterface {

    @Override
    public CanBo addCanBo(String name, int age, String gender, String add){
        CanBo cb = new CanBo();
        cb.setName(name);
        cb.setAge(age);
        cb.setGender(gender);
        cb.setAddress(add);
        return cb;
    }

    @Override
    public CanBo searchByName(String name, CanBo[] cbList) {
        for(CanBo cb:cbList){
            if(cb.getName().equals(name)) return cb;
        }
        return null;
    }

    @Override
    public void displayCanBoList(CanBo[] cbList){
        for (CanBo cb:cbList){
            if (cb != null) System.out.println(cb.getName());
        }
    }
}
