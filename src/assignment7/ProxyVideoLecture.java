package assignment7;

public class ProxyVideoLecture implements VideoLecture {
    private String lectureTitle;
    private String lectureFile;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String lectureTitle, String lectureFile) {
        this.lectureTitle = lectureTitle;
        this.lectureFile = lectureFile;
    }

    @Override
    public void getInfo() {
        System.out.println("Lecture Title: " + lectureTitle + " (This is a proxy)");
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(lectureTitle, lectureFile);
        }
        realVideoLecture.play();
    }
}