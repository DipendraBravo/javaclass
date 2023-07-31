package OOPS.interfaces;
//IN some case we dont want to implement all the abstract methods in interface,then we can implement the
//expected method in abstract class and remaining methods in normal class

interface One{
    void m1();
    void m2();
    void m3();
    void m4();
}
abstract class OneImp implements One{
    @Override
    public void m1(){
        System.out.println("M1 method");
    }
    @Override
    public void m2(){
        System.out.println("M2 method");
    }
}
public class InterfaceSegeration extends OneImp{
    public static void main(String[] args) {

    }


    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}
