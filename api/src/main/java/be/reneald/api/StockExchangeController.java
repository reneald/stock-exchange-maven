package be.reneald.api;

import be.reneald.domain.Stock;
import be.reneald.api.StockDto;
import be.reneald.service.StockService;

public class StockExchangeController {
    private StockService stockService;

    public StockExchangeController(StockService stockService) {
        this.stockService = stockService;
    }

    StockDto getStock(String stockId) {
        return new StockDto(stockService.getStock(stockId).getStockId(), stockService.getStock(stockId).getStockName(), stockService.getStock(stockId).getStockPrice());
    }
}
