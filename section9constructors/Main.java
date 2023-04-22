package section9constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank b1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Is there a initial deposit? (y/n): ");
        String initalDeposit = scanner.nextLine();

        if(initalDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double balance = scanner.nextDouble();
            b1 = new Bank(number,holder,balance);
        }else{
            b1 = new Bank(number,holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(b1);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        b1.depositMoney(depositValue);

        System.out.println();
        System.out.println("Account data:");
        System.out.println(b1);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        b1.withdrawMoney(withdrawValue);

        System.out.println();
        System.out.println("Account data:");
        System.out.println(b1);

        scanner.close();
    }
}
