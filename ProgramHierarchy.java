/*
 * File: ProgramHierarchy.java
 * Name:
 * Section Leader:
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {
		double width = 100; // Grect width
		double height = 75; // Grect height
		GRect rect0 = new GRect(500, 100, width, height);
		GRect rect1 = new GRect(200, 300, width, height);
		GRect rect2 = new GRect(500, 300, width, height);
		GRect rect3 = new GRect(800, 300, width, height);
		add(rect0);
		
		//GLine line1 = new GLine();
		
		
		//GLabel label0 = new GLabel("Program", 200-label1.getwidth()/2, 200+label0.getAscent()/2);
		GLabel label1 = new GLabel("GraphicsProgram");
		GLabel label2 = new GLabel ("ConsoleProgram");
		GLabel label3 = new GLabel ("DialogProgram");
	}
}

