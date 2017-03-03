/**
 * Created by wenbinli on 2/16/17.
 */
public class GrabStocks {
    public static void main(String[] args) {
        // Create the Subject object
        // It will handle updating all observers
        // as well as deleting and adding them

        StockGrabber stockGrabber = new StockGrabber();
        // Create an Observer that will be sent updates from Subject
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setAAPLPrice(197.0);
        stockGrabber.setIBMPrice(166.0);
        stockGrabber.setGOOGPrice(188.0);


        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setAAPLPrice(198.0);
        stockGrabber.setIBMPrice(136.0);
        stockGrabber.setGOOGPrice(288.0);

        // Delete one of the observers
        stockGrabber.unregister(observer1);

        stockGrabber.setAAPLPrice(198.0);
        stockGrabber.setIBMPrice(136.0);
        stockGrabber.setGOOGPrice(288.0);

        // Create 3 threads using the Runnable interface
        // GetTheStock implements Runnable, so it doesn't waste
        // its one extendable class option
        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 192.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 199.00);

        // Call for the code in run to execute
        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
