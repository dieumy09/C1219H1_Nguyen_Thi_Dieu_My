package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class Hoan_Vi {
    public void SwapArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void showArray(int arr[]){
        for ( int i = 0 ; i < arr.length ; i++ ){
            System.out.print("a["+i+"] = " + arr[i] + "\t");
        }
    }

    public void hoanviMang ( int i , int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang: ");
        int size = input.nextInt();

        int []array = new int [size];
        for ( int i = 0 ; i < array.length ; i++ ){
            System.out.print("a["+i+"] = ");
            array[i] = input.nextInt();
        }
        Hoan_Vi swap = new Hoan_Vi();

        System.out.println("By references");
        swap.SwapArray(array,1,2);
        swap.showArray(array);

        System.out.println(" \n By value");
        swap.hoanviMang(array[1],array[2]);
        swap.showArray(array);



    }


}
