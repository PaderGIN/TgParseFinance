package ru.glebpad.tgparsefinance.services;

import ru.glebpad.tgparsefinance.models.Stock;
import ru.tinkoff.invest.openapi.OpenApi;

public class TinkoffStockService implements StockService {

    private final OpenApi openApi;

    @Override
    public Stock getStockByTicker(String ticker) {
        return null;
    }
}
