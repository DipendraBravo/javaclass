package OOPS.interfaces;

//IF A CLASS IMPLEMENTS MORE THAN ONE INTERFACE, THEN INTERFACES ARE SEPARATED BY COMMA.
interface AAA{
    void m1();
}
interface BBB{
    void m2();
}

public class MultipleImplements  implements AAA, BBB{
    public static void main(String[] args) {
        AAA obj = new MultipleImplements();
        obj.m1();
        BBB obj2 = new MultipleImplements();
        obj2.m2();
    }

    @Override
    public void m1() {
        System.out.println("M1 method");
    }

    @Override
    public void m2() {
        System.out.println("M2 method");
    }
}
