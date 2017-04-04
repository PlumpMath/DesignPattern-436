/**
 * Created by wenbinli on 4/3/17.
 * run the maker process, this is a run time decorator processing
 */
public class PizzaMaker {
    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());
    }
}
