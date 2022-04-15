public class Sum3And5Challenge extends Main{

    public static void main(String[] args) {
        int runningSum = 0;
        int countValidNums = 0;
        for(int i = 1; i < 1000 && countValidNums < 5; i++) {
            if (isValidNum(i)) {
                System.out.println(i);
                runningSum += i;
                countValidNums++;
            }
        }
        System.out.println("The sum is " + runningSum);
    }

    public static boolean isValidNum(int n) {
        return (n % 3 == 0) && (n % 5 == 0);
    }
}
