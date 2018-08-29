package com.jbohn.app;

import com.jbohn.app.algorithm.*;

public class App 
{
    private static Fibonacci fibonacci = new Fibonacci();

    public static void main( String[] args )
    {
        int n = 10;
        int fibonacciResult = fibonacci.fibonacciRecursion(n);
        System.out.println( "Fibonacci to " + n + " is " + fibonacciResult );
    }
}
