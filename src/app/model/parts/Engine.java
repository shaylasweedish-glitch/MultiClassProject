package model.parts;

import exceptions.InvalidPartException;

public class Engine {

    private int horsepower;
    private String type;

    public Engine(int horsepower, String type) {
        setHorsepower(horsepower);
        setType(type);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower <= 0) {
            throw new InvalidPartException("Horsepower must be positive.");
        }
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new InvalidPartException("Engine type cannot be empty.");
        }
        this.type = type;
    }

    public String toString() {
        return horsepower + " HP " + type + " engine";
    }
}
