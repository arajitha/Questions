package Test;
/**
 *
I	1
V	5
X	10
L	50
C	100
D	500
M	1,000

the numeral I can be placed before V and X to make 4 units (IV) and 9 units (IX) respectively
X can be placed before L and C to make 40 (XL) and 90 (XC) respectively
C can be placed before D and M to make 400 (CD) and 900 (CM) according to the same pattern[5]

 * @author raarcot
 *
 */


public class RomanNumberDecimal {
	
	public static int convertRoman(String s){
		int finalNum = 0;
		int lastNumber = 0;
		int currentNumber = 0;
		for (int i = s.length()-1; i >= 0; i--){
			char c = s.charAt(i);
			switch(c){
				case 'I':
					 currentNumber = 1;
					 finalNum = process(finalNum, currentNumber, lastNumber);
					 lastNumber = 1;
					 break;
				case 'V':
					 currentNumber = 5;
					 finalNum = process(finalNum, currentNumber, lastNumber);
					 lastNumber = 5;
					 break;
				case 'X':
					 currentNumber = 10;
					 finalNum = process(finalNum, currentNumber, lastNumber);
					 lastNumber = 10;
					 break;
				case 'L':
					 currentNumber = 50;
					 finalNum = process(finalNum, currentNumber, lastNumber);
					 lastNumber = 50;
					 break;
				case 'C':
					 currentNumber = 100;
					 finalNum = process(finalNum, currentNumber, lastNumber);
					 lastNumber = 100;
					 break;
				case 'D':
					 currentNumber = 500;
					 finalNum = process(finalNum, currentNumber, lastNumber);
					 lastNumber = 500;
					 break;
				case 'M':
					 currentNumber = 1000;
					 finalNum = process(finalNum, currentNumber, lastNumber);
					 lastNumber = 1000;
					 break;
			 			
			}
			
		}
		
		return finalNum;
		
	}
	
	public static int process(int number, int currentNumber, int lastNumber){
		if(currentNumber > lastNumber){
			return  number + currentNumber;
		} else {
			return number - currentNumber;
		}
	}
	
	public static void main(String[] args){
		System.out.println("Converted IV : " +convertRoman("IV"));
		System.out.println("Converted IX : " +convertRoman("IX"));
		System.out.println("Converted XV : " +convertRoman("XV"));
		System.out.println("Converted XCIX : " +convertRoman("XCIX"));

	}

}
