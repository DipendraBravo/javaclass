package OOPS.poly;

class A {
    public void m1(){
        System.out.println("M1:Method of class A");
    }
}
class B extends A{
    public void m1(){
        System.out.println("M1 Method of class B");
    }
}

public class OverRidingMethod {
    public static void main(String[] args) {
        //Method Overriding
        //Need two classes, Method Name must be same

        //Normal Class
        A a = new A();
        a.m1();

        //Inheritance
        B b = new B();
        b.m1();

        //Polymorphism
        A aa = new B();
        aa.m1();
    }
}
