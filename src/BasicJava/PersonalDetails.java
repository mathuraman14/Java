package BasicJava;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("Enter your birth date: ");
        int date = scan.nextInt();
        System.out.print("Enter your birth month (in number): ");
        int month = scan.nextInt();
        System.out.print("Enter your birth year: ");
        int year = scan.nextInt();
        System.out.print("Enter your Gender: ");
        char g = scan.next().charAt(0);
        System.out.println("your details are:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(date + "/" + month + "/" + year);
        System.out.println(g);
        System.out.println("You will Pass Class 10th in year: " + (year+16));
        System.out.println("You will Pass Class 12th in year : "+ (year+18));
    }
}
