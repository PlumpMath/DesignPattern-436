/**
 * Created by wenbinli on 4/4/17.
 */
public class TurnTVOff implements Command {

    ElectronicDevice theDvice;

    public TurnTVOff(ElectronicDevice newDevice) {
        theDvice = newDevice;
    }

    @Override
    public void execute() {
        theDvice.off();
    }
}
