package ua.com.point;

public class Vertex3D extends Vertex2D {
    private double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double getDistance(Vertex2D vertex2D) {
        return super.getDistance(vertex2D) +
                Math.pow((this.z - getZ()), 2);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", z=" + z;
    }
}
