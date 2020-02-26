package B4_KeThua.ThucHanh.ClassShape;

public class Square extends Rectangle {

    public Square() {
        this(1.0);
    }

    public Square ( double side ) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public double getArea() {
        return Math.pow(this.getSide(),2);
    }
    @Override
    public String toString() {
        return "A square with side = " + this.getSide() + ", which is subclass of " + super.toString();
    }
}
