package InharitanceChallenge;

public class Main {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("mirek","1990","2030"
                ,901104,"2000",200);

        System.out.println(salariedEmployee.collectPay());

        System.out.println(salariedEmployee.getAge());




    }
}
