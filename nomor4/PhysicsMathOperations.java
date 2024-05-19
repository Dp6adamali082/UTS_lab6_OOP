public class PhysicsMathOperations {

// Constructor
public PhysicsMathOperations() {
    System.out.println("Physics and Math Operations Initialized.");
}

// Overloaded method to calculate area of a circle
public double calculate(double radius) {
    return Math.PI * radius * radius;
}

// Overloaded method to calculate volume of a sphere
public double calculate(double radius, boolean isSphere) {
    if (isSphere) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    } else {
        throw new IllegalArgumentException("Invalid argument for sphere calculation.");
    }
}

// Overloaded method to calculate force using Newton's Second Law
public double calculate(double mass, double acceleration) {
    return mass * acceleration;
}

// Overloaded method to calculate kinetic energy
public double calculate(double mass, double velocity, boolean isKineticEnergy) {
    if (isKineticEnergy) {
        return 0.5 * mass * velocity * velocity;
    } else {
        throw new IllegalArgumentException("Invalid argument for kinetic energy calculation.");
    }
}

// Main method to test the calculations
public static void main(String[] args) {
    PhysicsMathOperations operations = new PhysicsMathOperations();

    // Calculating area of a circle
    double radius = 5.0;
    double areaOfCircle = operations.calculate(radius);
    System.out.println("Area of Circle with radius " + radius + " is: " + areaOfCircle);

    // Calculating volume of a sphere
    double volumeOfSphere = operations.calculate(radius, true);
    System.out.println("Volume of Sphere with radius " + radius + " is: " + volumeOfSphere);

    // Calculating force using Newton's Second Law
    double mass = 10.0;
    double acceleration = 9.8;
    double force = operations.calculate(mass, acceleration);
    System.out.println("Force with mass " + mass + " and acceleration " + acceleration + " is: " + force);

    // Calculating kinetic energy
    double velocity = 15.0;
    double kineticEnergy = operations.calculate(mass, velocity, true);
    System.out.println("Kinetic Energy with mass " + mass + " and velocity " + velocity + " is: " + kineticEnergy);
}
}