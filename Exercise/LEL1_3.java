package Lab_Exercises;

public class LEL1_3 {
    public static void main(String[] args){
        boolean Sagot = true;
        int A = 2;
        int B = 4;
        char Letter = 'c';
        final double Pi = 3.14;

        System.out.println("a)");
        System.out.println("The value of A is " + A + "while B is " + B);
        System.out.println("Letter " + Letter);
        System.out.println("Initial value of Sagot is " + Sagot);
        System.out.println("Pi contains the value " + Pi);

        Sagot = false;
        System.out.println("Sagot is now " + Sagot);
        System.out.println(" ");
        System.out.println("b)");
        System.out.println(A + " * " + B + " = " + (A * B));
    }
}
