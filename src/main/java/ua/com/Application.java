package ua.com;

import ua.com.figure.Shape;
import ua.com.planeShapeImpl.Circle;
import ua.com.planeShapeImpl.Rectangle;
import ua.com.planeShapeImpl.Triangle;
import ua.com.point.Vertex2D;
import ua.com.point.Vertex3D;
import ua.com.spaceShapeImpl.Cuboid;
import ua.com.spaceShapeImpl.Sphere;
import ua.com.spaceShapeImpl.SquarePyramid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(Collections.singletonList((new Vertex2D(6, 6))), "Circle", 45));
        shapes.add(new Rectangle(Collections.singletonList(new Vertex2D(11, 5)), "Rectangle", 10, 12));
        shapes.add(new Triangle(new Vertex2D(16, 10), new Vertex2D(8, 7), new Vertex2D(4, 2), "Triangle"));
        shapes.add(new Cuboid(Collections.singletonList(new Vertex3D(4, 5, 6)), "Cuboid", 2, 3, 4));
        shapes.add(new Sphere(Collections.singletonList(new Vertex3D(2, 4, 6)), "Sphere", 5));
        shapes.add(new SquarePyramid(Collections.singletonList(new Vertex3D(5, 6, 7)), "SquarePyramid", 10, 15));
        shapes.forEach(shape -> System.out.println(shape.toString()));
    }
}
