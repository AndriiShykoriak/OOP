package ua.com.spaceShapeImpl;

import ua.com.figure.SpaceShape;
import ua.com.point.Vertex3D;

public class SquarePyramid extends SpaceShape {
    private Vertex3D vertex3D;
    private double width;
    private double height;

    public SquarePyramid(Vertex3D vertex3D, String name, double width, double height) {
        super(vertex3D, name);
        this.vertex3D = vertex3D;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double baseDiagonal = Math.sqrt(2) * width;
        double edge = Math.sqrt((Math.pow(baseDiagonal / 2, 2) + Math.pow(height, 2)));
        return Math.pow(width, 2) + (2 * width * (Math.sqrt(Math.pow(edge, 2) - (Math.pow(width, 2) / 4))));
    }

    @Override
    public double getVolume() {
        return ((double) 1 / 3) * height * Math.pow(width, 2);
    }

    @Override
    public String toString() {
        return "Coordinates= " + vertex3D +
                ", width=" + width +
                ", height=" + height
                + super.toString();
    }
}
