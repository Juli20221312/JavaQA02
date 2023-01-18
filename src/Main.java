public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int refill = 1001;

        int bonus;
        if (refill > 1000) {
            bonus = refill / amount;
        } else {
            bonus = 0;
        }
        int result = amount + refill + bonus;


        System.out.println("Итоговый счет:" + result);
        System.out.println("Бонус:" + bonus);
    }
}