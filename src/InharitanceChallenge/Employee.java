package InharitanceChallenge;

public class Employee extends Worker{

    private long employedID;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employedID, String hireDate) {
        super(name, birthDate, endDate);
        this.employedID = employedID;
        this.hireDate = hireDate;
    }
}
