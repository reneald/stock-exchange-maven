package be.reneald.service;

import be.reneald.domain.Stock;
import be.reneald.domain.StockRepository;
import be.reneald.interfaces.ExternalStockInformationService;

public class StockService {
    public static Stock getStock(String stockId) {
        Stock stock;
        try {
            stock = StockRepository.getStockInformation(stockId);
        } catch (Exception ex) {
            //TODO implement catch block
        }
        //TODO implement conversion EUR to other currencies
        stock.adjustStockPrice(ExternalStockInformationService.getPriceInEuroForStock(stock.getStockName()));
        return stock;
    }
}
