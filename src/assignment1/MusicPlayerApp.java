package assignment1;

public class MusicPlayerApp {

    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.play("mp3", "song.mp3");

        AudioAdapter audioAdapter = new AudioAdapter("wav");
        audioAdapter.play("wav", "song.wav");

        audioAdapter = new AudioAdapter("aac");
        audioAdapter.play("aac", "song.aac");
    }
}