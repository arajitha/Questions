package Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestComparator {
	
	   public static Map<Long, String> sort(Map<Long, String> inMap) {
		   
		 //  TreeMapComparator tmc = new TreeMapComparator();

		 //  TreeMap<Long, String> tm = new TreeMap<Long, String>(new Comparator<Entry<Long,String>>(){

		   
		   TreeMapComparator tmc = new TreeMapComparator(inMap);
		   Map<Long, String> tm = new TreeMap<Long, String>(tmc);
		   
		  // TreeMapComparator tmc = new TreeMapComparator();
		  // Map<Long, String> tm = new TreeMap<Long, String>(new TreeMapComparator());
		   
		   for(Map.Entry<Long, String> im : inMap.entrySet()){
			  tm.put(im.getKey(), im.getValue());   
		   }	   
		   return tm;
	   }
	   
	   public static void main(String[] args){
		   Map<Long, String> hm = new HashMap<Long, String>();
		   hm.put(2L,"BBB");
		   hm.put(1L, "ABC");
		   hm.put(4L,"CCC");
		   
		   Map<Long, String> shm = sort(hm);
		   for(Map.Entry<Long, String> s : shm.entrySet() ){
			   System.out.println(s.getKey() + " "  +s.getValue());
		   }		   
		   
	   }

}
