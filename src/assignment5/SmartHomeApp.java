package assignment5;

public class SmartHomeApp {
    public static void main(String[] args) {
        // Create instances of each device
        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        // Create the SmartHomeFacade with all the devices
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(lights, thermostat, securitySystem, entertainmentSystem);

        // Simulate using the facade
        smartHomeFacade.arriveHome();
        smartHomeFacade.movieMode();
        smartHomeFacade.nightMode();
        smartHomeFacade.leaveHome();
    }
}