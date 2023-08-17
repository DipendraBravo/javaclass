package Binding;

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

public class EarlyBinding {
    public static void main(String[] args) {
        A obj = new B();  // Reference type is A, but object type is B
        obj.show();       // Early binding: Calls show() method from class A
    }
}
