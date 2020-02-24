package B3_HuongDoiTuong.ThucHanh.ClassRectangle;

public class Rectangle {
    double width, heigt;

    public Rectangle(){

    }

    public Rectangle(double width, double heigt) {
        this.width = width;
        this.heigt = heigt;
    }

    public double getArea() {
        return this.width*this.heigt;
    }

    public double getPerimeter() {
        return (this.width + this.heigt)*2;
    }

    public String display() {
        return "Rectangle { width " + this.width + ", height = " + this.heigt + "}";
    }
}


