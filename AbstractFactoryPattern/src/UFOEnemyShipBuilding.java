/**
 * Created by wenbinli on 3/4/17.
 */
public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;
        if (typeOfShip.equals("UFO")) {
            EnemyShipFactory shipFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        } else if (typeOfShip.equals("UFO BOSS")) {
            EnemyShipFactory shipFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipFactory);
            theEnemyShip.setName("UFO Boss Ship");
        }
        return theEnemyShip;
    }
}
