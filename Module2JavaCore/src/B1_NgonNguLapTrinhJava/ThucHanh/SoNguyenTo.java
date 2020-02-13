package B1_NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        if ( number <= 1) {
            System.out.println(number + "Khong phai la so nguyen to.");
        } else {
            int i=2;
            boolean check = true;
            while ( i <= Math.sqrt(number)) {
                if ( (number % i) == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if ( check ) {
                System.out.println(number + " la so nguyen to.");
            } else {
                System.out.println(number + " khong phai la so nguyen to.");
            }
        }
    }
}
