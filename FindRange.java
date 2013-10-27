//This program finds the largest and the smallest numbers in a list of inputs

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		final int sentinel = 0;
			    
		println("This program finds the largest and smallest numbers.");
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
		    	 num = readInt("? ");
		    }
		    println("smallest: " + smallest);
		    println("largest: " + largest);
		}
		
		
	}
}

