public class VipCustomerTester extends Main {

    public static void main(String[] args) {
        VipCustomer defaultCustomer = new VipCustomer();
        printValues("default", defaultCustomer);

        VipCustomer someDefaults = new VipCustomer("james", 1000.0);
        printValues("someDefaults", someDefaults);

        VipCustomer noDefaults = new VipCustomer("james", 1000.0, "jsteele@om1.com");
        printValues("noDefaults", noDefaults);
    }

    public static void printValues(String initName, VipCustomer cust) {
        System.out.println(initName);
        System.out.println("name: " + cust.getName() + ", creditLimit: " + cust.getCreditLimit() + ", email: " + cust.getEmailAddress());
    }
}
