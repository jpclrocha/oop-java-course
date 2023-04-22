package section13.exercise3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter client data");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birth = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Client client = new Client(name, email, birthDate);

        System.out.println();
        System.out.println("Enter order data");

        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();
        sc.nextLine();

        Order order = new Order(LocalDateTime.now(),OrderStatus.valueOf(status),client);

        for(int i = 0; i < items; i++){
            System.out.println(String.format("Enter #%d item data", (i + 1) ));

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            Product p = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(p, productQuantity);

            order.addItem(orderItem);

        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
