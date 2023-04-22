package section13.exercise3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Order {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private ArrayList<OrderItem> items = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem orderItem){
        this.items.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        this.items.remove(orderItem);
    }

    public double totalPrice(){
        double totalPrice = 0;
        for (OrderItem o : items){
            totalPrice += o.getSubTotal();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ORDER SUMMARY\n");
        sb.append("Order moment: ");
        sb.append(dtf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append(client + "\n");
        sb.append("Order items\n");
        for(OrderItem ot : items){
            sb.append(ot + "\n");
        }
        sb.append("Total price: $");
        sb.append(totalPrice());
        return sb.toString();
    }
}
