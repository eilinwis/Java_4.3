public class Main {
    public static void main(String [] args){
        CreditPaymentService service = new CreditPaymentService();
        double OneYeatmonthly_payment = service.calculate(12,1_000_000, 9.99);
        System.out.println(OneYeatmonthly_payment);

        double TwoYearsmonthly_payment = service.calculate(24,1_000_000, 9.99);
        System.out.println(TwoYearsmonthly_payment);

        double ThreeYearsmonthly_payment = service.calculate(36,1_000_000, 9.99);
        System.out.println(ThreeYearsmonthly_payment);
    }
}
