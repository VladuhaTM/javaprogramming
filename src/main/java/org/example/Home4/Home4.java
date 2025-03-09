package org.example.Home4;

public class Home4 {
    public static double Calc() {
        double sum = 0.0;
        double term;
        int n = 2;

        for (; ; n++) {
            term = 1.0 / (n * n + n - 2);
            if (term < 1e-6) {
                break;
            }
            sum += term;
        }

        return sum;
    }
}