//Write a Java program that accepts two floating-point numbers and checks whether they
//are the same up to two decimal places.

import java.util.Scanner;

public class FloatingPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first float number:");
        float number_one = sc.nextFloat();
        System.out.println("Enter the second float number:");
        float number_two = sc.nextFloat();

        if (Math.abs(number_one - number_two) <= 0.01) {
            System.out.println("They are same number");
        } else {
            System.out.println("They are different number.");
        }

    }

}