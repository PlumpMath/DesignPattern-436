/**
 * Created by wenbinli on 3/4/17.
 */
public class UFOEnemyShipFactory implements EnemyShipFactory {
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}
