package ua.com.spaceShapeImpl;

import ua.com.figure.SpaceShape;
import ua.com.point.Vertex3D;

import java.util.List;

public class Sphere extends SpaceShape{
    private double radius;

    public Sphere(List<Vertex3D> vertex3DList, String name, double radius) {
        super(vertex3DList, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "radius=" + radius +
                "} " ;
    }
}
