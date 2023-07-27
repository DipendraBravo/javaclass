package Arrays;

import java.util.Scanner;

public class InsertingIntoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int a[] = new int[scanner.nextInt()];

        System.out.println("Enter the value in array");
        for(int i=0; i<a.length; i++){
            System.out.println("Enter the value of index "+ i);
            a[i]=scanner.nextInt();
        }
        System.out.println("Displaying array ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        scanner.close();
    }
}
