package org.gvp.dcs.shapes;
public class Cube {
    
    private double sideLength;

    // Constructor to initialize the side length
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to get the side length
    public double getSideLength() {
        return sideLength;
    }

    // Method to calculate the volume of the cube
    public double calculatesurfaceArea() {
        return 6 * sideLength * sideLength;
    }

    // Method to calculate the volume of the cube
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    // Method to display details of the cube
    public void display() {
        System.out.println("Cube Side Length: " + getSideLength());
        System.out.println("Surface Area: " + calculatesurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}