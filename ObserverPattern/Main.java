package ObserverPattern;

public class Main {
  public static void main(String[] args) {
    var stock1 = new Stock("symbol1", 100);
    var stock2 = new Stock("symbol1", 200);
    var stock3 = new Stock("symbol1", 300);

    var statusBar = new StatusBar();
    var stockListView = new StockListView();

    statusBar.addStock(stock1);
    statusBar.addStock(stock2);
    statusBar.addStock(stock3);

    stockListView.addStock(stock1);
    stockListView.addStock(stock2);
    stockListView.addStock(stock3);

    stock2.setPrice(243);
    stock1.setPrice(500);
    stock3.setPrice(89);
  }
}