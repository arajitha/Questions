package Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Comparator vs Comparable 
 * Comparator - compare(obj1, obj2) - java.util . This is like a seperate util class which implements compareTo to compare
 * Comparable - compareTo(obj 1) java.lang - natural ordering of TreeMap / TreeSet. Here the objects of that class are ordered. TreeMap is ordered by the keys
 */


/*public class TreeMapComparator implements Comparator<Map.Entry<Long, String>> {

    public int compare(Map.Entry<Long, String> e1, Map.Entry<Long, String> e2){
            return e1.getValue().toLowerCase().compareTo(e2.getValue().toLowerCase());
    
    } 

}*/

public class TreeMapComparator implements Comparator<Long>{	
	Map<Long, String> map;
	public TreeMapComparator(Map<Long, String> map) {
		this.map = map;
	}
	  
	public int compare(Long o1, Long o2) {
		return map.get(o1).compareTo(map.get(o2));
	}
	  
	/*public int compare(Object keyA, Object keyB){	 
	    Comparable valueA = (Comparable) map.get(keyA);
	    Comparable valueB = (Comparable) map.get(keyB); 
	  //  System.out.println(valueA +" - "+valueB);
	    return valueA.compareTo(valueB); 
	  }*/
	
	/*	public int compare(Entry<Long, String> e1, Entry<Long, String>e2){
	return e1.getValue().toLowerCase().compareTo(e2.getValue().toLowerCase());
} */

}
