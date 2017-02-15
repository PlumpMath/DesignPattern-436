/**
 * Created by wenbinli on 2/15/17.
 */
public class Animal {
    private String name;
    private double weight;
    private String sound;
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight should be bigger than 0");
        }
    }
    public double getWeight() {return this.weight;}
    public void setSound(String sound) {this.sound = sound;}
    public String getSound() {return this.sound;}
}
