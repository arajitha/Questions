package Test;

public class KMP {
	/*
	 * The KMP matching algorithm uses degenerating property (pattern having same sub-patterns appearing more than once in the pattern) of the pattern and 
	 * improves the worst case complexity to O(n). The basic idea behind KMP�s algorithm is: whenever we detect a mismatch (after some matches), we already 
	 * know some of the characters in the text (since they matched the pattern characters prior to the mismatch). We take advantage of this information to avoid 
	 * matching the characters that we know will anyway match.
KMP algorithm does some preprocessing over the pattern pat[] and constructs an auxiliary array lps[] of size m (same as size of pattern). Here name lps 
indicates longest proper prefix which is also suffix.. For each sub-pattern pat[0�i] where i = 0 to m-1, lps[i] stores length of the maximum matching proper
 prefix which is also a suffix of the sub-pattern pat[0..i].
 O(n+k)
	 */
	
	public static int[] computeLPS(String pat, int m){
		int[] lps = new int[m];
		lps[0] = 0; // lps[0] is always 0
		int len = 0; // longest prefix length
		int i = 1;
		while(i < m){
			if(pat.charAt(i) == pat.charAt(len)){
				len++;
				lps[i] = len;
				i++;
			} else {
				if(len ==0){
					lps[i] = 0;
					i++;			
				} else{
					len = lps[len - 1];				
				}
			}
		}
		return lps;
	}
	
	
	public static void KMPSearch(String text, String pat){
		int m = pat.length();
		int n = text.length();
		int i = 0;
		int j = 0; // index for pattern
		int[] lps = computeLPS(pat, m);
		while (i < n){
			if (text.charAt(i) == pat.charAt(j)){
				i++;
				j++;
			} 
			if (j==m ){
				System.out.println("Pattern found at index " +(i-j));
				j = lps[j-1];
			}
			else if (i < n && text.charAt(i) != pat.charAt(j)){

		        // Do not match lps[0..lps[j-1]] characters,
		        // they will match anyway
				if(j !=0 ){
					j = lps[j-1]; 
				} else {
					i++;
				}
			} 
		}		
	}
	
	
	public static void main(String[] args){
		String text = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		KMPSearch(text, pat);
		//For the pattern �AAABAAA�, lps[] is [0, 1, 2, 0, 1, 2, 3]

		String pat1 = "AAABAAAB";
		int[] lps = computeLPS(pat1, pat1.length());
		for(int i=0; i < lps.length ; i++) {
			System.out.println("LPS " +lps[i]);
		}
	}

}
