package ua.com.planeShapeImpl;

import lombok.Getter;
import lombok.Setter;
import ua.com.figure.PlaneShape;
import ua.com.point.Vertex2D;

import java.util.List;

@Setter
@Getter
public class Triangle extends PlaneShape{
    private double ab;
    private double bc;
    private double ca;

    public Triangle(Vertex2D a,Vertex2D b,Vertex2D c, String name) {
        super(List.of(a,b,c), name);
        this.ab = a.getDistance(b);
        this.bc = b.getDistance(c);
        this.ca = c.getDistance(a);
    }

    @Override
    public double getArea() {
        double p = 0.5 * (ab + bc + ca);
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    @Override
    public double getPerimeter() {
        double perimeter = ab + bc + ca;
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() +" (Sides: {" +
                "ab=" + ab +
                ", bc=" + bc +
                ", ca=" + ca +
                "}) " ;
    }
}
