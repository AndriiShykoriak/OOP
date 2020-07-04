package ua.com.spaceShapeImpl;

import ua.com.figure.SpaceShape;
import ua.com.point.Vertex3D;

import java.util.List;

public class SquarePyramid extends SpaceShape {
    private double width;
    private double height;

    public SquarePyramid(List<Vertex3D> vertex3DList, String name, double width, double height) {
        super(vertex3DList, name);
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
        return super.toString()+"{" +
                "width=" + width +
                ", height=" + height +
                "} ";
    }
}
