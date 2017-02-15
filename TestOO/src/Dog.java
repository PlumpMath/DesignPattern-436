/**
 * Created by wenbinli on 2/15/17.
 */
public class Dog extends Animal {
    public void digHole() {
        System.out.println("Dug a hole");
    }
    public Dog() {
        super();
        setSound("Bark");
    }
    public void changeVar(int ranNum) {
        ranNum = 12;
        System.out.println("ranNum in function is " + ranNum);
    }

    private void bePrivate() {
        System.out.println("In a private method");
    }
    public void accessPrivate() {
        bePrivate();
    }
}
