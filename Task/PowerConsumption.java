package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PowerConsumption {
    public static void main(String[] args) {
        //scanner class to get input parameter from users
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Fans used in home:");
        int totalFans = scan.nextInt();

        System.out.println("Enter the power consumed by each Fan in watts:");
        double fansPowerConsumped = scan.nextDouble();

        System.out.println("Enter Time consumed by all fans in hours");
        double hoursConsumedByFans = scan.nextDouble();

        //used formula to calculate the power
        double powerFan = totalFans*fansPowerConsumped*hoursConsumedByFans;
        System.out.println("The total power consumed by fan in a day:"+powerFan+"wh");

        //used formula to calculate the unit
        double units =(powerFan)/1000;
        System.out.println("Total units consumed in a day by fan is: "+units+"kwh");

        //used formula to calculate the total units in month
        double totalPowerMonth = units*30;
        System.out.println("Total units consumed in a month by fans: "+totalPowerMonth+"kwh");

        scan.close();
    }
}
