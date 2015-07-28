package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;


/**
 * Program to print a occurence of words in string in alphabetical order
 * @author raarcot
 *
 */
public class StringsAlphaOrder  {
	
	public static void main(String[] args) throws IOException{
		//String s = readFile("/Users/raarcot/Desktop/TestFile1.rtf");
		//System.out.println(" S " +s);
		printWordOccurence("This is a test a");
	}
	
	
	
	public static String readFile(String fileName) throws IOException {
	
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        while(line != null){
	        	sb.append(line);
	        	sb.append(" ");
	        	line = br.readLine();
	        }
	        
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
	
	public static void printWordOccurence(String s){
		StringTokenizer st = new StringTokenizer(s, " ");
		String words[] =  new String[st.countTokens()];
		int sc = st.countTokens();
		for (int i =0 ; i < sc; i++){	
			String nt = st.nextToken();
			words[i] = nt;
		}
		
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				return arg0.toLowerCase().compareTo(arg1.toLowerCase());
			}
			
		});
		

		for (String word : words){
			Integer occur = tm.get(word);
			if(tm.get(word) != null){		
				tm.put(word, (occur + 1));				
			} else {
				tm.put(word, (1));
			}
		}
		for(Map.Entry<String, Integer> entry : tm.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
	}


/*
 * Comparator vs Comparable 
 * Comparator - compare(obj1, obj2) - java.util . This is like a seperate util class which implements compareTo to compare
 * Comparable - compareTo(obj 1) java.lang - natural ordering of TreeMap / TreeSet. Here the objects of that class are ordered. TreeMap is ordered by the keys
 */
		
   /*public static Map<Long, String> sort(Map<Long, String> inMap) {
	   
	    // First way
	   Map<Long, String> tm = new TreeMap<Long, String>(new Comparator(Map.Entry<Long, String>){
		   public int compare(Map.Entry<Long, String> e1, Map.Entry<Long, String> e2){
			   return e1.getValue().toLowerCase().compareTo(e2.getValue().toLowerCase());
		   }		   
	   });

			  TestClass tc = new TestClass();
			  Map<Long, String> sMap = new TreeMap<Long, String>(new Comparator<Map<Long, String> {
			    public int compare(Map.Entry<Long, String> e1, Map.Entry<Long, String> e2){
			            return e1.getValue.toLowerCase().compareTo(e2.getValue.toLowerCase());
			    
			    } 
			  });

			  for(Entry<Long, String> e : e.entrySet) {
			         sMap.put(e.
			  }
			}

			Set<String> mySet = new HashSet();
			Collections.sort(mySet);


			public TestClass implements Comparator<Map.Entry<Long, String>> {

			    public int compare(Map.Entry<Long, String> e1, Map.Entry<Long, String> e2){
			            return e1.getValue.toLowerCase().compareTo(e2.getValue.toLowerCase());
			    
			    } 

			}
	} */
}
