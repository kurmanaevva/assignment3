package assignment2;

public interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void setVolume(int volume);
    boolean isPoweredOn();
}