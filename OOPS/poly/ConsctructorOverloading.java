package OOPS.poly;

public class ConsctructorOverloading {
    public static void main(String[] args) {
        //Constructor overloading
        //one class, but args must be different
        new ConsctructorOverloading();
        new ConsctructorOverloading(10);

    }
    public ConsctructorOverloading(){
        System.out.println("Default Constructor");
    }

    public ConsctructorOverloading(int a){
        System.out.println("Para Cons int:"+a);
    }

}
