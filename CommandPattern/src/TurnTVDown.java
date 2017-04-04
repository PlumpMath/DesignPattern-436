/**
 * Created by wenbinli on 4/4/17.
 * implements Command
 */
public class TurnTVDown implements Command {

    ElectronicDevice theDevice;

    public TurnTVDown(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeDown();
    }
}
