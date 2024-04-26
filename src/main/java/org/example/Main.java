package org.example;

public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        geometry.addForm(new Square(5));
        geometry.addForm(new Rectangle(4, 5));
        geometry.addForm(new Triangle(5, 6));
        double combinedArea = geometry.calculateCombinedArea();
        System.out.println("Combined area: " + combinedArea);
    }
}