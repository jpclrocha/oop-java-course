package section14inheritance.exercise4;

public class LegalPerson extends Person{
    private Integer employeesNumber;

    public LegalPerson(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double taxes() {
        Double tax = 0.0;
        if(employeesNumber <= 10){
            return super.getAnnualIncome() * 0.16;
        }else{
            return super.getAnnualIncome() * 0.14;
        }

    }
}
