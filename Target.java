/*
 * File: Target.java
 * Name:
 * Section Leader:
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		GOval oval1 = new GOval(getWidth()/2, getHeight()/2, 72, 72);
		oval1.setFilled(true);
		oval1.setColor(Color.RED);
		add (oval1);
	}
}
