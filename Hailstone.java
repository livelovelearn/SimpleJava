/*
 * File: Hailstone.java
 * Name:
 * Section Leader:
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int num = readInt("Enter a number");
		int count=0;
		int num2;
		while(num!=1)
			{count++;
			if (num%2==1)
		     {
			num2=3*num+1;
			println(num+" is odd, so I make 3n + 1: "+ num2);
			num=num2;
		     }
		    else
		     {
			num2=num/2;
			println(num+" is even, so I take half: "+ num2);
			num=num2;
		     }
		    }
		println("The process took " + count +" to reach 1" );
		
	}
}

