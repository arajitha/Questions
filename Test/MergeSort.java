package Test;

public class MergeSort {
	private int[] a;
	
	public MergeSort(int[] a){
		this.a = a;
		mergeSort(0, a.length - 1 );
	}
	
	public  void mergeSort(int low, int high){
		if (low < high){
			int mid = low +  (high - low )/ 2;
			mergeSort(low, mid);
			mergeSort(mid + 1 , high);
			merge(low, mid, high);
		}
	}
		
	public  void merge(int low, int mid, int high){

		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//merging array [low,m] and [ m+1, high]
		// copy data to temp arrays
		for (int i = 0; i < n1; i ++){
			L[i] = a[low +i];
		}
		for (int j = 0; j < n2; j++){
			R[j] = a[mid +1 +j];
		}
		
		// merge to one
		int i =0; 
		int j = 0;
		int k = low;
		while (i < n1 && j < n2){
			if(L[i] < R[j]){
				a[k] = L[i];
				i++;
				k++;
			}else {
				a[k] = R[j];
				j++;
				k++;
			}
		} // merge all remaining elements
		while (i < n1){
			a[k] = L[i];
			i++;
			k++;
		}
		while (j < n2){
			a[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args){
	    int arr[] = {12, 11, 13, 5, 6, 7};
	    MergeSort srt = new MergeSort(arr);
	    for(int i =0 ; i < srt.a.length; i ++){
	    	System.out.println(srt.a[i]);
	    }
	    
	}

}
