public class Main {
    public static void main(String[] args) {
//        System.out.println("testing something: " + calculateInterest(1000.0, 2.0));


        for(int i=0; i<5; i++) {
            System.out.println("On loop " + i);
        }

        // exercise 1
        System.out.println("Exercise 1 Log:");

        for(int i = 2; i<=8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        // exercise 2
        System.out.println("Exercise 2 Log:");

        for(int i = 8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        // exercise 3
        System.out.println("Exercise 3 Log:");

        int countPrime = 0;
        for(int i = 13; i <= 100 && countPrime < 3; i++) {
            if (isPrime(i)) {
                countPrime++;
                System.out.println(i + " is prime");
            };
        }
    }


    // check if num is prime
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i ==0) {
                return false;
            }
        }

        return true;
    }
    
    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
