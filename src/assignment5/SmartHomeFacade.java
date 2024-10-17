package assignment5;

public class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Lights lights, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        lights.turnOff();
        thermostat.turnOff();
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        lights.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        entertainmentSystem.turnOn();
    }

    public void nightMode() {
        System.out.println("Night mode...");
        lights.dim(20);
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    public void movieMode() {
        System.out.println("Movie mode...");
        lights.dim(10);
        thermostat.setTemperature(21);
        entertainmentSystem.setMovieMode();
    }
}