/**
 * Created by wenbinli on 3/3/17.
 */
public class UFOEnemyShip extends EnemyShip {
    // we defined the type of ship we want to create
    // by stating we want to use the factory that
    // makes enemy ships
    EnemyShipFactory shipFactory = null;

    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    // EnemyShipBuilding calls this method to build a
    // specific UFOEnemyShip
    @Override
    void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
