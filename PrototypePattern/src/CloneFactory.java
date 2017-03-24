/**
 * Created by wenbinli on 3/23/17.
 */
public class CloneFactory {
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
