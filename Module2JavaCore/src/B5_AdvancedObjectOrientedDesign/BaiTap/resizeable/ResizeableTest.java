package B5_AdvancedObjectOrientedDesign.BaiTap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(2,4);
        Square square = new Square(5);

        System.out.println("Before resize: ");
        System.out.println("Circle: " + circle.getRadius());
        System.out.println("Rectangle: " + rectangle.getHeight() + ", " + rectangle.getWidth());
        System.out.println("Square: " + square.getEdge());


        circle.resize(0.03);
        rectangle.resize(0.1);
        square.resize(0.05);

        System.out.println("After resize: ");
        System.out.println("Circle: " + circle.getRadius());
        System.out.println("Rectangle: " + rectangle.getHeight() + ", " + rectangle.getWidth());
        System.out.println("Square: " + square.getEdge());



    }
}
