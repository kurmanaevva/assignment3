package assignment2;

public class TVDevice implements Device {
    private boolean power;
    private int volume;
    private int channel;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("TV is now ON.");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("TV is now OFF.");
    }

    @Override
    public void setChannel(int channel) {
        if (power) {
            this.channel = channel;
            System.out.println("TV channel set to " + channel);
        } else {
            System.out.println("TV is OFF. Turn it on first.");
        }
    }

    @Override
    public void setVolume(int volume) {
        if (power) {
            this.volume = volume;
            System.out.println("TV volume set to " + volume);
        } else {
            System.out.println("TV is OFF. Turn it on first.");
        }
    }

    @Override
    public boolean isPoweredOn() {
        return power;
    }
}