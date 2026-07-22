package com.dev;

/**
 * Hello world!
 *
 */
public class App 
{
    public int divide(int a, int b) {
        return a / b;
    }

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
