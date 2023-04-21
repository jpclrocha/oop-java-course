package section10.matrix.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int c = 0; c < n; c++){
            for(int r = 0; r < n; r++){
                matrix[c][r] = sc.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for (int c = 0; c < n; c++){
            System.out.print(matrix[c][c] + " ");
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println();
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}
