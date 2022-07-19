package BasicJava;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number");
        n = scan.nextInt();
        int temp = n;
        int mul=0;
        while(n>0)
        {   int temp1;
            temp1 = n%10;
            mul = mul + (temp1*temp1*temp1);
            n = n/10;
        }
        if(mul == temp) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");
    }
}
