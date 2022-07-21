package Arrays;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array 1 Length");
        int n = scan.nextInt();
        String[] arr1 = new String[n];
        System.out.println("Enter elements of Arr1");
        for(int i=0;i<n;i++)
        {
            arr1[i] = scan.next();
        }
        String[] arr2 = new String[n];
        System.arraycopy(arr1, 0, arr2, 0, n);
        System.out.println("Copied Array is");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
