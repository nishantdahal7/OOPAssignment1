//Write a Java program to compute body massindex (BMI).
// Note: The formula is BMI = kg/m2 where kg is a person's weight in kilograms and m2is their height in metres squared.


import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in meter");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in kg");
        double weight = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("The BMI is " + BMI);
    }

}