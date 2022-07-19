package BasicJava;

import java.util.Scanner;

public class NumberOfOccurencies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        for (int i=0;i<n;i++)
        {   int count =0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " - - > > " + count);
        }
    }
}
