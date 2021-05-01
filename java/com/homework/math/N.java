package com.homework.math;

public class N implements MathOperations {

    // public int getSquare(int a) {
    //     int sq = a*a;
    //     return sq;
    // }
    
    
    // public double getSquareRoot(double a) {
    //     double sqrt = (Math.sqrt(a));
    //     return sqrt;
    // }

    public int largestInteger(int a, int b) {
        int large;
        if (a > b)
            large = a;
        else
            large = b;

        return large;
    }}