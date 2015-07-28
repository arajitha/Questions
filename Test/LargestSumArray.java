package Test;

/**Write an efficient C program to find the sum of contiguous subarray 
 * within a one-dimensional array of numbers which has the largest sum.
 * 
 * @author raarcot
 *
 */
public class LargestSumArray {

	public static  int largestSumArray(int[] a){
		int i=0; 
		int cur_max = a[i]; 
		int max_so_far = a[i];
		for(i = 1; i < a.length ; i++){
			//System.out.println("Bcurmax : "+cur_max +" Bmaxsofar : " +max_so_far);

			cur_max = Math.max(a[i], cur_max+ a[i]);
			max_so_far = Math.max(max_so_far, cur_max);	
			//System.out.println("curmax : "+cur_max +" maxsofar : " +max_so_far);
		}
		return max_so_far;
	}
	
	/**Largest Product in array
	 * Input: arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}

Input: arr[] = {-1, -3, -10, 0, 60}
Output:   60  // The subarray is {60}

Input: arr[] = {-2, -3, 0, -2, -40}
Output:   80  // The subarray is {-2, -40}
	 * @param b
	 * @return
	 */
	
	public static  int largestProductArray(int[] b){
		 int frontProduct = 1;
	        int backProduct = 1;
	        int ans = 1;
	        int n = b.length;
	        for (int i = 0; i < n; ++i) {
	            frontProduct *= b[i];
	          //  System.out.println("fontproduct :" +frontProduct +" elem " +b[i]);
	          //  backProduct *= b[n - i - 1];
	          //  System.out.println("backProduct :" +backProduct +" elen " +b[n- i -1]);
	           // ans = Math.max(ans,Math.max(frontProduct,backProduct));
		       ans = Math.max(ans,frontProduct);
	           frontProduct = frontProduct == 0 ? 1 : frontProduct;
	           //backProduct = backProduct == 0 ? 1 : backProduct;
	        }
	        return ans;
	}
	
	public static void main(String[] args){
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int[] a1 = { 2,3,-3,-4,5,6};
		int[] b = {6, -3, -10, 0, 2};
		int[] b1 = {-1, -3, -10, 0, 60};
		int[] b2 = {-2, -3, 0, -2, -40};
		int[]b3 = {-3,0,2,1,4,-7,5};
		System.out.println("LargestSumArray : " +largestSumArray(a));
		System.out.println("LargestSumArray : " +largestSumArray(a1));
		System.out.println("LargestProductArray : " +largestProductArray(b));
		System.out.println("LargestProductArray : " +largestProductArray(b1));
		System.out.println("LargestProductArray : " +largestProductArray(b2));
		System.out.println("LargestProductArray : " +largestProductArray(b3));

	}
}
