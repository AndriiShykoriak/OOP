package ua.com.figure;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public  abstract class Shape<T> {
    private List<T> vertex;
    private String name;

    public Shape(List<T> vertex, String name) {
        this.vertex = vertex;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "vertex=" + vertex +
                '}';
    }
}
