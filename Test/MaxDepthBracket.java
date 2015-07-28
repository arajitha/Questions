package Test;

/**
 * Input any string, count the maximum depth of parenthesis nesting, i.e. "abc(123(xyz))m(((n)))o" -> 3. 
 * if input is null or contains a mismatch "a)b(c" or "a(b" 

Also some other samples: 
(((()))) -> 4 
()()()() -> 1
 * @author raarcot
 *
 */
public class MaxDepthBracket {
	
	public static int printMaxBracket(String s){
		int maxCount = 0;
		int curCount = 0;
		if (s == null || s.isEmpty()){
			return -99;
		}
		for (int i = 0; i < s.length(); i ++){
			char c = s.charAt(i);
			if(c == '('){
				curCount++;
				if (curCount > maxCount){
					maxCount = curCount;
				}
			}
			if (c == ')'){
				if(curCount > 0){
					curCount--;
				}
			}
			
		}
		if (curCount!=0){
			return -99;
		}else {
			return maxCount;
		}
	}
	
	public static void main(String[] args){
		System.out.println("Should be 4 : " +printMaxBracket("(((())))"));
		System.out.println("Should be 3 : " + printMaxBracket("abc(123(xyz))m(((n)))o"));
		System.out.println("Should be -99 :" + printMaxBracket("a)b(c"));

		
	}
	

}
