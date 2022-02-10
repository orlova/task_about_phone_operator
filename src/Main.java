public class Main {
    public static void main(String[] args) {

        int initialBalance = 300;
        int replenishmentAmount = 1060;

        int bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = initialBalance + replenishmentAmount + bonus;

        System.out.println(" Ваш итоговый счет составляет: " + totalAmount + "; Сумма Ваших бонусов:" + bonus);

    }
}