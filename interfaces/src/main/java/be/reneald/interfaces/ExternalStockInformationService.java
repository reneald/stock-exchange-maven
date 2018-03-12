package be.reneald.interfaces;

import java.math.BigDecimal;

public class ExternalStockInformationService {
    public BigDecimal getPriceInEuroForStock(String stockId) {
        double randomPrice = Math.random() * 100;
        return new BigDecimal(randomPrice < 10 ? 10 : randomPrice);
    }
}
