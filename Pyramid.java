// this program built a graphic pyramid with brick given the number of bricks in base

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12; //need even number, otherwise use double type

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 11;
	
	public void run() {
		for (int j=0; j<BRICKS_IN_BASE; j++) //build multiple levels
		{for (int i=0; i<BRICKS_IN_BASE-j; i++) // build single level
		 {
			GRect rect = new GRect(getWidth()/2-(BRICKS_IN_BASE*BRICK_WIDTH/2-i*BRICK_WIDTH)+BRICK_WIDTH/2*j, getHeight()-BRICK_HEIGHT*(j+1), BRICK_WIDTH, BRICK_HEIGHT);
		    add(rect);
		 }
		}
			
	}
}

