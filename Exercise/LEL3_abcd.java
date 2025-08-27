package Lab_Exercises;

public class LEL3_abcd {
    public static void main(String[] args){
        int[] arr = {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};

        System.out.print("Original array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println(" ");

        System.out.println(" ");
        System.out.print("all odd: ");
        for (int j : arr){
            if(j % 2 != 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println(" ");
        System.out.print("all even: ");
        for (int j : arr){
            if(j % 2 == 0){
                System.out.print(j + " ");
            }
        }

        System.out.println(" ");
        int max = arr[0];
        for (int j : arr){
            if (j > max){
                max = j;
            }
        }
        System.out.print("highest number: " + max);
        System.out.println(" ");
        int min = arr[0];
        for (int j : arr){
            if(j < min){
                min = j;
            }
        }
        System.out.println("lowest number: " + min);

        System.out.println(" ");
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }

        System.out.print("Sorted array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
}