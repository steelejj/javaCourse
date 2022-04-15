public class Main {
    public static void main(String[] args) {
        Challenger challenger = new Challenger("hemi", "hellcat");
        System.out.println(challenger.getName());
        System.out.println(challenger.getSpeed());
        challenger.increaseSpeed(90);
        System.out.println(challenger.getSpeed());

    }

}
