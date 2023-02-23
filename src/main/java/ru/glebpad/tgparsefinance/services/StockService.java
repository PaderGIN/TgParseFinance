package ru.glebpad.tgparsefinance.services;

import ru.glebpad.tgparsefinance.models.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
}
