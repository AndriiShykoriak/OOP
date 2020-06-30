package ua.com.spaceShapeImpl;

import ua.com.figure.SpaceShape;
import ua.com.point.Vertex3D;

public class Sphere extends SpaceShape{
    private Vertex3D vertex3D;
    private double radius;
    public Sphere(Vertex3D vertex3D, String name,double radius) {
        super(vertex3D, name);
        this.vertex3D = vertex3D;
        this.radius=radius;
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
        return "Coordinates= " + vertex3D +
                ", radius=" + radius
                + super.toString();
    }
}
