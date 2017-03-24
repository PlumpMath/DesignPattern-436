/**
 * Created by wenbinli on 3/23/17.
 * Client make a sheep and then make a factory,
 * then this client use his factory copy the original
 * sheep deeply.
 */
public class TestCloning {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally Hashcode:" + System.identityHashCode(sally));
        System.out.println("Sally Hashcode:" + System.identityHashCode(clonedSheep));
    }
}
