import java.util.Currency;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double convert(double amount, double value) {
        return (1.0 + IOF) * amount * value;
    }
}
