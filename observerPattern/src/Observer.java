/**
 * Created by wenbinli on 2/16/17.
 * The Observers update method is called when the Subject changes
 */
public interface Observer {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
