package be.reneald.api;

import be.reneald.domain.Stock;
import be.reneald.api.StockDto;
import be.reneald.service.StockService;

public class StockExchangeController {
    StockDto getStock(String stockId) {
        return new StockDto(StockService.getStock(stockId).getStockId(), StockService.getStock(stockId).getStockName(), StockService.getStock(stockId).getStockPrice());
    }
}
