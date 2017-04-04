import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenbinli on 4/4/17.
 * PlayWithRemote
 */
public class PlayWithRemote {
    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        // -- turn off

        TurnTVOff offCommand = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();

        // -- volume up

        TurnTVUp volumeUpCommand = new TurnTVUp(newDevice);

        onPressed = new DeviceButton(volumeUpCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();

        // ------
        Television theTV = new Television();

        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnAllOff turnOffDevices = new TurnAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

    }
}
