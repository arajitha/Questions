package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Program to find subsets of length (<=) less than or equal to given value
 */

public class PrintSubsetLengthK1 {
	private int[] numbers;
	private int value;
	private int sum;
	private LinkedList<Integer> subset;
	
	
	public PrintSubsetLengthK1(int[] numbers, int value){
		this.numbers = numbers;
		this.value = value;
		subset = new LinkedList<Integer>();
		sum = 0;			
	}
	

	public void findSubset(int index){
		
		if(sum <= value){
			if (!subset.isEmpty())
				System.out.println("Subset " +subset);
		} 
		for (int i = index; i < numbers.length; i++){
			
			sum = sum + numbers[i];
			if (sum > value){
				sum = sum - numbers[i];
				break;
			}
			subset.add(numbers[i]);
			findSubset(i + 1);
			sum = sum - numbers[i];
			subset.removeLast();
		}	
		
	}
	
	/*public boolean isSubset(int[] set1, int[] set2){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();	
		for (int i; set1)
		
		
		return false;
	}*/
	
	
	
	public static void main(String[] args){
		int[] numbers = {1,2,3,4,5};
		int value = 7;
		// Can use sorting algo
		Arrays.sort(numbers);
		PrintSubsetLengthK1 k1 = new PrintSubsetLengthK1(numbers, value);
		k1.findSubset(0);
	} 

}
