package section14inheritance.exercise3;

public class Circle extends Shape{
    private Color color;
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * (radius * radius);
    }
}
