package Arrays;

import java.util.Scanner;

public class Arrayrotation {

    void rotateLeft(int[] arr, int d, int n)
    {
        int i;
        for(i=0;i<d;i++)
            leftRotatebyOne(arr,n);
    }

    void leftRotatebyOne(int[] arr, int n)
    {
        int i,temp;
        temp = arr[0];
        for(i=0;i<n-1;i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter number of rotations: ");
        int number = scan.nextInt();
        Arrayrotation object = new Arrayrotation();
        object.rotateLeft(arr,number,n);
        System.out.print("Rotated array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
