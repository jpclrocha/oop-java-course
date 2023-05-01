package section18interfaces.exercise1.notUsingInterface.model.services;

import section18interfaces.exercise1.notUsingInterface.model.entities.CarRental;
import section18interfaces.exercise1.notUsingInterface.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;
    private BrazilTaxService brazilTaxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.brazilTaxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24.0) * pricePerDay;
        }

        double tax = brazilTaxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
}
