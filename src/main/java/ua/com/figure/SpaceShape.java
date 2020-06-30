package ua.com.figure;

import ua.com.basicInterfaces.VolumeAreaMeasurable;
import ua.com.point.Vertex3D;

public abstract class SpaceShape extends Shape implements VolumeAreaMeasurable {
    Vertex3D vertex3D;

    public SpaceShape(Vertex3D vertex3D, String name) {
        super(name);
        this.vertex3D = vertex3D;
    }

    @Override
    public String toString() {
        String out = " Shape type: " + "\"" + getName() + "\"  " + "Volume: " + String.format("%.1f", getVolume()) + "\tArea: " + String.format("%.1f", getArea());
        return out;
    }
}
