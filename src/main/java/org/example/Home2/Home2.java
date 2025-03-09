package org.example.Home2;

public class Home2 {
    public static String make_install(String word)
    {
        String drow = "";
        for (int i=word.length()-1; i>=0;i--){
            drow += word.charAt(i);
        }

        return drow;
    }

}