package Strings;

import java.util.Scanner;

public class GetCharacterfromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String without spaces: ");
        String str = scan.next();
        System.out.print("Enter index at which you want to fetch character: ");
        int n = scan.nextInt();
        char c = str.toCharArray()[n];
        System.out.println("Character at index " + n + " is " + c);
    }
}
