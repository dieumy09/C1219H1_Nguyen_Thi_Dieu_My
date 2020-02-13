package B1_NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thang can kiem tra: ");
        month = scanner.nextInt();
        while ( month > 12 || month < 1) {
            System.out.println("Nhap lai thang can kiem tra: ");
            month = scanner.nextInt();
        }
        switch (month) {
            case 2:
                System.out.println("Thang 2 co 28 hoac 29 ngay. ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay. ");
                break;
        }
    }
}
