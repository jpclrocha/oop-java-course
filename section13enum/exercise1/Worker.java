package section13enum.exercise1;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double base_salary;
    private Department department;
    private ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double base_salary, Department department) {
        this.name = name;
        this.level = level;
        this.base_salary = base_salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(Double base_salary) {
        this.base_salary = base_salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public double income(int year, int month){
        double inc = base_salary;
        for(HourContract c : contracts){
            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();
            if(c_year == year && c_month == month){
                inc += c.totalValue();
            }
        }
        return inc;
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\n" + department.toString();
    }
}
