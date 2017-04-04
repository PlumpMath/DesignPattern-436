/**
 * Created by wenbinli on 4/4/17.
 * implement EleronicDevice
 */
class Radio implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.print("Radio is ON");
    }

    @Override
    public void off() {
        System.out.print("Radio is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.print("Radio volume at" + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.print("Radio volume at" + volume);
    }
}
