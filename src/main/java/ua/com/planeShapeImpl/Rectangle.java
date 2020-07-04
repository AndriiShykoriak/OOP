package ua.com.planeShapeImpl;

import lombok.Getter;
import lombok.Setter;
import ua.com.figure.PlaneShape;
import ua.com.point.Vertex2D;

import java.util.List;

@Setter
@Getter
public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(List<Vertex2D> vertex2DList, String name, double width, double height) {
        super(vertex2DList, name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "width=" + width +
                ", height=" + height +
                "} ";
    }
}
