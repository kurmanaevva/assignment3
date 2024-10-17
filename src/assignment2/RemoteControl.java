package assignment2;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isPoweredOn()) {
            device.powerOff();
        } else {
            device.powerOn();
        }
    }

    public void volumeUp() {
        device.setVolume(device.isPoweredOn() ? 10 : 0); // Example for increasing volume by 10
    }

    public void volumeDown() {
        device.setVolume(device.isPoweredOn() ? 5 : 0); // Example for decreasing volume
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}