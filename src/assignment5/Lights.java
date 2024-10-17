package assignment5;

public class Lights {
    public void turnOn() {
        System.out.println("Lights are ON");
    }

    public void turnOff() {
        System.out.println("Lights are OFF");
    }

    public void dim(int level) {
        System.out.println("Lights are dimmed to " + level + "%");
    }
}