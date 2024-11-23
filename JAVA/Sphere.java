package org.gvp.dcs.shapes;
public class Sphere {

    private double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the surface area of the sphere
    public double calculatesurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Method to calculate the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    // Method to display details of the Sphere
    public void display() {
        System.out.println("Sphere Radius: " + getRadius());
        System.out.println("surface Area: " + calculatesurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}