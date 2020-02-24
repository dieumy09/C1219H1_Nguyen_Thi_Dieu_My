package B3_HuongDoiTuong.BaiTap.ClassQuadraticEquation;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {

    }

    public QuadraticEquation( double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(double a) {
        return a;
    }

    public double getB(double b) {
        return b;
    }

    public double getC(double c) {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b,2) - 4*a*c;
    }

    public double getRoot1() {
        if ( this.getDiscriminant() >= 0) {
            return (-b + Math.pow(this.getDiscriminant(),0.5))/(2*a);
        } else {
            return 0;
        }

    }

    public double getRoot2() {
        if ( this.getDiscriminant() >= 0) {
            return (-b - Math.pow(this.getDiscriminant(),0.5))/(2*a);
        } else {
            return 0;
        }
    }

    public String display() {
        return "Quadratic Equation: " + this.a + " x^2 + " +this.b+ " x + " + this.c ;
    }
}
