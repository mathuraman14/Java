package Arrays;

import java.util.Objects;
import java.util.Scanner;

public class CommonElementinArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length of Both Arrays");
        int n = scan.nextInt();
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];
        System.out.println("Enter 1st String Array");
        for(int i=0;i<n;i++)
        {
            arr1[i] = scan.next();
        }
        System.out.println("Enter 2nd String Array");
        for(int i=0;i<n;i++) {
            arr2[i] = scan.next();
        }
        System.out.print("Common elements in both array are: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(Objects.equals(arr1[i], arr2[j]))
                {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
