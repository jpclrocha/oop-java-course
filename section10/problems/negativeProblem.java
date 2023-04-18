package section10.problems;

import java.util.Scanner;

public class negativeProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will u give me? ");
        int numbers = scanner.nextInt();

        int[] arr = new int[numbers];
        for(int i = 0; i < numbers; i++){
            System.out.print("Digit a number: ");
            int number = scanner.nextInt();
            arr[i] = number;
        }

        System.out.println("Negative numbers:");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0) System.out.println(arr[i]);
        }
    }
}
