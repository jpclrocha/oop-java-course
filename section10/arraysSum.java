package section10;

import java.util.Scanner;

public class arraysSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qtd = sc.nextInt();

        int[] arr1 = new int[qtd];
        int[] arr2 = new int[qtd];

        for(int i = 0; i< arr1.length; i++){
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            arr1[i] = number;
        }

        for(int i = 0; i< arr1.length; i++){
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            arr2[i] = number;
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < qtd; i++){
            System.out.println(arr1[i]+ arr2[i]);
        }
    }
}
