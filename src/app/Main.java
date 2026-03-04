package app;

import model.Car;
import model.Driver;
import model.parts.Engine;
import model.parts.Wheel;
import exceptions.InvalidCarDataException;
import exceptions.InvalidPartException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== Car Builder Program ===");

            System.out.print("Enter driver name: ");
            String name = scanner.nextLine();

            System.out.print("Enter driver age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Driver driver = new Driver(name, age);

            System.out.print("Enter engine horsepower: ");
            int horsepower = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter engine type: ");
            String type = scanner.nextLine();

            Engine engine = new Engine(horsepower, type);

            Wheel[] wheels = new Wheel[4];

            for (int i = 0; i < 4; i++) {
                System.out.println("Enter information for wheel " + (i + 1));

                System.out.print("Wheel size: ");
                double size = scanner.nextDouble();

                System.out.print("Wheel pressure: ");
                double pressure = scanner.nextDouble();

                wheels[i] = new Wheel(size, pressure);
            }

            Car car = new Car(engine, wheels, driver);

            System.out.println("\nCar created successfully!");
            System.out.println(car);

        } catch (InvalidPartException e) {
            System.out.println("Invalid part data: " + e.getMessage());
        } catch (InvalidCarDataException e) {
            System.out.println("Invalid car data: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        scanner.close();
    }
}
