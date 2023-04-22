package section14inheritance.exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufactureDate;
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName());
        sb.append(" (used) $ ");
        sb.append(super.getPrice());
        sb.append(" (Manufacture date: ");
        sb.append(dtf.format(manufactureDate));
        sb.append(")");
        return sb.toString();
    }
}
