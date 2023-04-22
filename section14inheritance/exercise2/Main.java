package section14inheritance.exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products  = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < qtd; i++){
            System.out.println(String.format("Product #%d data", (i+1) ));

            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if(type == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                sc.nextLine();

                Product p = new ImportedProduct(name, price, customsFee);
                products.add(p);
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();

                LocalDate manufactureDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product p = new UsedProduct(name, price, manufactureDate);
                products.add(p);
            }else if (type == 'c') {
                Product p = new Product(name, price);
                products.add(p);
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for(Product p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
