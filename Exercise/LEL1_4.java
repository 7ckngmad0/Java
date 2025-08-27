package Lab_Exercises;
import java.util.Scanner;

public class LEL1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your hourly rate: ");
        double hourlyRate = sc.nextDouble();

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = sc.nextInt();

        System.out.println("Gross pay: " + (hourlyRate * hoursWorked));
        System.out.println("Withholding Tax: " + (hourlyRate * hoursWorked * 0.15));
        System.out.printf("Net pay: %.3f", (hourlyRate * hoursWorked - (hourlyRate * hoursWorked * 0.15)));

        sc.close();
    }
}
