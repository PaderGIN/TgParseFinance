package ru.glebpad.tgparsefinance.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.glebpad.tgparsefinance.models.Stock;
import ru.glebpad.tgparsefinance.services.StockService;

@RestController
public class StockController {

    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(String ticker) {
        stockService.getStockByTicket(ticker);
    }
}
