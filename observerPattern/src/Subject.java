/**
 * Created by wenbinli on 2/16/17.
 * This interface hand adding, deleting, and updating
 * all the observers
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}

