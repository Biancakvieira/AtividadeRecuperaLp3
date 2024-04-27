package org.example;

public class Rectangle implements Form{
    private final double height;
    private final double wight;

    public Rectangle(double height, double wight) {
        this.height = height;
        this.wight = wight;
    }

    @Override
    public double calculateArea() {
        return height * wight;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + wight);
    }
}
