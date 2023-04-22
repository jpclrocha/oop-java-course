package section14inheritance.exercise2;

public class ImportedProduct extends  Product{
    private Double customsFee;
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.priceTag());
        sb.append(" (Customs Fee: $ ");
        sb.append(customsFee);
        sb.append(")");
        return sb.toString();
    }
}
