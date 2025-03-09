package org.example.Home5;

public class Home5 {
    public static Boolean Palindrome(String word)
    {
        for (int i=0; i< word.length()/2+1;i++){
            if (word.charAt(i)!=word.charAt(word.length()-1-i))
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}