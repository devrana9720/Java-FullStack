package com.dev;

// import static org.junit.Assert.*;

// import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
        System.out.println("TestDivide: Testing division 10/2");
        App div= new App();
        int result= div.divide(10, 2);
        int expected = 5;
        assertEquals(expected, result,()->"Division result is not as expected");
    }
    @Test
    public void TestDivide1(){
        System.out.println("TestDivide1: Testing division 8/2");
        App div= new App();
        int result = div.divide(8, 2);
        int expected = 4;
        assertEquals(expected, result,()->"Division result is not as expected");
    }
    @Test
    public void TestDivide2(){
        System.out.println("TestDivide2: Testing division 20/2");
        App div= new App();
        int result = div.divide(20, 2);
        int expected = 10;
        assertEquals(expected, result,()->"Division result is not as expected");
    }
 
    @Test
    public void TestReverseString1(){
        System.out.println("TestReverseString1: Testing string reversal");
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
 