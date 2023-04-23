package section15exceptions.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Withdraw limit: ");
            Double withdraw = sc.nextDouble();
            sc.nextLine();


            Account ac = new Account(number, holder, balance, withdraw);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            sc.nextLine();

            ac.withdraw(amount);
            System.out.println(ac);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
