package com.dev;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void Test()
    {
        System.out.println("First Junit Test");
    }

    @Test
    public void TestDivide(){
        App div= new App();
        int result = div.divide(10, 2);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void TestReverseString1(){
        App rev=new App();
        String result=rev.reverseString("Hello");
        String expected="olleH";
        assertEquals(expected,result);
    }

    @Test
    public void TestReverseString2(){
        App rev=new App();
        assertEquals("dlroW",rev.reverseString("World"));
        assertEquals("avaJ",rev.reverseString("Java"));
        assertEquals("tseT",rev.reverseString("Test"));
        assertEquals("gnimmargorP",rev.reverseString("Programming"));
    }
}
 