package ua.com.planeShapeImpl;

import lombok.Getter;
import lombok.Setter;
import ua.com.figure.PlaneShape;
import ua.com.point.Vertex2D;

@Setter
@Getter
public class Rectangle extends PlaneShape {
    private Vertex2D vertex2D;
    private double width;
    private double height;

    public Rectangle(Vertex2D vertex2D, String name,double width, double height) {
        super(vertex2D, name);
        this.vertex2D = vertex2D;
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
        return  "Coordinates= " +vertex2D +
                ", weight=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
