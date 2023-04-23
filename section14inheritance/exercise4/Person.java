package section14inheritance.exercise4;

public abstract class Person {
    private String name;
    private Double annualIncome;

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double taxes();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(": $ ");
        sb.append(String.format("%.2f", taxes()));
        return sb.toString();
    }
}
