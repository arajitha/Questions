package Test;

public class SolveForX {
		public static void main(String args[]) {

		/*
		* Test harness
		*/

		String equation = "x + 9 Ð 2 Ð 4 + x = -x + 5 Ð 1 + 3 Ð x";
		double X = solveForX(equation);

		equation = "x + 9 -1 = 0";
		X = solveForX(equation);

		equation = "x + 4 = Ð 3 Ð x";
		X = solveForX(equation);
		}

		private static double solveForX(String equation) {

		// Removing whitespace between signs and numbers makes them easier to parse
		// Before: "x + 9 Ð 2 Ð 4 + x = -x + 5 Ð 1 + 3 Ð x"
		equation = equation.replaceAll("\\-[\\s]*", "-");
		equation = equation.replaceAll("\\+[\\s]*", "+");
		// After: "x +9 -2 -4 +x = -x +5 -1 +3 -x"

		// Split the equation through the equals sign
		String[] sides = equation.split("=");
		double sum = 0;
		double coefficient = 0;

		// Parse the left side of the equation
		double signSwap = 1;
		for(String side : sides) {
		String[] values = side.split(" ");
		for(String value : values) {
		if(value.length() == 0)
		continue;
		if(value.contains("x")) {
		coefficient += getSignOfX(value) * signSwap;
		} else {
		// numbers on the left sign need their sign inverted
		sum += Double.parseDouble(value) * -signSwap;
		}
		}
		signSwap *= -1;
		}

		// X = sum of numbers / coefficient of X
		return sum / coefficient;
		}

		private static int getSignOfX(String x) {
		if(x.contains("-"))
		return -1;

		return 1;
		}

}
