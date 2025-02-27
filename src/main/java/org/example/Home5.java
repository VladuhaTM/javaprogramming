package org.example;

public class Home5 {
    public static void main(String[] args) {
        String word = "Home";
        System.out.println(word);
        System.out.println(palindrome(word));
    }
    public static Boolean palindrome(String word)
    {
        for (int i=0; i< word.length()/2+1;i++){
            if (word.charAt(i)!=word.charAt(word.length()-1-i))
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}