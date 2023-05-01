package section17files;

public class Product {
    private String name;
    private Double unitaryPrice;
    private Integer quantity;

    public Product(String name, Double unitaryPrice, Integer quantity) {
        this.name = name;
        this.unitaryPrice = unitaryPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(Double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }

    public Double getTotalPrice() {
        return unitaryPrice * quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", unitaryPrice=").append(unitaryPrice);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
