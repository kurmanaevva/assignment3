package assignment2;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void pressPowerButton() {
        System.out.println("Advanced remote power button pressed.");
        togglePower();
    }

    public void mute() {
        if (device.isPoweredOn()) {
            device.setVolume(0);
            System.out.println("Device is muted.");
        } else {
            System.out.println("Cannot mute. The device is OFF.");
        }
    }

    public void setFavoriteChannel(int channel) {
        if (device.isPoweredOn()) {
            System.out.println("Setting favorite channel to " + channel);
            device.setChannel(channel);
        } else {
            System.out.println("Cannot set the channel. The device is OFF.");
        }
    }
}