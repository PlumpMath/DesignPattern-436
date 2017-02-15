/**
 * Created by wenbinli on 2/15/17.
 */
public interface Living {
    public void setName(String name);
    public String getName();

    public void setHeight(double height);
    public double getHeight();

    public void setWeight(double weight);
    public double getWeight();

    public void setFavFood(String newFood);
    public String getFavFood();

    public void setSpeed(double newSpeed);
    public double getSpeed();

    public void setSound(String sound);
    public String getSound();
}
