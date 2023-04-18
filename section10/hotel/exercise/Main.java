package section10.hotel.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int qtd = sc.nextInt();
        Rental[] hotel =  new Rental[10];


        for(int i = 0; i < qtd; i++){
            System.out.println();
            sc.nextLine();
            System.out.println("Rent #"+( i + 1 ));


            System.out.print("Name: ");
            String nome = sc.nextLine();


            System.out.print("Email: ");
            String email = sc.nextLine();



            System.out.print("Room: ");
            int room = sc.nextInt();

            Rental rental = new Rental(nome, email, room);
            hotel[room] = rental;
        }


        System.out.println("Busy rooms:");
        for (int i = 0; i < hotel.length; i++){
            if(hotel[i] != null){
                System.out.println(hotel[i].toString());
            }
        }
    }
}
