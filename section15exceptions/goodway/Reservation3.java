package section15exceptions.goodway;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation3 {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation3(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws ReservationException {
        if (!checkout.isAfter(checkin)) {
            throw new ReservationException("Check-out date must be after check-in date!");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration() {
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws ReservationException {
        LocalDate now = LocalDate.now();
        if (checkin.isBefore(now) || checkout.isBefore(now)) {
            throw new ReservationException("Reservation dates for update must be future dates");
        }
        if (!checkout.isAfter(checkin)) {
            throw new ReservationException("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reservation: ");
        sb.append("Room ").append(roomNumber);
        sb.append(", check-in: ").append(dtf.format(checkin));
        sb.append(", check-out: ").append(dtf.format(checkout));
        sb.append(String.format(", %d nights", duration()));
        return sb.toString();
    }
}
