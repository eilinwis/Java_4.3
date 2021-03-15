public class CreditPaymentService {
    public double calculate (int duration, int amount, double interest_rate ) {
        double monthly_interest_rate = interest_rate / 100 / 12;
        double a = 1 + monthly_interest_rate;
        double b = java.lang.Math.pow(a, duration);
        double monthly_payment = amount * (monthly_interest_rate * b) / (b - 1);
        return monthly_payment;
    }
}
