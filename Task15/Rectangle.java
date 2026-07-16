public class Rectangle extends AbstractShape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return length * width;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length * width);
    }


}
