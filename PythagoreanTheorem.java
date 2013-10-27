// This program calculated the length third edge given the other two edges based on Pythagorean Theorem 

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute the Pythagorean theorem.");
		double a = readDouble("Enter a:");
		double b = readDouble("Enter b:");
		double c = Math.sqrt(a*a+b*b);
		println("c = "+c);
	}
}
