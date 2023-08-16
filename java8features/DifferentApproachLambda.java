package java8features;

@FunctionalInterface
interface Methods{
    void add();
}

public class DifferentApproachLambda {
    int a;
    int b;

    public DifferentApproachLambda(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display(){
        Methods methods = ()->{
            System.out.println(a+b);
        };
        methods.add();

        Methods methods1 = () -> System.out.println(a+b);
        methods1.add();
    }

    public static void main(String[] args) {
        DifferentApproachLambda differentApproachLambda = new DifferentApproachLambda(10,20);
        differentApproachLambda.display();
    }
}
