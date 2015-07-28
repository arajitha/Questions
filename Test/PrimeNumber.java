package Test;

/**
 * Program to print nth prime number
 * @author raarcot
 *
 */
public class PrimeNumber {
	public static int findPrime(int n){
		int num, count, i;
		num=1;
		count=0;
		int no = 0;
		while (count <= n){
			
			num=num+1; //find the next prime number 
			for (i = 2; i <= num; i++){
				
				if (num % i == 0) {
					
					break; //prime not found
				}
			}
			if ( i == num){
				
				count = count+1; //prime found
				if (num <= n) {
					no ++;
					System.out.println("Prim nu :" +num);
				} else { break; }	

			}
		}
		System.out.println("total nu :" +no);
		System.out.println("count nu :" +count);
		return num;
	}
	
	public static int findNthPrime(int n){
		int num, count, i;
		num=1;
		count=0;
		while (count <= n){
			
			num=num+1; //find the next prime number 
			for (i = 2; i <= num; i++){
				
				if (num % i == 0) {
					
					break; //prime not found
				}
			}
			if (i == num){
				if(count == n){
					return num;
				}
				count = count+1; //prime found
				//System.out.println("Prim nu :" +num);
			}
		}
		return num;
	}
	
	public static void main(String[] args){
		findPrime(50);
		//System.out.println("Nth prime : " +findNthPrime(10));
		System.out.println(foo(5));
	}
	
	public static int foo(int x){
		try{
			return x;
		}
		finally{
			x++;
		}
	}

}
