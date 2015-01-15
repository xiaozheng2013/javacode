package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
	public int Fib(int x) {
		if(x <= 1) return 1;
		int b;
		int a = b = 1;
		for(int i = 1;i<x;i++) {
			b = a+b;
			a = b-a;
		}
		return b;
	}
	
    public static void main( String[] args )
    {
    	App myApp = new App();
    	int x = 10;
    	for(int i = 0;i<=x; i++) {
    		int y = myApp.Fib(i);
        	System.out.println( "the " + i +"-th Fib number is " + y );
        	
    	}
    }
}
