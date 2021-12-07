//Write a Java program that checks whether a given string is a palindrome or not.
//Ex: MADAM is a palindrome?

import java.util.Scanner;

public class StringPalindrome {

public static void main(String[] args) {
    String text ="";

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the word you want to check as palindrome: ");
    String by_user = sc.nextLine();

    int wordcount = by_user.length();

    for (int i = wordcount-1; i >= 0; i--){
        text = text + by_user.charAt(i);
    }
    if(by_user.equalsIgnoreCase(text)){
        System.out.println("It is a plaindrome.");
    }
    else {
        System.out.println("It is not a plaindrome.");
    }

}
}
