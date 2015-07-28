package Test;

/**
 * Implement a simple regex parser which, given a string and a pattern, returns a boolean indicating whether the input matches the pattern.
 * By simple, we mean that the regex can only contain one special character: * (star). The star means what you'd expect, that there 
 * will be zero or more of any character in that place in the pattern. However, multiple consecutive stars are allowed. Some examples of 
 * valid input (and expected output): 

f(a*b, acb) => true 
f(abc*, abbc) => false 
f(**bc, bc) => true
 *
 */
public class RegexExpression {
	
	static boolean matchExp(char exp[], char str[], int i, int j) {

		if (i == exp.length && j == str.length)
			return true;

		if ((i == exp.length && j != str.length)
				|| (i != exp.length && j == str.length))
			return false;

		if (exp[i] == '?' || exp[i] == str[j])
			return matchExp(exp, str, i + 1, j + 1);

		if (exp[i] == '*')
			return matchExp(exp, str, i + 1, j) || matchExp(exp, str, i, j + 1)
					|| matchExp(exp, str, i + 1, j + 1);
		return false;
	}
	
	
	/***
	 * You have to write a function checkRegex() which takes two strings as input, one string represents a regex expression and other is an input 
	 * string to match with the regex expression passed as the other parameter. Return true if it matches, else false.
       Regex may contain characters Ôa-zÕ, Ô.Õ and Ô*Õ where Ô.Õ matches any character and Ô*Õ means 0 or more occurrences of the previous character preceding it.
Examples:
1) a*b matches b,ab,aab
2) a.b matches aab, abb, acb,É, azb
3) .* matches all the valid strings formed by using the lowercase letters
	 * @param args
	 */
	
	public static boolean matchRegex(char[] exp, char[] str, int i, int j, boolean isStar){		
		if (i == exp.length && j == str.length){
			return true;
		}
		if ((i != exp.length && j == str.length) || (i == exp.length && j != str.length)){
			return false;
		}
		if(exp[i] == '.' || exp[i]== str[j]){
			if(!isStar) {
				return matchRegex(exp, str, i+1, j+1, false);	
			} else {
				return true;
			}
		}
		if(exp[i] == '*'){  
			isStar = true;
			if(i>=1){  // a*b - > b, ab, aab
				return matchRegex(exp, str, i-1, j, true) || matchRegex(exp, str, i-1, j+1, true);
			} //else {
			//	return matchRegex(exp, str, i, j+1, true);
			//}
		}
		
		if (exp[i] != str[j]) { // 
			if(i+1 < exp.length && exp[i+1] == '*' ){
		        return matchRegex(exp ,str, i+2, j, true);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		//boolean match = matchExp("a*b".toCharArray(),"acb".toCharArray(), 0,0 );
		//System.out.println(match);
		//System.out.println(matchExp("a*b".toCharArray(),"b".toCharArray(), 0,0 ));
		System.out.println(matchExp("abc*".toCharArray(),"abbc".toCharArray(), 0,0 ));
		System.out.println(matchExp("**bc".toCharArray(),"bc".toCharArray(), 0,0 ));
		
		//Regex Function
		System.out.println(matchRegex("a.b".toCharArray(),"acb".toCharArray(), 0,0, false));
		System.out.println(matchRegex("a*b".toCharArray(),"aab".toCharArray(), 0,0, false ));
		System.out.println(matchRegex("a*b".toCharArray(),"aaab".toCharArray(), 0,0, false ));
		System.out.println(matchRegex("a*b".toCharArray(),"b".toCharArray(), 0,0, false ));
		System.out.println(matchRegex("a*b".toCharArray(),"c".toCharArray(), 0,0, false ));

		System.out.println(matchRegex("a*b".toCharArray(),"ab".toCharArray(), 0,0, false ));
		System.out.println(matchRegex(".*".toCharArray(),"abcc".toCharArray(), 0,0, false ));

	}
}
