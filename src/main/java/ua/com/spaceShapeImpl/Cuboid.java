package ua.com.spaceShapeImpl;

import ua.com.figure.SpaceShape;
import ua.com.point.Vertex3D;

import java.util.List;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(List<Vertex3D> vertex3DList, String name, double width, double height, double depth) {
        super(vertex3DList, name);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * ((width * height) + (height * depth) + (depth * width));
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                "} " ;
    }
}
