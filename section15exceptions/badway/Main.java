package section15exceptions.badway;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DateTimeParseException {
        /*
         Bad way of handling exceptions
         Correction of previous version (awful way package): passed the responsibility os checking values to the Reservation class
         Problems: not throwing exceptions, just returning a string if something that was not expected happens
         Also a bad solution, but better than the awful one
        */


        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Room number: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Check-in date (DD/MM/YYYY): ");
        LocalDate checkin = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Check-out date (DD/MM/YYYY): ");
        LocalDate checkout = LocalDate.parse(sc.nextLine(), dtf);

        if (!checkout.isAfter(checkin)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation2 r = new Reservation2(number, checkin, checkout);
            System.out.println(r);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkin = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkout = LocalDate.parse(sc.nextLine(), dtf);

            String error = r.updateDates(checkin, checkout);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println(r);
            }

        }


        sc.close();
        ;
    }
}
