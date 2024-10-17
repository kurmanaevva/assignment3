package assignment2;
public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    public void pressPowerButton() {
        System.out.println("Basic remote power button pressed.");
        togglePower();
    }
}