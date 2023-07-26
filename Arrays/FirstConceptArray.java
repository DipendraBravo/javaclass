package Arrays;

public class FirstConceptArray {
    public static void main(String[] args) {
        //Arrays are fixed iin size
        //Arrays can hold same type of data(homogeneous)

        //create a array and provide size to it
        int a[] = new int[5];
        System.out.println(a);

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
       // System.out.println(a[6]);//ArrayIndexOutOfBoundsException
    }
}
