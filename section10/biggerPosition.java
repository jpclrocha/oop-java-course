package section10;

import java.util.Scanner;

public class biggerPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();
        System.out.println();
        double[] numberArr = new double[qtd];
        for(int i = 0; i < qtd; i++){
            System.out.print("Digite um numero: ");
            double n = sc.nextDouble();
            numberArr[i] = n;
        }

        double maior = 0;
        int posicao = 0;
        for(int i = 0; i < numberArr.length; i++){
            if(numberArr[i] > maior){
                maior = numberArr[i];
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
    }
}
