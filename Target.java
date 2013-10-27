// This program draws an image of archery target.

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		GOval oval1 = new GOval(getWidth()/2-36, getHeight()/2-36, 72, 72);
		oval1.setFilled(true);
		oval1.setColor(Color.RED);
		add (oval1);
		//draw the biggest circle at the bottom
		
		GOval oval2 = new GOval(getWidth()/2-23, getHeight()/2-23, 46, 46);
		oval2.setFilled(true);
		oval2.setColor(Color.white);
		add (oval2);
		//draw the second circle on top of the first
		
		GOval oval3 = new GOval(getWidth()/2-11, getHeight()/2-11, 22, 22);
		oval3.setFilled(true);
		oval3.setColor(Color.RED);
		add (oval3);
		//draw the third circle on top of the second
	}
}
