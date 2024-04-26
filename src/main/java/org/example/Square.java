package org.example;

public class Square implements Form {
    private final double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return side * side;
    }
    @Override
    public double calculatePerimeter(){
        return 4 * side;
    }

}