package OOPS.iheritance;

class GrandParent{
    void grandParentMethod(){
        System.out.println("This is grandparent");
    }
}
class Parent extends GrandParent{
    void m1(){
        System.out.println("This is m1 method");
    }
}

class Child extends Parent {
    void m2(){
        System.out.println("This is m2 method");
    }
}

public class PracticeExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.m2();
        obj.m1();
        obj.grandParentMethod();

    }
}
