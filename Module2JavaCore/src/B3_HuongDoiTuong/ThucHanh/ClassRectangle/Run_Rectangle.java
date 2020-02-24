package B3_HuongDoiTuong.ThucHanh.ClassRectangle;

import java.util.Scanner;

public class Run_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter The Height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
