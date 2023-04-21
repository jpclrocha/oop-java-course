package section13.exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the department's name: ");
        String department = sc.nextLine();
        Department d1 = new Department(department);

        System.out.println("\nEnter worker data");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        Double salary = sc.nextDouble();
        Worker w1 = new Worker(name, WorkerLevel.valueOf(level), salary, d1);

        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < contracts; i++){
            System.out.println();
            System.out.println(String.format("Enter contract #%d data: ", (i+1)));

            System.out.print("Date (DD/MM/YYYY): ");
            String dt = sc.nextLine();
            LocalDate date = LocalDate.parse(dt, DateTimeFormatter.ofPattern("d/MM/yyyy"));


            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
            HourContract contract = new HourContract(date, value, hours);
            w1.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String data = sc.next();
        int month = Integer.parseInt(data.substring(0,2));
        int year = Integer.parseInt(data.substring(3));

        System.out.println(w1);
        System.out.println("Income for " + data + ": " + w1.income(year, month));

        sc.close();
    }
}
