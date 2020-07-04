package ua.com.figure;

import ua.com.basicInterfaces.PerimeterAreaMeasurable;
import ua.com.point.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterAreaMeasurable {

    public PlaneShape(List<Vertex2D> vertex2DList, String name) {
        super(vertex2DList, name);
    }

    @Override
    public String toString() {
        return super.toString() + "Shape type: " + "\"" + getName() + "\"  " + "Perimeter: " + String.format("%.1f", getPerimeter()) + "\tArea: " + String.format("%.1f", getArea());
    }
}
