public class Main {
    public static void main(String[] args) {
        int счёт = 100;
        int сумма_пополнения = 1100;
        int bonus = сумма_пополнения / 100;
        if (сумма_пополнения < 100)
        {bonus = 0;}

        int итоговая_сумма = bonus + сумма_пополнения + счёт;
        System.out.println("Ваш счёт: " + счёт);
        System.out.println("Вы внесли: " + сумма_пополнения);
        System.out.println("Ваши бонусы: "+ bonus);
        System.out.println("Итого вас счёт: "+ итоговая_сумма);

    }
}
