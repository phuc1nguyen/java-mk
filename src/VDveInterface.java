interface myInterface1 {
    void action1();
    void action2();
}

interface myInterface2 {
    void action3();
    void action4();
}

public class VDveInterface implements myInterface2, myInterface1 {
    @Override
    public void action1() {
        System.out.println("Haha");
    }

    @Override
    public void action2() {
        System.out.println("Hihi");
    }

    @Override
    public void action3() {
        System.out.println("Hehe");
    }

    @Override
    public void action4() {
        System.out.println("Hoho");
    }

    public static void main(String[] args) {
        VDveInterface hic = new VDveInterface();
        hic.action1();
        hic.action2();
        hic.action3();
        hic.action4();
    }
}

