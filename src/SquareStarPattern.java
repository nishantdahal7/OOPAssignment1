//*5.Write a Java program to display the following star pattern:
// a.Square Star Pattern

import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number of row : ");
        int row = sc.nextInt();
        System.out.print("enter the number of column : ");
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}