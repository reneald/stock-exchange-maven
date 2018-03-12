package be.reneald.domain;

public enum StockCurrency {
    EUR ("Euro", "\u20AC"),
    USD ("Dollar", "\u0024"),
    GBP ("Pound", "\u00A3");

    private String currencyLabel;
    private String currencySymbol;

    StockCurrency(String currencyLabel, String currencySymbol) {
        this.currencyLabel = currencyLabel;
        this.currencySymbol = currencySymbol;
    }
}
