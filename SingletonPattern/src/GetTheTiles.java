import java.util.LinkedList;

/**
 * Created by wenbinli on 3/18/17.
 * thread class
 */
public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID" + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerTwoTiles = newInstance.getTitles(7);
        System.out.println("Player: " + playerTwoTiles);
        System.out.println("Got Tiles");
    }
}
