package section14inheritance.exercise4;

public class NaturalPerson extends Person{
    private Double healthExpenditures;

    public NaturalPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double taxes() {
        Double tax = 0.0;
        if(super.getAnnualIncome() < 20000.00){
            if(healthExpenditures > 0){
                return ( super.getAnnualIncome() * 0.15 ) - ( healthExpenditures * 0.5 );
            }else{
                return super.getAnnualIncome() * 0.15;
            }
        }else{
            if(healthExpenditures > 0){
                return ( super.getAnnualIncome() * 0.25 ) - ( healthExpenditures * 0.5 );
            }else{
                return super.getAnnualIncome() * 0.25;
            }
        }

    }
}
