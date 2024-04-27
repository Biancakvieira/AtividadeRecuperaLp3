package org.example;

public class Triangle implements Form{
    private final double base;
    private final double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
    @Override
    public double calculatePerimeter(){
        return base * 3 ;
    }
}
