package this_super;

class ParentTwo{
    public void m1(){
        System.out.println("M1 Method ParentTwo");
    }
}
public class ChildTwo extends ParentTwo {
    public void m1(){
        System.out.println("M1 Method ChildTwo");
    }
    public void m2(){
        this.m1();
        super.m1();
    }
    public static void main(String[] args) {
    ChildTwo childTwo = new ChildTwo();
    childTwo.m1();

    ParentTwo parentTwo = new ChildTwo();
    parentTwo.m1();

    childTwo.m2();

    }

}
