package org.example.Home1;

public class Home1 {
    public static String FizzBuzz(int i) {
        if (i % 5 == 0 && i % 7 == 0) {
            return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "fizz";
        } else if (i % 7 == 0) {
            return "buzz";
        } else {
            return Integer.toString(i);
        }
    }
}