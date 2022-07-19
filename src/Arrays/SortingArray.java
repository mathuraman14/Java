package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter Array Length");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array");
        for (int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array is: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
