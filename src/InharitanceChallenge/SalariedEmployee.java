package InharitanceChallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate,
                            long employedID, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, employedID, hireDate);
        this.annualSalary = annualSalary;

    }
    public void retire(){
        this.isRetired = true;
        System.out.println("Salaried Employee is retired");
    }

    @Override
    public double collectPay() {
        return annualSalary;
    }
}
