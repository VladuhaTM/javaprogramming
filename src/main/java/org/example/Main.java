package org.example;

import org.example.Home1.Home1;
import org.example.Home2.Home2;
import org.example.Home3.Home3;
import org.example.Home4.Home4;
import org.example.Home5.Home5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: FizzBuzz");
        for (int i = 1; i <= 20; i++) { // Check the first 20 numbers
            System.out.println(Home1.FizzBuzz(i));
        }

        System.out.println("\nTask 2: Reverse a string");
        String word = "make install";
        System.out.println("Original string: " + word);
        System.out.println("Reversed: " + Home2.make_install(word));

        System.out.println("\nTask 3: Quadratic equation");
        int a = 1, b = 4, c = 4;
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println(Home3.Equation(a, b, c));

        System.out.println("\nTask 4: Sum of a series");
        double sum = Home4.Calc();
        System.out.println("Sum of the series: " + sum);

        System.out.println("\nTask 5: Palindrome check");
        String testWord = "Home";
        System.out.println("Word: " + testWord);
        System.out.println("Is it a palindrome? " + Home5.Palindrome(testWord));
    }
}