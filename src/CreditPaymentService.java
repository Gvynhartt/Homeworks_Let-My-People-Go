public class CreditPaymentService {
    public int calculate(int S, int n, double r) {

    // S = 1000_000; // сумма кредита, руб.
    // int P = 87_911; // сумма ежемесячного платежа, руб.
    // n = 12; // срок кредита, мес.
    // r = 9.99; // процентная ставка по кредиту (в процентах)
    double rd = (r / 1200); // кредитная ставка, пересчитанная для форнмулы
    int toPayPerMonth = (int)(S * (rd * (Math.pow((1 + rd), n))) / ((Math.pow((1 + rd), n)) - 1)); // ещё пара скобок -
        // и можно будет на японских форумах цеплять вместо смайла XD
    return toPayPerMonth;
    }
}
