package section14inheritance.exercise4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++){
            System.out.println(String.format("Tax payer #%d data",(i+1) ));

            System.out.print("Individual or Company (i/c)? ");
            char type = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            Double income = sc.nextDouble();
            sc.nextLine();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double value = sc.nextDouble();
                sc.nextLine();

                Person p = new NaturalPerson(name, income, value);
                people.add(p);
            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                Integer employeesNumber = sc.nextInt();
                sc.nextLine();

                Person p = new LegalPerson(name, income, employeesNumber);
                people.add(p);
            }
        }

        System.out.println("\nTAXES PAID:");
        Double total = 0.0;
        for (Person p : people){
            total += p.taxes();
            System.out.println(p.toString());
        }

        System.out.println(String.format("\nTOTAL TAXES: $ %.2f", total));

        sc.close();
    }
}
