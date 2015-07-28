package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsofSumArray {
	
	/** * Prints all pair of integer values from given array whose sum is is equal to given number.
	 *  * complexity of this solution is O(n^2) */ 
	public static List<List<Integer>> printPairs(int[] array, int sum) { 
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) { 
			int first = array[i]; 
			for (int j = i + 1; j < array.length; j++) { 
				int second = array[j]; 
				if ((first + second) == sum) { 
					result.add(j);
					result.add(i);
					lists.add(result);
				}
				//result.clear();
			} 
			
			 
		}
		return lists;
	}
	
	public static void main(String args[]) { 
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 }; 
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 }; 
		List<List<Integer>> lists = printPairs(numbers, 7); 
		
		for(Integer num : lists.get(0)){
			
		}
	}

}
