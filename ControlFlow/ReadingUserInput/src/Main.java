import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("and the year you were born: ");
        boolean hasNextInt = scanner.hasNextInt(); // checks that next number is an int
        if (hasNextInt) {
            int yob = scanner.nextInt();
            scanner.nextLine(); // if we enter an int we need to follow by calling nextLine() or the scanner won't intepret
            System.out.println("your name is: " + name + " and you are " + (2022 - yob) + " years old");
        } else {
            throw new RuntimeException("Invalid number entered");
        }

        scanner.close();

//        Person person = new Person(name, dob)
    }
}
//
//class Person {
//    String name;
//    String dob;
//
//
//    public void printName() {
//        System.out.println("Name: " + name);
//        System.out.println("Date of birth: " + dob);
//    }
//}