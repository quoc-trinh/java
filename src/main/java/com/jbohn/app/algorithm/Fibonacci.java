package com.jbohn.app.algorithm;

public class Fibonacci{

    public int fibonacciRecursion(int n){
        if (n == 1 || n==2){
            return 1;
        }
        return fibonacciRecursion(n -1) + fibonacciRecursion(n -2);
    }

    public int fibonacciloop(int n){
        int sum = 0;
        int num1 = 0;
        int num2 = 1;
        if ( n < 3 ){
            return 1;
        }
        for (int i = 1; i<n;i++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return sum;
    }

}