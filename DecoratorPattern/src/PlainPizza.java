/**
 * Created by wenbinli on 4/3/17.
 * implements interface of Pizza
 */
public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
