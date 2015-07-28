package Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

Example:

Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).

Input: arr[] = {10, 4, 6, 12, 5}
Output: False
There is no Pythagorean triplet.
 * @author raarcot
 *
 */

// Check geeks for geeks.. following code might not work for all options

public class Pythogorean {
	public static boolean hasSquare(int[] a){
		Arrays.sort(a);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++){
			hm.put(a[i] * a[i], a[i]);
		}
		for (int i = 1; i < a.length; i++){
			int square = (a[i] * a[i]) + (a[i-1]*a[i-1]);
			if(hm.get(square) != null){
				System.out.println("Values : {" +a[i-1] +"," +a[i] +"," + hm.get(square) +"}");
				return true;
			}
		}
		return false;

	}
	
	public static void main(String[] args){
	  int a[] = {3, 1, 4, 6, 5};
	  System.out.println(hasSquare(a));
	  int b[] = {12, 3, 4, 1, 6, 9};
	  System.out.println("Triplet found " +findTriplet(b, 24));
	}
	
	
	/**Find a triplet that sum to a given value
	 * if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24, 
	 * then there is a triplet (12, 3 and 9) present in array whose sum is 24.
	 */
     public static boolean findTriplet(int[] a, int val){
    	 Arrays.sort(a);
    	 int size = a.length;
    	 for(int i = 0 ; i <  size - 2; i++){
    		 int l = i + 1;
    		 int k = size - 1;
    		 int sum = 0;
    		 while (l < k) {
    			 sum =  a[i] + a[l] + a[k];
	    		 if (sum == val){
	    			 System.out.println("Triplet : {" +a[i] +"," +a[l] +"," +a[k] + "}");
	    			 return true;
	    		 } else if (sum > val){
	    			 k--;
	    		 } else {
	    			 l++;
	    		 } 		 
    		 }
    	 }
    	 return false;
     }
     
     
}
