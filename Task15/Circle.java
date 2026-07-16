public class Circle extends AbstractShape {
    double radius;

    public Circle (String color, double radius){
        super(color, radius, radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return  Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (Math.PI * radius);
    }
}
