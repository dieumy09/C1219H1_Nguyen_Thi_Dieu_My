package B2_MangVaPhuongThucTrongJava.BaiTap.GTNN;

import java.util.Scanner;

public class GTNN {
    public static void main(String[] args) {
        System.out.println("Nhap vao chieu dai cua mang:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int []arr = new int[size];

        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < size; i++) {
            System.out.print("a[" +i+"] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Phan tu nho nhat cua mang la:");
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
