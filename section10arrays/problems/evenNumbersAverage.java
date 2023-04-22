package section10arrays.problems;

import java.util.Scanner;

public class evenNumbersAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = sc.nextInt();

        double soma = 0;
        int pares = 0;
        int[] arr = new int[qtd];

        for (int i = 0; i < qtd; i++){
            System.out.print("Digite um numero: ");
            int n = sc.nextInt();
            arr[i] = n;

            if(n % 2 ==0) {
                soma += n;
                pares++;
            }
        }

        if(pares != 0){
            double media = soma / pares;
            System.out.println("MEDIA DOS PARES = "+media);
        }
        else{
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
