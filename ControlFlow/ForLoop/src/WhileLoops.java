public class WhileLoops extends Main {
    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println("the count is " + count);
            count++;
        }

        // do while
        System.out.println("----------");
        count = 2;
        do {
            System.out.println("the count is " + count);
            count++;
        } while (count < 6);

        // challenge
        System.out.println("Starting challenge");
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number ++;
            if(!isEvenNumber(number)) {
                continue; // will go back to top of the loop
            }

            System.out.println("Even number " + number);
        }


    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
