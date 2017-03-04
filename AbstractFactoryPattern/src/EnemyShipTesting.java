/**
 * Created by wenbinli on 3/4/17.
 */
public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFO = new UFOEnemyShipBuilding();
        EnemyShip theGrunt = makeUFO.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");
        EnemyShip theBoss = makeUFO.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}
