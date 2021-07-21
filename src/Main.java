public class Main<bonus> {
    public static void main(String[] args) {
        int account = 325;
        int refill = 999;
        int bonus = refill / 100;
        int total;


        if (refill > 1000) {
            total = account + refill + bonus;
        } else {
            total = account + refill;
            bonus = 0;
        }
        System.out.println(total);
        System.out.println(bonus);
    }
}