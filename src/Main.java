public class Main {
    public static void main(String[] args) {
        CreditPaymentService totalFee = new CreditPaymentService();
        int S = 1000_000; // сумма кредита, руб.
        // int P = 46_140; // сумма ежемесячного платежа, руб., для рЕверс-инжиринга, так сказать
        int n = 36; // срок кредита, мес.
        double r = 9.99; // процентная ставка по кредиту (в процентах)
        double rd = (r / 1200); // кредитная ставка, пересчитанная для форнмулы
        int finalSum = totalFee.calculate(S, n, r);
        System.out.println("Сумма ежемесячного платежа по кредиту: " + finalSum + " рублей/бля/блёв. Таки очень много. Не ешь, подумай!");
    }
}