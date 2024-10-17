package assignment2;
public class SoundSystemDevice implements Device {
    private boolean power;
    private int volume;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("Sound System is now ON.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("Sound System is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound Systems don't support channels.");
    }

    @Override
    public void setVolume(int volume) {
        if (power) {
            this.volume = volume;
            System.out.println("Sound System volume set to " + volume);
        } else {
            System.out.println("Sound System is OFF. Turn it on first.");
        }
    }

    @Override
    public boolean isPoweredOn() {
        return power;
    }
}