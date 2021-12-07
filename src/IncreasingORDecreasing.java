//Write a Java program that accepts three numbers from the user and prints "increasing" if
//the numbers are in increasing order, "decreasing" if the numbers are in decreasing
//order, and "Neither increasing or decreasing order" otherwise.

import java.util.Scanner;

public class IncreasingORDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int first_num = sc.nextInt();

        System.out.print("Enter the second number:");
        int second_num = sc.nextInt();

        System.out.print("Enter the third number:");
        int third_num = sc.nextInt();

        if (first_num < second_num && second_num < third_num) {
            System.out.println("It's in increasing order");
        } else if (first_num > second_num && second_num > third_num) {
            System.out.println("It's in decreasing order.");
        } else {
            System.out.println("neither increasing or decreasing.");
        }

    }
}