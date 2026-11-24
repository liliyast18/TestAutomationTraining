package Block7;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    @Override
    public double area() {
        return width * height;

    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}
