/**
 * Created by wenbinli on 4/4/17.
 * invoker class
 */
public class DeviceButton {
    Command theCommand;

    public DeviceButton(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }
}
