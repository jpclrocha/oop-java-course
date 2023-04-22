package section10arrays.problems;

import java.util.Locale;
import java.util.Scanner;

public class heightProblem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double percentual = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        int pessoas = sc.nextInt();
        String[] nomes = new String[pessoas];
        int[] idades = new int[pessoas];
        double[] alturas = new double[pessoas];

        for (int i = 0; i < pessoas; i++){
            System.out.println("Dados da " + (i + 1) +" pessoa: \n");
            System.out.print("Nome: ");
            String nome = sc.next();
            nomes[i] = nome;

            System.out.println("Idade: ");
            int idade = sc.nextInt();
            idades[i] = idade;
            if(idade<16){
                percentual += 1;
            }
            sc.nextLine();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            alturas[i] = altura;
        }

        double somaAlturas = 0;
        for(int i = 0; i < alturas.length; i++){
            somaAlturas += alturas[i];
        }

        double media = somaAlturas/alturas.length;
        System.out.printf("Altura média: %.2f\n", media);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", (percentual/pessoas)*100);
        for(int i = 0; i < pessoas; i++){
            if(idades[i] < 16){
                System.out.printf("%s\n", nomes[i]);
            }
        }

    }
}
