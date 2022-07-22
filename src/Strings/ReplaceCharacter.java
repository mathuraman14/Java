package Strings;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string without spaces: ");
        String str = scan.next();
        System.out.print("Enter index at which you want to change character: ");
        int n = scan.nextInt();
        System.out.print("Enter the character you want to replace: ");
        char c = scan.next().charAt(0);
        String str2 = str.substring(0,n) + c + str.substring(n+1);
        System.out.print("Altered String is: " + str2);
    }
}
