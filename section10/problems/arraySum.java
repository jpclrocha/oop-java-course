package section10.problems;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will u give me? ");
        int numbers = sc.nextInt();

        double[] arr = new double[numbers];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Give me a number: ");
            double number = sc.nextDouble();
            arr[i] = number;
        }

        System.out.println();
        System.out.print("Values: ");
        for (int i = 0; i <arr.length; i++){
            System.out.printf("%.1f  ", arr[i]);
        }


        System.out.println();
        double soma = 0;
        for (int i = 0; i < arr.length; i++){
            soma += arr[i];
        }

        System.out.printf("Sum: %.1f", soma);

        System.out.println();
        double media = soma/arr.length;
        System.out.printf("Medium: %.1f", media);

    }
}
