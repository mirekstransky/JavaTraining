package BankChallenge;

public class Bank {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void vlozeniPenez(double vklad){
        setAccountBalance(getAccountBalance() + vklad);
        System.out.println("Vklad je "+vklad+" kč.");
        System.out.println("Stav účtu je "+accountBalance + " Kč");
    }
    public void vyberPenez(double vyber) {
        if (accountBalance<vyber){
            System.out.println("Nelze vybrat, nekrytá částka");
        }else {
            setAccountBalance(getAccountBalance()-vyber);
            System.out.println("Výběr je "+vyber+" Kč.");
            System.out.println("Stav účtu je "+accountBalance + " Kč");
        }

    }
}
