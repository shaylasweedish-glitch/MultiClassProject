package model.parts;

import exceptions.InvalidPartException;

public class Wheel {

    private double size;
    private double pressure;

    public Wheel(double size, double pressure) {
        setSize(size);
        setPressure(pressure);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size <= 0) {
            throw new InvalidPartException("Wheel size must be greater than 0.");
        }
        this.size = size;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        if (pressure < 0) {
            throw new InvalidPartException("Wheel pressure cannot be negative.");
        }
        this.pressure = pressure;
    }

    public String toString() {
        return "Wheel size: " + size + ", pressure: " + pressure;
    }
}
