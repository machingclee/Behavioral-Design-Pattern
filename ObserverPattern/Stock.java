package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Interfaces.IObservable;
import ObserverPattern.Interfaces.IObserver;

public class Stock implements IObservable {
    private String symbol;
    private float price;
    private List<IObserver> observers = new ArrayList<IObserver>();

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyChanges();
    }

    @Override
    public String toString() {
        return "Stock{" + "symbol='" + symbol + '\'' + ", price=" + price + '}';
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyChanges() {
        for (var observer : observers) {
            observer.update();
        }

    }
}
