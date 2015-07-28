package Test;

public class PowerOfN {
	
	public static float power(float x, int n){
		if (n==0) {
			return 1;
		}
		float temp = power(x, n/2);
		if (n%2 ==0){
			return temp * temp;
		} else {
			if (n > 0 ){
				return x * temp * temp;
			} else {
				return (temp * temp) / x;
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println(" 2 power 3 " +power(2,3));
		System.out.println(" 3 power 3 " +power(3,3));
		System.out.println(" 2 power -3 " +power(2,-3));
		System.out.println(" 2 power -4 " +power(2,-4));


	}
}
