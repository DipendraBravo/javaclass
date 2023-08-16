package java8features;

@FunctionalInterface
interface Properties{
   void add(int a, int b);
}
public class FunctionalInterfacePractice implements Properties {
    public static void main(String[] args) {

        //Inheritance
        FunctionalInterfacePractice functionalInterfacePractice  = new FunctionalInterfacePractice();
        functionalInterfacePractice.add(12,12);

        //polymorphsim
        Properties properties = new FunctionalInterfacePractice();
        properties.add(5,6);

    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);

    }
}
