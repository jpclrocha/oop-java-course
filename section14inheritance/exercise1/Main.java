package section14inheritance.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int emps = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < emps; i++){
            System.out.println(String.format("Employee #%d data", (i+1) ));
            System.out.print("Outsourced (y/n)? ");
            char out = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            sc.nextLine();

            if(out == 'y'){
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();

                Employee emp =  new OutsourcedEmployee(name, hours, value, charge);
                employees.add(emp);
            }else{
                Employee emp =  new Employee(name, hours, value);
                employees.add(emp);
            }
        }

        System.out.println("PAYMENTS:");
        for(Employee emp : employees){
            System.out.println(emp);
        }

        sc.close();
    }
}
