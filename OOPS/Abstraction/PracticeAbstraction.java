package OOPS.Abstraction;

abstract class A{
    public void m1(){
        System.out.println("M1 Method Non ABS");
    }
    public abstract void m2();
}

class B extends A{

    @Override
    public void m2() {
        System.out.println("M2 Method IMplementation");
    }
}

public class PracticeAbstraction {
    public static void main(String[] args) {
        //Abs class can have Abstract method and non abstract method
        B b = new B();
        b.m2();
        b.m1();
    }
}
