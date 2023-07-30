package Recursion;

public class TestRecursion {
    static int count = 0;

    static void methodRecursion(){
        count++;
        if(count<=5){
            System.out.println("The recusrion step"+ count);
            methodRecursion();
        }
    }

    public static void main(String[] args) {
        methodRecursion();
    }

}
