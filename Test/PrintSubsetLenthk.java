package Test;


import java.util.Arrays;

/**
 * Program to find subsets of length equal to given value
 */
import java.util.LinkedList;

/**
 * Given a set S, find all the maximal subsets whose sum = k. For example, if S = {1, 2, 3, 4, 5} and k = 7

Output is: {1, 2, 3} {1, 2, 4} {1, 5} {2, 5} {3, 4}

Hint:

Ğ Output doesnÕt contain any set which is a subset of other.

Ğ If X = {1, 2, 3} is one of the solution then all the subsets of X {1} {2} {3} {1, 2} {1, 3} {2, 3} are omitted.

Ğ Lexicographic ordering may be used to solve it


 * @author raarcot
 *
 */
public class PrintSubsetLenthk {
	private int number;
	private int sum;
	private LinkedList<Integer> subset;
	private int[] numbers;
	
	public PrintSubsetLenthk(int[] numbers,int number) {
		// TODO Auto-generated constructor stub
		  this.numbers=numbers;
		  this.number=number;
		  sum=0;
		  subset=new LinkedList<Integer>();	 
	}  
	  public void findSubset(int startPoint)
	  {
		  if(sum==number)
		  {
				  System.out.println(subset+" :: "+sum);
			  
		  }
		  //else {
		  
			  for(int i=startPoint;i<numbers.length;i++) {
				  sum=sum+numbers[i];
				  if(sum > number)
				  {
					sum=sum-numbers[i];
					//System.out.println("Sum "  +sum);
					  break;				
				  }
				  subset.add((int)numbers[i]);
				  //System.out.println("subset after adding "  +subset);

				  //System.out.println("i "  +i);

				  findSubset(i+1);			  
				  sum=sum-numbers[i];
				  //System.out.println("Sum after removing "  +sum);

				  subset.removeLast();
				  //System.out.println("subset after remove "  +subset);

			  }
		  //}
	  }
	  
	  public static void findSubset1(int startPoint, int sum1, int[] numbers1, int k,  LinkedList subset1)
	  {
		  if(sum1==k)
		  {
				  System.out.println(subset1+" :: "+sum1);
			  
		  }
		  //else {
		  
			  for(int i=startPoint;i<numbers1.length;i++) {
				  sum1=sum1+numbers1[i];
				  if(sum1 > k)
				  {
					sum1=sum1-numbers1[i];
					//System.out.println("Sum "  +sum);
					  break;				
				  }
				  subset1.add((int)numbers1[i]);


				  findSubset1(i+1, sum1, numbers1, k, subset1);			  
				  sum1=sum1-numbers1[i];

				  subset1.removeLast();

			  }
		  //}
	  }
	  
	  
	  
	  public static void main(String args[])
	  {
		  int[] numbers={1, 2, 3, 4, 5} ;
		  int number=10;
		  Arrays.sort(numbers);
		  PrintSubsetLenthk ki=new PrintSubsetLenthk(numbers,number);
		 // ki.findSubset(0);
		  findSubset1(0, 0, numbers, number, new LinkedList<Integer>());
	  }
}
	
