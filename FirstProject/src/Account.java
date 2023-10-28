public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        this("123",1000, "Default name", "Default email", "Default Phone" );
        System.out.println("Empty constructor");
    }
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Constructors with parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100, customerName, customerEmail, customerPhone);
        System.out.println("Constructor with 3 parameters");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }
//    public Account(){
//
//    }

    public void depositFunds(double depositAmt){
        balance += depositAmt;
        System.out.println("Deposit of $" + depositAmt + " made." +
                "Current balance is $" + balance );
    }
    public void withdrawFunds(double withdrawAmt){
        if( balance - withdrawAmt < 0){
            System.out.println("Insufficient balance $" + balance);
        }
        else{
            balance -= withdrawAmt;
            System.out.println("Withdrawal of $" + withdrawAmt + " Current balance $" + balance);
        }
    }
    public String getNumber() {
        return number;
    }

//    public void setNumber(String number) {
//        this.number = number;
//    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getCustomerName() {
        return customerName;
    }

//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }

    public String getCustomerEmail() {
        return customerEmail;
    }

//    public void setCustomerEmail(String customerEmail) {
//        this.customerEmail = customerEmail;
//    }

    public String getCustomerPhone() {
        return customerPhone;
    }

//    public void setCustomerPhone(String customerPhone) {
//        this.customerPhone = customerPhone;
//    }

}
