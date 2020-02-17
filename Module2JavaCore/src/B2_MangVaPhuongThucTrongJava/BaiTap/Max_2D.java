package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class Max_2D {
    public static void main(String[] args) {
        int [][] array2D = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao phan tu cua mang");
        for ( int i = 0 ; i < 3 ; i++ ){
            for ( int j = 0 ; j < 3 ; j++ ){
                System.out.print("a["+i+"]["+j+"] = ");
                array2D[i][j] = input.nextInt();
            }
        }
        int max = array2D[0][0];
        for ( int i = 0 ; i < 3 ; i++ ){
            for ( int j = 0 ; j < 3 ; j++ ){
                if ( max < array2D[i][j]) {
                    max = array2D[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);

    }
}
