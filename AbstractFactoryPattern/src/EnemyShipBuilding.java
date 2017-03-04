/**
 * Created by wenbinli on 3/4/17.
 */
public abstract class EnemyShipBuilding {
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);
    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();
        return theEnemyShip;
    }
}
