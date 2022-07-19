package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySortingDescending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n;
        n = scan.nextInt();
        System.out.println("Enter Elements of Array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array after Descending Sort");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
