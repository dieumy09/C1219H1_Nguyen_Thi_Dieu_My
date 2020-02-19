package B3_HuongDoiTuong.BaiTap;

import java.util.Scanner;

public class SolveTheQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = input.nextDouble();
        System.out.print("Enter b:");
        double b = input.nextDouble();
        System.out.print("Enter c:");
        double c = input.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a,b,c);


        System.out.println(quadratic.display());

        if ( quadratic.getDiscriminant() > 0 ) {
            System.out.println(" The equation has two roots: " + quadratic.getRoot1() + " and " + quadratic.getRoot2());
        } else if ( quadratic.getDiscriminant() == 0 ) {
            System.out.println("The equation has one roots: " + quadratic.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }

    }
}
