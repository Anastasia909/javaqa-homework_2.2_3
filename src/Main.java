public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int creditTerm = 12;
        double interestRate = 9.9;
        double payment = service.calculate(amount, creditTerm, interestRate);
        System.out.println(payment);
    }
}
