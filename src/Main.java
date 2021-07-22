public class Main<bonus> {
    public static void main(String[] args) {
        int account = 17;
        int refill = 1000;
        int bonus = 0;
        int total;

        if (refill > 1000) {
            bonus = refill / 100;
        }
        total = account + refill + bonus;
        System.out.println(total);
        System.out.println(bonus);
    }
}