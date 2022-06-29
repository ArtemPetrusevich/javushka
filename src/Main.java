public class git Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int replenishmentAmount = 1100;
        int bonus = replenishmentAmount / 100;
        if (replenishmentAmount < 100) {
            bonus = 0;
        }

        int grandTotal = bonus + replenishmentAmount + accountBalance;
        System.out.println("Ваш счёт: " + accountBalance);
        System.out.println("Вы внесли: " + replenishmentAmount);
        System.out.println("Ваши бонусы: " + bonus);
        System.out.println("Итого вас счёт: " + grandTotal);

    }
}
