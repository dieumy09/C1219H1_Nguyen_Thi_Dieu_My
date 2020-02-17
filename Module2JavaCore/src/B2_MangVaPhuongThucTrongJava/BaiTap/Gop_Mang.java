package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class Gop_Mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr1 = new int[5];
        int [] arr2 = new int[4];

        System.out.println("Nhap phan tu mang 1:");
        for ( int i = 0 ; i < arr1.length ; i++){
            System.out.print("arr1["+i+"] = " );
            arr1[i] = input.nextInt();
        }

        System.out.println("Nhap phan tu mang 2: ");
        for ( int j = 0 ; j < arr2.length ; j++ ){
            System.out.print("arr2[" + j +"] = ");
            arr2[j] = input.nextInt();
        }

        int [] arr3 = new int[arr1.length+arr2.length];
        for ( int i = 0 ; i < arr1.length ; i++ ){
            arr3[i] = arr1[i];
        }
        for ( int i = 0 ; i < arr2.length ; i++ ){
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println("Gop hai mang:");
        for ( int i = 0 ; i < arr3.length ; i++ ){
            System.out.println("arr3["+i+"] = " + arr3[i] );
        }
    }
}
