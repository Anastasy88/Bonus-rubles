public class Main {
    public static void main(String[] args) {

        int balance = 400; // Начальный баланс
        int addBalance = 1600; // Сумма пополнения
        int bonus = 1; // Кол-во бонусов за каждые 100 рублей
        int addBonus; // Кол-во начисленных бонусов

        if (addBalance >= 1000) {
            addBonus = addBalance / 100 * bonus;
        } else {
            addBonus = 0;
        }
        int FinalBalance = balance + addBalance + addBonus;

        System.out.println("Начислено бонусов: " + addBonus);
        System.out.println("Итоговый баланс: " + FinalBalance);

    }
}