package Lab_Exercises;
import java.util.Scanner;

public class LEL1_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Given : ");
        int minutes = sc.nextInt();
        int hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println(hours + " hours and " + minutes + " minutes");

        sc.close();
    }
}
