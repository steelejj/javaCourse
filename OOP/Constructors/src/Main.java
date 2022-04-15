public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1111);
        bankAccount.setBalance(100);
        bankAccount.setCustomerName("James");
        bankAccount.setEmail("jsteele@om1.com");
        bankAccount.setPhoneNumber(1234567899);

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());

        bankAccount.depositFunds(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(-8);
        bankAccount.withdrawFunds(900);
        bankAccount.withdrawFunds(150);

        System.out.println(bankAccount.getBalance());

        // use the constructor
        System.out.println("\n**************************\n");

        BankAccount jamesAccount = new BankAccount(1111, 100, "james", "email", 1234567899);
        System.out.println(jamesAccount.getCustomerName());

        BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getCustomerName());
    }
}
