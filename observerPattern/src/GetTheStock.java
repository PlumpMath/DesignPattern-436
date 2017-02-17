import java.text.DecimalFormat;

/**
 * Created by wenbinli on 2/16/17.
 */
public class GetTheStock implements Runnable{
    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;
    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        stock = newStock;
        price = newPrice;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try{
                // Sleep for 2 seconds
                Thread.sleep(2000);
                // Use Thread.sleep(startTime * 1000); to
                // make sleep time variable

            }
            catch (InterruptedException e){}
            // Generates a random number between -.03 and .03
            double randNum = (Math.random() * (0.06)) - 0.03;
            DecimalFormat df = new DecimalFormat("#.##");
            // Change the price and then convert it back into a double
            price = Double.valueOf(df.format((price + randNum)));
            if (stock == "IBM") ((StockGrabber)stockGrabber).setIBMPrice(price);
            if (stock == "AAPL") ((StockGrabber)stockGrabber).setAAPLPrice(price);
            if (stock == "GOOG") ((StockGrabber)stockGrabber).setGOOGPrice(price);
            System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println();
        }
    }
}
