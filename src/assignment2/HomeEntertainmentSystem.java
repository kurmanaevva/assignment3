package assignment2;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.togglePower();
        basicRemote.setChannel(5);
        basicRemote.volumeUp();
        basicRemote.togglePower();

        Device dvd = new DVDDevice();
        RemoteControl advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.togglePower();

        Device soundSystem = new SoundSystemDevice();
        AdvancedRemote soundSystemRemote = new AdvancedRemote(soundSystem);
        soundSystemRemote.togglePower();
        soundSystemRemote.mute();
        soundSystemRemote.setFavoriteChannel(101);
        soundSystemRemote.togglePower();
    }
}