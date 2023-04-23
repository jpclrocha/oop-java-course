package section15exceptions.goodway;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         Good way of handling exceptions
         Correction of the previous version (bad way package): throwing exceptions when needed and catching them on the main method
         Also made custom exception for more specificity
         A good way of doing it
        */


        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            Integer number = sc.nextInt();
            sc.nextLine();

            System.out.print("Check-in date (DD/MM/YYYY): ");
            LocalDate checkin = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Check-out date (DD/MM/YYYY): ");
            LocalDate checkout = LocalDate.parse(sc.nextLine(), dtf);

            Reservation3 r = new Reservation3(number, checkin, checkout);
            System.out.println(r);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkin = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkout = LocalDate.parse(sc.nextLine(), dtf);

            r.updateDates(checkin, checkout);
            System.out.println(r);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format!");
        } catch (ReservationException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }

        sc.close();
        ;
    }
}
