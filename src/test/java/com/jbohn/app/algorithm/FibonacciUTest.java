package com.jbohn.app.algorithm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FibonacciUTest extends TestCase{

    private Fibonacci sut = new Fibonacci();

    public void testFibonacciRecursionWith1(){
        int result = sut.fibonacciRecursion(1);

        assertEquals(1, result);
    }

    public void testFibonacciRecursionWith2(){
        int result = sut.fibonacciRecursion(1);

        assertEquals(1, result);
    }

    
    public void testFibonacciRecursionWith3(){
        int result = sut.fibonacciRecursion(3);

        assertEquals(2, result);
    }


    public void testFibonacciRecursionWith9(){
        int result = sut.fibonacciRecursion(9);

        assertEquals(34, result);
    }

    public void testFibonacciRecursionWith10(){
        int result = sut.fibonacciRecursion(10);

        assertEquals(55, result);
    }

    public void testFibonacciLoopWith1(){
        int result = sut.fibonacciloop(1);

        assertEquals(1, result);
    }

    public void testFibonacciLoopWith2(){
        int result = sut.fibonacciloop(2);

        assertEquals(1, result);
    }

    
    public void testFibonacciLoopWith3(){
        int result = sut.fibonacciloop(3);

        assertEquals(2, result);
    }


    public void testFibonacciLoopWith9(){
        int result = sut.fibonacciloop(9);

        assertEquals(34, result);
    }

    public void testFibonacciLoopWith10(){
        int result = sut.fibonacciloop(10);

        assertEquals(55, result);
    }
}