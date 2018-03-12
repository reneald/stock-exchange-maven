package be.reneald.service;

import be.reneald.domain.Stock;
import be.reneald.domain.StockRepository;

public class StockService {
    public Stock getStock(String stockId) {
        try {
            StockRepository.getStockInformation(stockId);
        } catch (Exception ex) {

        }

    }
}
