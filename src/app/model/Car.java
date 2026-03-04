package model;

import model.parts.Engine;
import model.parts.Wheel;
import exceptions.InvalidCarDataException;

public class Car {

    private Engine engine;
    private Wheel[] wheels;
    private Driver driver;

    public Car(Engine engine, Wheel[] wheels, Driver driver) throws InvalidCarDataException {
        setEngine(engine);
        setWheels(wheels);
        setDriver(driver);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) throws InvalidCarDataException {
        if (engine == null) {
            throw new InvalidCarDataException("Car must have an engine.");
        }
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) throws InvalidCarDataException {
        if (wheels == null || wheels.length == 0) {
            throw new InvalidCarDataException("Car must have wheels.");
        }
        this.wheels = wheels;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) throws InvalidCarDataException {
        if (driver == null) {
            throw new InvalidCarDataException("Car must have a driver.");
        }
        this.driver = driver;
    }

    public String toString() {
        String result = "Driver: " + driver + "\n";
        result += "Engine: " + engine + "\n";
        result += "Wheels:\n";

        for (Wheel wheel : wheels) {
            result += wheel + "\n";
        }

        return result;
    }
}
