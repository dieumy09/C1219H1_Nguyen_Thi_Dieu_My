package B1_NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap he so b: ");
        b = scanner.nextInt();
        if ( a == 0 ){
            if ( b != 0 ) {
                System.out.println("Phuong trinh vo nghiem ");
            } else {
                System.out.println("Phuong trinh vo so nghiem ");
            }
        } else {
            float x = -b/a;
            System.out.println("Phuong trinh co nghiem la: " +x);
        }

    }
}
