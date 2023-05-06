package section20lambda.exercise1.application;

import section20lambda.exercise1.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> stock = new ArrayList<>();

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);

                stock.add(new Product(name, price));

                line = br.readLine();
            }

            double avg = stock.stream().map(Product::getPrice).reduce(0.0, Double::sum) / stock.size();
            System.out.printf("Average price: %.2f", avg);
            System.out.println();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> bellowAvg = stock.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed()).toList();

            bellowAvg.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
