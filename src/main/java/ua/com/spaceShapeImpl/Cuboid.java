package ua.com.spaceShapeImpl;

import ua.com.figure.SpaceShape;
import ua.com.point.Vertex3D;

public class Cuboid extends SpaceShape {
    private Vertex3D vertex3D;
    private double width;
    private double height;
    private double depth;
    public Cuboid(Vertex3D vertex3D,String name, double width,double height, double depth) {
        super(vertex3D, name);
        this.vertex3D=vertex3D;
        this.width=width;
        this.height=height;
        this.depth=depth;
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
        return "Coordinates= " + vertex3D +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth
                + super.toString() ;
    }
}
