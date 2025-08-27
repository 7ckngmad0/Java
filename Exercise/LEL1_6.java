package Lab_Exercises;
import java.util.Scanner;

public class LEL1_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Cash on hand: ");
        double cash = sc.nextDouble();
        int remainingCash = (int)cash;

        int thousands = remainingCash / 1000;
        remainingCash = remainingCash % 1000;

        int f_hundreds = remainingCash / 500;
        remainingCash = remainingCash % 500;

        int hundreds = remainingCash / 100;
        remainingCash = remainingCash % 100;

        int fifties = remainingCash / 50;
        remainingCash = remainingCash % 50;

        int twenties = remainingCash / 20;
        remainingCash = remainingCash % 20;

        int tens = remainingCash / 10;
        remainingCash = remainingCash % 10;

        int fives = remainingCash / 5;
        remainingCash = remainingCash % 5;

        int ones = remainingCash;


        System.out.println("Denominations:");
        System.out.println("  1000s: " + thousands);
        System.out.println("  500s: " + f_hundreds);
        System.out.println("  100s: " + hundreds);
        System.out.println("  50s: " + fifties);
        System.out.println("  20s: " + twenties);
        System.out.println("  10s: " + tens);
        System.out.println("  5s: " + fives);
        System.out.println("  1s: " + ones);

        sc.close();
    }
}
