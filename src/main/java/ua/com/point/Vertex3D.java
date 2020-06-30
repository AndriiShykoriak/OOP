package ua.com.point;

import lombok.ToString;


public class Vertex3D extends Vertex2D{
    private double z;
    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", z=" + z;
    }
}
