package BasicJava;

import java.util.Scanner;

public class PalindromNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter Number");
        n = scan.nextInt();
        int temp = n,sum=0;
        while(n>0)
        {
            int temp1;
            temp1 = n%10;
            sum = (sum * 10) + temp1;
            n = n/10;
        }
        if(temp == sum) System.out.println("Palindrome Number");
        else System.out.println("Not a Palindrome Number");
    }
}
