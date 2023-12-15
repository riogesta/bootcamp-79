package childs;
import parents.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle() {}

    public Circle(double radius, String color) {
        setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
