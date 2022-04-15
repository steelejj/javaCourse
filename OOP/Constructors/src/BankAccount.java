public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() { // can be used to defaul
        this(0000, 0, "defualt", "default", 0000000000);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int newFunds) {
        this.balance += newFunds;
    }

    public void withdrawFunds(int withdrawalAmount) {
        if (withdrawalAmount > this.balance) {
            System.out.println("Insufficient funds");
        } else if (withdrawalAmount < 0) {
            System.out.println("Invalid withdrawal request");
        } else {
            this.balance -= withdrawalAmount;
        }
    }
}
