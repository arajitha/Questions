package Test;

public class BinaryAddition {
	
	public String binaryAddition(String s1, String s2){

	    int len1 = s1.length();
	    int len2 = s2.length();
	    
	    int max = Math.max(len1, len2);
	    StringBuilder sb = new StringBuilder("");
	    
	    int carry = 0;
	    
	    for(int i=0; i < max; i++){
	        int m = getBit(s1, len1 - i - 1);
	        int n = getBit(s2, len2 - i -1);
	        int add = m + n + carry;
	        sb.append(add % 2);
	        carry = add / 2 ;
	     }
	     if (carry ==1){
	        sb.append(1);
	     }
	        
	    return sb.reverse().toString();

	}


	public int getBit(String s, int index){
	    if (index < 0 || index >=s.length()){
	       return 0;
	    }
	    if (s.charAt(index) == '0'){
	      return 0;
	    }
	    else { 
	      return 1;
	    }

	}


}
