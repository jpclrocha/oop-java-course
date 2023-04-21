package section10.employees.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(name, id, salary);
            employees.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have the salary increase: ");
        int id = sc.nextInt();

        Employee emp =  employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("This id do not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
       for(Employee e : employees){
           System.out.println(e);
       }

        sc.close();
    }
}
