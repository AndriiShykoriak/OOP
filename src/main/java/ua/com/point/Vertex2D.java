package ua.com.point;

public class Vertex2D {
    private double x;
    private double y;

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }

    public double getDistance(Vertex2D vertex2D) {
        return Math.sqrt(Math.pow((this.x - (vertex2D).getX()), 2)
                + Math.pow((this.y - (vertex2D).getY()), 2));
    }
}
