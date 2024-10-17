package assignment7;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse("Design Patterns in Java");

        course.addLecture(new ProxyVideoLecture("Introduction to Design Patterns", "intro.mp4"));
        course.addLecture(new ProxyVideoLecture("Proxy Pattern", "proxy.mp4"));
        course.addLecture(new ProxyVideoLecture("Factory Pattern", "factory.mp4"));

        course.showLectureInfo();

        System.out.println("\nStudent selects the second lecture to play...");
        course.playLecture(1);
    }
}