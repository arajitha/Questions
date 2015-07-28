package Test;

/**
 * FindIndex method to find the index range of a given key in sorted array
 * Binary search just tells if key is present or not. It will not tell if key is found is the first one in the array
 * @author raarcot
 *
 */
public class ArrayDuplicate {
	
	// Binary Search does not return the first key element
	public static int binarySearch(int A[], int key, int imin, int imax)
	{
	  // continue searching while [imin,imax] is not empty
	  while (imax >= imin)
	    {
	      // calculate the midpoint for roughly equal partition
	      int imid = midPoint(imin, imax);
	      if(A[imid] == key)
	        // key found at index imid
	        return imid; 
	      // determine which subarray to search
	      else if (A[imid] < key)
	        // change min index to search upper subarray
	        imin = imid + 1;
	      else         
	        // change max index to search lower subarray
	        imax = imid - 1;
	    }
	  // key was not found
	  return -99;
	}
	
	
	public static int midPoint(int a, int b){
		return (a+b)/2;
	}
	
	public static void findIndex(int[] a, int k){
		int i1 = -99;
		int i2 = 0;
		for(int i=0; i < a.length; i++){
			if(a[i] ==k){
				if(i1 == -99){
					i1= i;
					i2 = i;
				} else {
					i2++;
				}
			}
		}
		System.out.println("Index is (" +i1 +" " +i2 +")");
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,3,3,5,6,7,9};
		int key = binarySearch(a,3, 0, a.length);
		System.out.println("Key found at " +key);
		findIndex(a, 3);
		
	}
	
	

}
