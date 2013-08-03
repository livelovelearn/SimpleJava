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
		double width = 200; // Grect width
		double height = 75; // Grect height
		GRect rect0 = new GRect(500, 100, width, height);
		GRect rect1 = new GRect(200, 300, width, height);
		GRect rect2 = new GRect(500, 300, width, height);
		GRect rect3 = new GRect(800, 300, width, height);
		add(rect0);
		add(rect1);
		add(rect2);
		add(rect3);
		
		GLine line1 = new GLine(500+width/2, 100+height, 200+width/2, 300);
		GLine line2 = new GLine(500+width/2, 100+height, 500+width/2, 300);
		GLine line3 = new GLine(500+width/2, 100+height, 800+width/2, 300);
		add(line1);
		add(line2);
		add(line3);
		
		
		GLabel labe0 = new GLabel("Program", 0,0);
		GLabel label0 = new GLabel("Program", 500+width/2-labe0.getWidth()/2,100+height/2+labe0.getAscent()/2);
		
		GLabel labe1 = new GLabel("GraphicsProgram");
		GLabel label1 = new GLabel("GraphicsProgram", 200+width/2-labe1.getWidth()/2,300+height/2+labe1.getAscent()/2);
		
		GLabel labe2 = new GLabel ("ConsoleProgram");
		GLabel label2 = new GLabel("ConsoleProgram", 500+width/2-labe2.getWidth()/2,300+height/2+labe2.getAscent()/2);
		
		GLabel labe3 = new GLabel ("DialogProgram");
		GLabel label3 = new GLabel("DialogProgram", 800+width/2-labe3.getWidth()/2,300+height/2+labe3.getAscent()/2);
		
		add(label0);
		add(label1);
		add(label2);
		add(label3);
		
	}
}

