import org.example.Geometry;
import org.example.Square;
import org.example.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryTest {
    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea(), 0.01);
    }

    @Test
    public void testSquarePerimeter() {
        Square square = new Square(5);
        assertEquals(20, square.calculatePerimeter(), 0.01);
    }

    /*Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.calculateArea(), 0.01);
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18, rectangle.calculateArea(), 0.01);
    }*/

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(5, 6);
        assertEquals(15, triangle.calculateArea(), 0.01);
    }

    @Test
    public void testTrianglePerimeter() {
        Triangle triangle = new Triangle(5, 6);
        assertEquals(15.00, triangle.calculatePerimeter(), 0.01);
    }

    @Test
    public void testCombinedArea() {
        Geometry geometry = new Geometry();
        geometry.addForm(new Square(5));
        /*geometry.addForm(new Rectangle(4, 5));*/
        geometry.addForm(new Triangle(5, 6));
        assertEquals(40, geometry.calculateCombinedArea(), 0.01);
    }
}
