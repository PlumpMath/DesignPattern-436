/**
 * Created by wenbinli on 2/15/17.
 */
public class Bird extends Animal{

    // The constructor initializes all objects

    public Bird(){

        super();

        setSound("Tweet");

        // We set the Flys interface polymorphically
        // This sets the behavior as a flying Animal

        flyingType = new ItFlys();
        flyingInstance = new ItFlys();
    }

}
