import java.util.ArrayList;

/**
 * Created by wenbinli on 2/16/17.
 * Uses the Subject interface to update all Observers
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aapPrice;
    private double googPrice;

    public StockGrabber() {
        // Creates an ArrayList to hold all observers
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        // Adds a new observer to the ArrayList
        this.observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = this.observers.indexOf(deleteObserver);
        this.observers.remove(observerIndex);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
    }

    @Override
    public void notifyObserver() {
        // Cycle through all observers and notifies them of
        // price changes
        for (Observer observer : observers) {
            observer.update(ibmPrice, aapPrice, googPrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes
    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }


    public void setAAPLPrice(double newAAPLPrice) {
        this.aapPrice = newAAPLPrice;
        notifyObserver();
    }


    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
