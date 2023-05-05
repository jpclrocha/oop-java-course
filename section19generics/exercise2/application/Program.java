package section19generics.exercise2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();


        System.out.print("How many students for course A? ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            int code = sc.nextInt();
            a.add(code);
        }

        System.out.print("How many students for course B? ");
        int qtdB = sc.nextInt();
        for (int i = 0; i < qtdB; i++) {
            int code = sc.nextInt();
            b.add(code);
        }

        System.out.print("How many students for course C? ");
        int qtdC = sc.nextInt();
        for (int i = 0; i < qtdC; i++) {
            int code = sc.nextInt();
            c.add(code);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
