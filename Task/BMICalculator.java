package Task;


import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        //Creating Scanner object to take parameters from user
        Scanner scan = new Scanner(System.in);

        //To display user to add weight in kilograms
        System.out.println("Enter your weight in Kilogram(kg):");
        //double primitive datatype help to store the value of weight which is decimal format and store in weight variable
        double weight = scan.nextDouble();

        //To display user to add height in Meters
        System.out.println("Enter your height in Meters(M):");
        //double primitive datatype help to store the value of height which is decimal format and store in height variable
        double height = scan.nextDouble();

        //calculating BMI with BMI formula which is kg/meter square and store data in calculateBMI variable
        double calculateBMI = weight/(height*height);

        //Displaying Calculated BMI result to user
        System.out.println("Your BMI is:"+ calculateBMI);

        //closing scanner object
        scan.close();
    }
}
