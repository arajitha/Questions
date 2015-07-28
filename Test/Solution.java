package Test;
	import java.io.*;
	import java.util.*;

	class Solution
	{
	    public static void main(String [] args) throws Exception
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter no of numbers");
	        int n = sc.nextInt();
	        for(int t = 0; t < n; t++) {
		        System.out.println("Enter first numbers");
	            int a = sc.nextInt();
		        System.out.println("Enter second numbers");
	            int b = sc.nextInt();
	            System.out.println(a+b);
	        }
	    }
	}

