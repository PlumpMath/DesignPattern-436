/**
 * Created by wenbinli on 4/4/17.
 * implements Command
 */
public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }
}
