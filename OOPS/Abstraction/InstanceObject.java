package OOPS.Abstraction;

public abstract class InstanceObject {
    InstanceObject(){
        System.out.println("Can create constrcutor but object cannot ne initalized");
    }
    int i =10;
    int j = 20;
    static int a=10;
    static int b=20;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);

//        System.out.println(new InstanceObject().i);
//         cannot create object of abstract class
//        new InstanceObject();
    }
}
