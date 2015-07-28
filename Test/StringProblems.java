package Test;

import java.util.HashMap;

public class StringProblems {
	/*
	Q: Write strstr in your choice of C/Java/C++/Python/PHP. 
	Use a character array for languages that provide a string class or don't have pointers.
	Use a naive (brute force) search. This is not a trick question.
	If you use other functions like strcmp, write them too.

	For C: int strstr(const char *haystack, const char *needle);
	For Java: int strstr(char[] haystack, char[] needle);

	DESCRIPTION
	The strstr() function finds the first occurrence of the substring needle in the string haystack.

	Return the index in haystack at which needle begins or -1 if not found.

	Example: if needle=‘bar’ and haystack=‘foobar’ then return 3
	*/
	
	public static int strstr(char[] hay, char[] need){
		int m = hay.length;
		int n = need.length;
		int i = 0;
		int j = 0;
		int startPoint = 0;
		boolean matchFound = false;
		while(i < m && j < n){
			if(hay[i] == need[j]){
				if(startPoint == 0){
					startPoint = i;
					matchFound = true;
				}
				i++;
				j++;		
			} else {
				i++;
				if(matchFound){
					return -99;
				}
			}
		}
		if(matchFound && j == n){ // making sure all elemets in need[] are compared 
			return startPoint;
		} else {
			return -99;
		}
	}
	
	
	/**
	 * Check if string is palindrome
	 * @param args
	 */
	
	public static boolean isPalindrome(String s){
		int i1 = 0;
		int i2 = s.length() - 1;
		while (i2 > i1){
			if(s.charAt(i1) != s.charAt(i2)){
				return false;
			}
			i1 ++;
			i2--;
		}
		return true;
	}
	
	/**
	 * Program to check if strings are anagrams.
	 */
	public static boolean isAnagram(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		} else {
			HashMap<Character, Integer> m = new HashMap<Character, Integer>();
			for (int i =0; i < s1.length(); i++){
				int val = s1.charAt(i);
				if(m.get(s1.charAt(i)) == null){
					m.put(s1.charAt(i), 1);
				}else {
					int num = m.get(s1.charAt(i));
					m.put(s1.charAt(i), num + 1);		 
				}
			}
			for(int j=0 ; j < s2.length(); j++){
				if(m.get(s2.charAt(j)) == null){
					return false;
				}else {
					int num = m.get(s2.charAt(j));
					m.put(s2.charAt(j), num - 1);		 
				}
			}
			for(int num : m.values()){
				if(num!=0){
					return false;
				}
			}
			return true;
		}
	}
	
	
	public static String reverseString(String str){
		int end = str.length();
		int start = 0;
		char s[] = new char[end];
		for(int i = end - 1; i >=0; i--){
			s[start] = str.charAt(i);
			start++;
		}
		//String[] s2= new String[str.length()];
		//s2.t.toString()
		
		return new String(s);
	}
	
	/**
	 * Find non - repeating characters in string.
	 * Parse string and put in hashmap. 
	 * parse hashmap and look for value = 1
	 * @param args
	 */
	public static void main(String[] args){
		String s1= "foobar";
		String s2 = "bar";
		System.out.println(strstr(s1.toCharArray(), s2.toCharArray()));
		
		String s3= "foobar";
		String s4 = "bar1";
		System.out.println(strstr(s3.toCharArray(), s4.toCharArray()));	
		
		String p1 = "mom";
		boolean b1 = isPalindrome(p1);
		System.out.println("Is Palindrome " +p1 +" : " +b1);	
		
		String p2 = "team";
		boolean b2 = isPalindrome(p2);
		System.out.println("Is Palindrome " +p2 +" : " +b2);
		
		
		String a1= "listen";
		String a2 = "silent";
		
		String a3 = "loves";
		String a4 = "solva";
	//	boolean isAnag1 = isAnagram(a1,a2);
		boolean isAnag2 = isAnagram(a3,a4);
		//System.out.println("IsAnagram  listen, silent " +isAnag1);
		System.out.println("IsAnagram  loves, solves1 " +isAnag2);
		
		System.out.println("Reverse of string listen " +reverseString("listen"));
	}
}
