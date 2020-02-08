package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class DrawBubbles {

	static int x;
	static int y;
	Color color;
//	static int bubbleSpot = 100;
	
	
	public static void bubbles(Graphics2D g, int x, int y) {
		
		// Draw the bubble!
		g.setColor(Color.lightGray);

		Shape bubble = new Ellipse2D.Double(x + 300, y + 300, 40, 40);
		
		g.fill(bubble);
		
		// draw body outline.
		g.setColor(Color.white);
		
		
		

	}
	
		

//	public void draw(Graphics2D g) {
//		bubbleSpot += 1;
		
	
	
	

}
