package ua.com.planeShapeImpl;

import ua.com.figure.PlaneShape;
import ua.com.point.Vertex2D;

import java.util.List;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(List<Vertex2D> vertex2DList, String name, double radius) {
        super(vertex2DList, name);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "radius=" + radius +
                "} ";
    }
}
