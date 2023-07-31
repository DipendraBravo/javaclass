package OOPS.interfaces;

//In interface we declare all abstract methods by default they are public and actract. All the interface methods
//need to0 implemented in child class

public class PracticeInterface implements ChildOne  {
    public static void main(String[] args) {
        ChildOne obj = new PracticeInterface();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m3() {
        System.out.println("m3 method");
    }

    @Override
    public void m4() {
        System.out.println("m4 method");
    }
}
