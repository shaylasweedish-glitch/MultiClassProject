package model;

import exceptions.InvalidPartException;

public class Driver {

    private String name;
    private int age;

    public Driver(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPartException("Driver name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16) {
            throw new InvalidPartException("Driver must be at least 16.");
        }
        this.age = age;
    }

    public String toString() {
        return name + " (Age " + age + ")";
    }
}
