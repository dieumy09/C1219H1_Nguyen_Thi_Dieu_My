package B1_NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class IntersetRate {
    public static void main(String[] args) {
        double money;
        int month;
        double intersetRate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interset rate in percentage: ");
        intersetRate = scanner.nextDouble();
        double totalInterset ;
        totalInterset = money * (intersetRate / 100 / 12) * month;
        System.out.println("Total of interset: "+ totalInterset);
    }
}