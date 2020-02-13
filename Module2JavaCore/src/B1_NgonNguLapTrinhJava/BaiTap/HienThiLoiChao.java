package B1_NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban: ");
        name = scanner.nextLine();
        System.out.println("Hello: " +name);
    }
}
