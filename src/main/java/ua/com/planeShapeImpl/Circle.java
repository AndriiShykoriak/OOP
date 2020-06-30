package ua.com.planeShapeImpl;

import ua.com.figure.PlaneShape;
import ua.com.point.Vertex2D;


public class Circle extends PlaneShape {
    private Vertex2D vertex2D;
    private double radius;

    public Circle(Vertex2D vertex2D, String name,double radius) {
        super(vertex2D,name);
        this.vertex2D = vertex2D;
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
        return "Coordinates= " + vertex2D +
                ", radius= " + radius +
                ' ' + super.toString();
    }
}
