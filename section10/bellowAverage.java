package section10;

import java.util.Scanner;

public class bellowAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = sc.nextInt();

        double soma = 0;
        double[] arr = new double[qtd];
        for(int i = 0; i<qtd; i++){
            System.out.print("Digite um numero: ");
            double n = sc.nextDouble();
            arr[i] = n;
            soma += n;
        }

        double media = soma / arr.length;

        System.out.println("Media do vetor: " + media);

        System.out.println("Elementos abaixo da media: ");

        for(int i = 0; i<qtd; i++){
            if(arr[i] < media){
                System.out.println(arr[i]);
            }
        }
    }
}
