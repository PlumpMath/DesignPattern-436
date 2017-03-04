/**
 * Created by wenbinli on 3/4/17.
 */
public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
