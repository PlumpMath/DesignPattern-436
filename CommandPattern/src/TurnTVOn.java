/**
 * Created by wenbinli on 4/4/17.
 * implements Command
 */
public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDEvice) {
        theDevice = newDEvice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }
}
