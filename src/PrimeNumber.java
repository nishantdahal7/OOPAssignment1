//Write a Java program that prompts the user for an integer and
//then prints out all the prime numbers up to that Integer?

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer up to which you which you want to get the integers: ");
        int num = sc.nextInt();

        for(int i=2;i<=num;i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }
            if (counter <= 2) {
                System.out.println(i);
            }
        }
    }
}


