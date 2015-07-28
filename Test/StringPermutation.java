package Test;


/**
 * program to print all permutations of a given string
A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself. A string of length n has n! permutation.
Source: Mathword(http://mathworld.wolfram.com/Permutation.html)

Below are the permutations of string ABC.
ABC, ACB, BAC, BCA, CAB, CBA
 * @author raarcot
 *
 */
public class StringPermutation {
	public static void main (String[] args) { 
		String str = "ABC";
	   // permutation("", str); 
	    perm("", str);
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	
	private static void perm(String prefix, String str){
		int n = str.length();
		if (n == 0) {
			System.out.println(prefix);
			return;
		}
		//else {
			for (int i =0 ; i< n ; i ++){
				String newPrefix = prefix + str.charAt(i);
				String subStr = str.substring(0, i) + str.substring(i+1,n);
				perm(newPrefix, subStr);
			}
		//}
	}

}
