package org.example;

public class Rectangle implements Form{
    private final double lenght;
    private final double wight;

    public Rectangle(double lenght, double wight) {
        this.lenght = lenght;
        this.wight = wight;
    }

    @Override
    public double calculateArea() {
        return lenght * wight;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (lenght + wight);
    }
}
