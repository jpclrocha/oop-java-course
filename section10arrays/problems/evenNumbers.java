package section10arrays.problems;

import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        int[] numeros = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            numeros[i] = number;
        }

        System.out.println("Numeros pares:");

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
