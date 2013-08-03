/*
 * File: FindRange.java
 * Name:
 * Section Leader:
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		final int sentinel = 0;
			    
		println("This program finds the larget and smallest numbers.");
		int num = readInt("? ");
		
		if (num == sentinel)
			println ("program cancelled");
					
		else
		{
			int smallest = num;
		    int largest = num;
		    num = readInt("? ");
		    while (num != sentinel)
		    {
		    	if (num < smallest)
		    		smallest = num;
		    	if (num > largest)
		    		largest = num;	
		    }
		    println("smallest: " + smallest);
		    println("largest: " + largest);
		}
		
		
	}
}

