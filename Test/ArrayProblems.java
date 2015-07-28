package Test;


public class ArrayProblems {
	/**
	 *  
	 *  
---  K’th Smallest/Largest Element in Unsorted Array | Set 2 (Expected Linear Time)
Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in the given array. It is given that ll array elements are distinct.

Examples:
Input: arr[] = {7, 10, 4, 3, 20, 15}
       k = 3
Output: 7
Solution : Sort the array and pick k-1 element -- O(nlogn)


---- Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer.

Example:
I/P    [1, 2, 4, ,6, 3, 7, 8]
O/P    5

Calculate total = n(n+1)/2. For each element in loop, subtract from total. It will have missing no



*
**/
	
	
	
/**Find common elements in three sorted arrays
Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
ARRAYS ARE SORTED
Examples:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80  */
	
	public static void findCommon(int a1[], int[] a2, int a3[]){
		int x=0;  
		int y =0;  
		int z =0;
		int n1 = a1.length;
		int n2 = a2.length;
		int n3 = a3.length;		
		
		while( x <n1 && y < n2 && z < n3){
		    if(a1[x] == a2[y] && a2[y] == a3[z]){
		    	System.out.println ("Common elem " +a1[x]);
		    	x++;
		    	y++;
		    	z++;	    	
		    }
			else if(a1[x] < a2[y]){
				x++;
			} else if (a2[y] < a3[z]){
				y++;
			} else { // x>y and y > z
				z++;
			}
		}
	}
	
	/**
	 * Given a sorted array and a number x, find the pair in array whose sum is closest to x
	 * Array is sorted
	 * Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
	Output: 22 and 30
	 */
	
	public static void findClosetPair ( int[] a ,int k){
		int i1 = -99;
		int i2 = -99;
		int l = 0;
		int r = a.length - 1;
		int diff = Integer.MAX_VALUE;
		while (l < r){
			if (Math.abs(a[l] + a[r] - k) < diff) {
				i1 = l;
				i2 = r;
				diff = Math.abs(a[l] + a[r] - k);
			} else if (a[l] + a[r] > k) {
				r--;
			} else {
				l++;
			}
		}
		System.out.println("Closest Pair" +a[i1] + " " +a[i2]);
	}
	
	public static void main(String args[]){
		
		//FindCommon
		int a1[] = {1, 5, 10, 20, 40, 80};
		int a2[] = {6, 7, 20, 80, 100};
		int a3[] = {3, 4, 15, 20, 30, 70, 80, 120};	
		findCommon(a1,a2,a3);
		
		//findClosetPair
		int arr[] =  {10, 22, 28, 29, 30, 40};
		int k = 54;
		findClosetPair(arr, k);
		
	}
	
	

}
