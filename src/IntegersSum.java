//Write a Java program that reads a line of integers and
// then displays each integer and the sum of all integers?

import java.util.Scanner;
import java.util.StringTokenizer;


public class IntegersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a proper line consisting only of integers with spaces between them: ");
        String digit = sc.nextLine();
        StringTokenizer token = new StringTokenizer(digit);
        int sum = 0;
        System.out.println("Entered digits are : ");
        while (token.hasMoreTokens()) {
            String temp = token.nextToken();
            int dig = Integer.parseInt(temp);
            System.out.print(dig + " ");
            sum = sum + dig;
        }
        System.out.println();
        System.out.println("Sum is : " + sum);
    }
}