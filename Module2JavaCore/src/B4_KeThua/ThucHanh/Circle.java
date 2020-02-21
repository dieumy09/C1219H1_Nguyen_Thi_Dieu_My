package B4_KeThua.ThucHanh;

public class Circle extends Shape {
    private double radius = 1.0;

    public  Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}
