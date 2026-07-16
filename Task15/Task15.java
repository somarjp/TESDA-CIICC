public class Task15 {

    public static void main (String [] args) {
        Circle circle = new Circle("blue", 5);
        Rectangle rectangle = new Rectangle("red", 5 , 10);

        System.out.println("Area of a circle: " + circle.calculateArea());
        System.out.println("Perimeter of a circle: " + circle.calculatePerimeter());

        System.out.println("Area of a rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of a rectangle: " + rectangle.calculatePerimeter());
    }
}