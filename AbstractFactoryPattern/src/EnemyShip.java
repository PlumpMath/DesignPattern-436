/**
 * Created by wenbinli on 3/3/17.
 * Newly defined objects that represent weapon & engine
 * These can be changed easily by assigning new parts
 * in UFOEnemyShipFactory or UFOBossEnemyShipFactory
 */
public abstract class EnemyShip {
    private String name;
    ESEngine engine;
    ESWeapon weapon;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    abstract void makeShip();
    /**
     * toString method in engine and weapon is defined,
     * when it is printed the String defined in toString
     * goes on the screen
     * */
    public void followHeroShip() {
        System.out.println(getName() + " is following the hero at " + engine);
    }
    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen.");
    }
    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + weapon);
    }
    // if any EnemyShip object is printed to screen this shows up
    public String toString() {
        String infoOnShip = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
        return infoOnShip;
    }
}
