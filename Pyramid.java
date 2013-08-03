/*
 * File: Pyramid.java
 * Name:
 * Section Leader:
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

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

