interface Shape {
    double calculateArea();
    double calculatePerimeter();
}


public abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape (String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;


    }
}
