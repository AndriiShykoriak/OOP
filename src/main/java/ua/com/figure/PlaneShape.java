package ua.com.figure;

import ua.com.basicInterfaces.AreaPerimeterMeasurable;
import ua.com.point.Vertex2D;

public abstract class PlaneShape extends Shape implements AreaPerimeterMeasurable {

    Vertex2D vertex2D;

    public PlaneShape(Vertex2D vertex2D, String name) {
        super(name);
        this.vertex2D = vertex2D;
    }

    @Override
    public String toString() {
        String out = "Shape type: " + "\"" + getName() + "\"  " + "Perimeter: " + String.format("%.1f", getPerimeter()) + "\tArea: " + String.format("%.1f", getArea());
        return out;
    }
}
