/**
 * Created by wenbinli on 2/15/17.
 */
public class AnimalPlay{

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        System.out.println("Dog: " + sparky.tryToFlyHigh());
        System.out.println("Bird: " + tweety.tryToFlyHigh());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

        tweety.setFlyingAbilityForInstance(new CantFly());
        System.out.println("Bird: " + tweety.tryToFlyHigh());
    }

}
