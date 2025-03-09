package org.example.Home3;
import static java.lang.Math.sqrt;

public class Home3 {
    public static String Equation(int a, int b, int c)
    {
        if(b*b-4*a*c<0)
            return "No horses";
        else if (b*b-4*a*c==0)
        {
            return ("1 root: x = " + -b/(2*a));
        }
        else
            return ("2 roots: x = " + (-b+sqrt(b*b-4*a*c)/(2*a)) + (-b-sqrt(b*b-4*a*c)/(2*a)));
    }
}