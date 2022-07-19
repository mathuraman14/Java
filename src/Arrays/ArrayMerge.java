package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
        int a = arr1.length + arr2.length;
        int[] arr_final = new int[a];
        System.arraycopy(arr1,0,arr_final,0,arr1.length);
        System.arraycopy(arr2,0,arr_final,arr1.length,arr2.length);
        for (int j : arr_final) {
            System.out.print(j + " ");
        }
        //System.out.println(Arrays.toString(arr_final));
    }
}
