package section14inheritance.exercise3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i  < qtd; i++){
            System.out.println(String.format("Shape #%d data", (i+1) ));

            System.out.print("Rectangle or Circle (r/c)? ");
            char type = sc.nextLine().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();

            if(type == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                sc.nextLine();

                System.out.print("Height: ");
                Double height = sc.nextDouble();
                sc.nextLine();

                Shape s = new Rectangle(Color.valueOf(color), width, height);
                shapes.add(s);
            } else if (type == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                sc.nextLine();

                Shape s = new Circle(Color.valueOf(color), radius);
                shapes.add(s);
            }

        }

        System.out.println("SHAPE AREAS:");
        for (Shape s : shapes){
            System.out.println(String.format("%.2f",s.area()));
        }

        sc.close();
    }
}
