package java8features;


interface Aa{
    default void m1(){
        System.out.println("M1 Method A");
    }
}
public class InterfacePractice implements Aa{

    @Override
    public void m1(){
        System.out.println("M1 method Main");
    }

    public static void main(String[] args) {
        InterfacePractice interfacePractice = new InterfacePractice();
        interfacePractice.m1();

        //polymorsihm
        Aa obj = new InterfacePractice();
        obj.m1();


    }
}
