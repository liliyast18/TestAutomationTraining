package Block7;

public class MainShapes {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3),
                new Rectangle(5, 6),
                new Square(8)
        };
        for(Shape shape:shapes){
            System.out.printf("%s -> area = %.2f, perimeter = %.2f%n",
                    shape, shape.area(), shape.perimeter());
        }

    }
}
