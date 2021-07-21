public class Main<bonus> {
    public static void main(String[] args) {
        int account = 156;
        int refill = 1515;
        int bonus = refill/100;
        int total;


        if (refill > 1000) {
            total = account + refill + bonus;
        } else {
             total = account + refill;
        }
        System.out.println(total);
    }
}