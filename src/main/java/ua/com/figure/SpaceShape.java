package ua.com.figure;

import ua.com.basicInterfaces.VolumeAreaMeasurable;
import ua.com.point.Vertex3D;

import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeAreaMeasurable {

    public SpaceShape(List<Vertex3D> vertex3DList, String name) {
        super(vertex3DList, name);
    }

    @Override
    public String toString() {
       return  super.toString() + " Shape type: " + "\"" + getName() + "\"  " + "Volume: " + String.format("%.1f", getVolume()) + "\tArea: " + String.format("%.1f", getArea());
    }
}
