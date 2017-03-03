/**
 * Created by wenbinli on 3/2/17.
 */
import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
//        EnemyShip enemy = null;
//        EnemyShip ufo = new UFOEnemyShip();
//        Scanner userInput = new Scanner(System.in);
//        String enemyOption = "";
//        System.out.println("What is type of ship? (U/R)");
//        if (userInput.hasNextLine()) {
//            enemyOption = userInput.nextLine();
//        }
//        if (enemyOption.equals("U")) {
//            enemy = new UFOEnemyShip();
//        } else if (enemyOption.equals("R")) {
//            enemy = new RocketEnemyShip();
//        }
//        doStuff(enemy);
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner input = new Scanner(System.in);
        System.out.print("The enemy type is U/R/B? ");
        if (input.hasNext()) {
            String typeOfShip = input.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        if (theEnemy != null) {
            doStuff(theEnemy);
        } else {
            System.out.println("the enemy is null, Enter U, R, B");
        }
    }
    public static void doStuff(EnemyShip enemy) {
        enemy.displayEnemyShip();
        enemy.followHeroShip();
        enemy.enemyShipShoots();
    }
}
