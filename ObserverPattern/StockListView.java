package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Interfaces.IObserver;

public class StockListView implements IObserver {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update() {
        for (var stock : stocks) {
            var price = stock.getPrice();
            System.out.println("current value of StockListView is updated to: " + price);
        }
    }
}
