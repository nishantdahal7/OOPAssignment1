//Write a Java program to display the following star pattern:
//c.Pyramid Star Pattern

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:");
        int input_row = sc.nextInt();
        for (int i = 1; i <= input_row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}