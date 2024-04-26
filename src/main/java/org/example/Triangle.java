package org.example;

public class IsoscelesTriangle implements Form{
    private double base;
    private double height;
    public IsoscelesTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double calcularArea() {
        return (base * height) / 2;
    }
    @Override
    public double calculatePerimeter(){
        double side = Math.sqrt(base * base + height * height);
        return base + 2 * side;
    }
}
