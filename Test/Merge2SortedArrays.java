package Test;

/**
 * Merge two sorted arrays to one array.
 * Merge two sorted arrays to the bigger array
 * 
 * @author raarcot
 *
 */

public class Merge2SortedArrays {
	public static int[] mergeArraysToNewArray(int[] a1, int[] a2){
		int m = a1.length;
		int n = a2.length;
		int res[] = new int[m+n];
		int i = 0 , j=0 , k =0;
		while( i < m && j < n){
			if (a1[i] > a2[j]){
				res[k] = a2[j];
				k++;
				j++;
			} 
			else {
				res[k] = a1[i];
				k++;
				i++;
			}
		}
		while (i < m){
			res[k] = a1[i];
			i++;
			k++;
		}
		while (j < n){
			res[k] = a2[j];
			j++;
			k++;
		}
		return res;	
	}
	
	public static void mergeSmalltoBigArray(int[] bigArr, int[] smArr){
		int m = (bigArr.length - smArr.length);
		int n = smArr.length;
		int i= n; //bigArray, starting from n element
		int j=0; // small array starting from 0
		int k=0; // final k value in array for inserting
		while (k < (m+n)){
			if((i < (m+n) && bigArr[i] <= smArr[j]) || (j==n)){
				bigArr[k] = bigArr[i];
				i++;
				k++;
			} else {
				bigArr[k] = smArr[j];
				j++;
				k++;
			}
			
		}
		
	}
	
	
	
	public static void moveElem(int[] a){
		int NA = -1;
		int size = a.length;
		int j = size - 1;
		for (int i = (size - 1); i >=0; i--){
			if(a[i] != NA){
				a[j] = a[i];
				j--;
			}
		}
	}
	
	
	public static void main(String[] args){
		int[] a1 = {1, 5, 7};
		int[] a2 = {2, 3, 4 ,5, 6};
		int[] a3 = mergeArraysToNewArray(a1,a2);
		for (int i = 0; i < a3.length; i++) {
		//	System.out.print(" " +a3[i]);
		}
		int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
		int N[] = {5, 7, 9, 25};
		moveElem(mPlusN);
		for (int i = 0; i < mPlusN.length; i++) {
			//System.out.print(" " +mPlusN[i]);
		}
		mergeSmalltoBigArray(mPlusN,N);
		for (int i = 0; i < mPlusN.length; i++) {
			System.out.print(" " +mPlusN[i]);
		}
	}

}
