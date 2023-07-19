package Task;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        //Scanner clas s is used to get input from the users.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature in celsius:");
        double celsius = scan.nextDouble();
        //converting degree from Celsius to Fahrenheit degree using formula
        double fahrenheit  = (celsius *9/5)+32;
        System.out.println("The Temperature in fahrenheit is "+fahrenheit+"F");
        scan.close();



    }
}
