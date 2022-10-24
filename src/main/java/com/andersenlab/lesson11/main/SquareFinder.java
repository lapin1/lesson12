package com.andersenlab.lesson11.main;

public class SquareFinder {

    public SquareFinder() {
    }

    public double findSquare(int a, int b, int c) {
        double s = 0;
        if (!checkInput(a, b, c)) {
            System.out.println("incorrect values");
        } else {
            int p = (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return s;
    }

    public boolean checkInput(int a, int b, int c) {
        return (a > 0 && b > 0 && c > 0);
    }
}
