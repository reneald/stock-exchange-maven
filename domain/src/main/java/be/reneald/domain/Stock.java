package be.reneald.domain;

import java.math.BigDecimal;

public class Stock {
    private String stockId;
    private String stockName;
    private StockPrice stockPrice;

    public Stock(String stockId, String stockName, StockPrice stockPrice) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public void adjustStockPrice(BigDecimal newPrice) {
        this.stockPrice.setPrice(newPrice);
    }
}
