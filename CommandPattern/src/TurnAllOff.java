import java.util.List;

/**
 * Created by wenbinli on 4/4/17.
 * implements Command
 */
public class TurnAllOff implements Command {

    List<ElectronicDevice> theDvices;

    public TurnAllOff(List<ElectronicDevice> newDevices) {
        theDvices = newDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : theDvices) {
            device.off();
        }
    }
}
