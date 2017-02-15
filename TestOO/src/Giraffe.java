/**
 * Created by wenbinli on 2/15/17.
 */
public class Giraffe  extends Creature {

    private String name;
    private double weight;
    @Override
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
