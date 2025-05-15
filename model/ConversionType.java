package model;

public enum ConversionType {
    USD_TO_BRL("Dólar (USD) para Real (BRL)", "USD", "BRL"),
    BRL_TO_USD("Real (BRL) para Dólar (USD)", "BRL", "USD"),
    USD_TO_JPY("Dólar (USD) para Yenes (JPY)", "USD", "JPY"),
    JPY_TO_USD("Yenes (JPY) para Dólar (USD)", "JPY", "USD"),
    USD_TO_PHP("Dólar (USD) para Pesos Filipino (PHP)", "USD", "PHP"),
    PHP_TO_USD("Pesos Filipino (PHP) para Dólar (USD)", "PHP", "USD");

    private final String description;
    private final String fromCurrency;
    private final String toCurrency;

    ConversionType(String description, String fromCurrency, String toCurrency) {
        this.description = description;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public String getDescription() {
        return description;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public static void listOptions() {
        int i = 1;
        for (ConversionType type : values()) {
            System.out.printf("%d - %s%n", i++, type.getDescription());
        }
    }

    public static ConversionType fromOption(int option) {
        return values()[option - 1];
    }
}
