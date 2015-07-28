package Test;

import java.util.HashMap;
import java.util.Stack;

/*Validate a string for brace closures. Following are the valid braces, [, { ,( and they should closed by the respective closure braces
Valid String: “square[blah]curly {blah(ok)} done”
Valid String: “square[blah]curly {blah(ok)} done(){}”
Invalid string: “square[blah]curly {blah(ok}) done”
Invalid string: “square[[{gfgfg”
to Ramkumar Venkataraman (pr
[{()}]
*/
      
 public class TestValidString {
    
      public static boolean isValid(String s){    
	        HashMap<Character, Character> hm = new HashMap<Character, Character>();
	        hm.put('{', '}');
	        hm.put('[',']');
	        hm.put('(',')');
	        
	        Stack<Character> st = new Stack<Character>();
	        
	        for(int i = 0 ; i < s.length(); i++){
	              char c = s.charAt(i);
	              if(hm.keySet().contains(c)){
	                  st.push(c);
	              }
	              else if(hm.values().contains(c)){
	                  if(!st.empty() && hm.get(st.peek()) == c){
	                      st.pop();
	                   } else {
	                       return false;
	                  }          
	              }    
	         }
	         return st.empty();
       }
      
      public static int countWays(int n, int[] map){
    	  if(n < 0 ) {return 0; }
    	  else if (n ==1) { return 1;}
    	  else if (map[n] > -1) { return map[n];}
    	  else{
    		  map[n] = countWays(n-1, map) + countWays(n-2, map) + countWays(n-3, map);
    		  return map[n];
    	  }
      }
       
      public static void findNumber(int[] m){
    	  int l = m.length;
    	  byte[] bit = new byte[l/8];
    	  for (int i = 0; i < l; i++){
    		  int b= m[i];
    		  bit[b/8] |= 1 << (b%8);
    		  
    	  }
    	  for (int i = 0; i < bit.length; i++){
    		  for (int j = 0 ;i < 8; j ++){
    			  if((bit[i] & (1 << j)) == 0){
    				  System.out.println(i * 8 +j);
    				  return;
    			  }
    		  }
    	  }
    	  
    	  
      }
       
       public static void main(String[] args){
       
           String s1 = "square[blah]curly {blah(ok)} done";
           String s2 = "square[blah]curly {blah(ok)} done(){}";
           String s3 =  "square[blah]curly {blah(ok}) done";
           String s4 =  "square[[{gfgfg";
           
          // System.out.println(isValid(s1) + "True"); 
          // System.out.println(isValid(s2) + "True"); 
          // System.out.println(isValid(s3) + "False"); 
          // System.out.println(isValid(s4) + "False");
           
           int[] ways = {-1,-1,-1, -1,-1, -1};
           int x = countWays(5, ways);
          // System.out.println("Ways "+x);
           int p[] = {1,3,4,5};
           findNumber(p);
       }   
       
       
       
}

