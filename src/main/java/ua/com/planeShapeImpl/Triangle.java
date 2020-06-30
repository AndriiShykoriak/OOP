package ua.com.planeShapeImpl;

import lombok.Getter;
import lombok.Setter;
import ua.com.figure.PlaneShape;
import ua.com.point.Vertex2D;

@Setter
@Getter
public class Triangle extends PlaneShape{
    private Vertex2D vertex2D;
    private Vertex2D oneSide;
    private Vertex2D secondSide;
    private Vertex2D thirdSide;


    private double ab;
    private double bc;
    private double ca;

    public Triangle(Vertex2D oneSide, Vertex2D secondSide, Vertex2D thirdSide,String name) {
        super(oneSide, name);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        ab = oneSide.getDistance(oneSide, secondSide);
        bc = secondSide.getDistance(secondSide, thirdSide);
        ca = thirdSide.getDistance(thirdSide, oneSide);
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
        return "Coordinates= oneSide= " + oneSide +
                ", secondSide= " + secondSide +
                ", thirdSide= " + thirdSide +
                ", ab=" + ab +
                ", bc=" + bc +
                ", ca=" + ca +
                "} " + super.toString();

    }
}
