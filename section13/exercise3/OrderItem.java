package section13.exercise3;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(product);
        sb.append(", Quantity: ");
        sb.append(quantity);
        sb.append(", Subtotal: $");
        sb.append(getSubTotal());
        return sb.toString();
    }
}
