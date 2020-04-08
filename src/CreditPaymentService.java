public class CreditPaymentService {
    public double calculate(int amount, int creditTerm, double interestRate) {
        double rate = interestRate / 12 / 100;
        double index = 1 + rate;
        double factor = rate * Math.pow(index, creditTerm) / (Math.pow(index, creditTerm) - 1);
        double payment = factor * amount;
        return payment;
    }
}
