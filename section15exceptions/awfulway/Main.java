package section15exceptions.awfulway;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DateTimeParseException {
        //Awful way of handling exceptions
        //The biggest problem is validating the values in the main class, and not in the reservation
        //Problem 1: exception to check in date being greater than check out
        //Problem 2: exception to check if any of the dates is in the past
        //Must use custom exceptions to treat that, will update that in the other packages (bad way and good way)

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
            Reservation r = new Reservation(number, checkin, checkout);
            System.out.println(r);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkin = LocalDate.parse(sc.nextLine(), dtf);

            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkout = LocalDate.parse(sc.nextLine(), dtf);

            LocalDate now = LocalDate.now();
            if (checkin.isBefore(now) || checkout.isBefore(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!checkout.isAfter(checkin)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                r.updateDates(checkin, checkout);
                System.out.println(r);
            }
        }


        sc.close();
        ;
    }
}
