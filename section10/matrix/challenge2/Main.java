package section10.matrix.challenge2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de M (linha): ");
        int m = sc.nextInt();

        System.out.print("Digite o valor de N (coluna): ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for(int row = 0; row < m; row++){
            for (int column = 0; column < n; column++){
                mat[row][column] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int row = 0; row < m; row++){
            for (int column = 0; column < n; column++){
                System.out.print(mat[row][column] + " ");
            }
            System.out.println();
        }


        System.out.println("Enter a number to filter: ");
        int number = sc.nextInt();

        for(int row = 0; row < m; row++){
            for (int column = 0; column < n; column++){
                if(mat[row][column] == number){
                    System.out.println("Positio: " + row + "," + column + ":");
                    if (column > 0){
                        System.out.println("Left: " + mat[row][column-1]);
                    }
                    if(row > 0){
                        System.out.println("Top: " + mat[row-1][column]);
                    }
                    if (column < mat[row].length - 1) {
                        System.out.println("Right: " + mat[row][column + 1]);
                    }
                    if(row < mat.length - 1){
                        System.out.println("Down: " + mat[row + 1][column]);
                    }
                }
            }
            System.out.println();
        }







        sc.close();
    }
}
