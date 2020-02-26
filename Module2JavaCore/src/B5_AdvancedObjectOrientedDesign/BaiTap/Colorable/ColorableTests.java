package B5_AdvancedObjectOrientedDesign.BaiTap.Colorable;

import B4_KeThua.ThucHanh.ClassShape.Circle;
import B4_KeThua.ThucHanh.ClassShape.Rectangle;
import B4_KeThua.ThucHanh.ClassShape.Shape;


public class ColorableTests {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new SquareColor(4);

        System.out.println("Area:");
        for (int i = 0; i < 3; i++) {
            System.out.println(shapes[i].getArea() + "\n");
        }

        System.out.println("Implement how to color:");
        SquareColor color = (SquareColor)shapes[2];
        color.howToColor();

    }
}
