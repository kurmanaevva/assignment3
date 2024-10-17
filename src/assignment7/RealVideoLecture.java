package assignment7;

public class RealVideoLecture implements VideoLecture {
    private String lectureTitle;
    private String lectureFile;

    public RealVideoLecture(String lectureTitle, String lectureFile) {
        this.lectureTitle = lectureTitle;
        this.lectureFile = lectureFile;
        loadLecture();  // Simulate time-consuming video loading
    }

    private void loadLecture() {
        System.out.println("Loading video lecture: " + lectureFile + "...");
        // Simulate the time it takes to load the video
        try {
            Thread.sleep(2000);  // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Lecture Title: " + lectureTitle);
    }

    @Override
    public void play() {
        System.out.println("Playing video lecture: " + lectureTitle);
    }
}