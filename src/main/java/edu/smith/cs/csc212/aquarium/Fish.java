package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Fish {
//	Every fish has a x which is an int.
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
//	every fish has a destination: (x,y)
	int destX;
	int destY;
	
	Random fishyNumberGenerator; 
	
	public Fish(Color c, int startX, int startY, boolean isLittle) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		
		this.destX = 450;
		this.destY = 450;
				
		// Make a new random generator, for this fish
		this.fishyNumberGenerator = new Random();
	}
	
	public void swim() {
		this.facingLeft = this.destX < this.x;

		// If we're at our destination, choose 
		// new one, randomly!
		if (this.x == this.destX && this.y == this.destY) {
			// Uniformly random integer between 0 and 500
			this.destX = fishyNumberGenerator.nextInt(500);
			this.destY = fishyNumberGenerator.nextInt(500);
		}
		
		// Move up/down
		if (this.y < this.destY) {
			this.y += 1;
		} else if (this.y > this.destY) {
			this.y -= 1;
		}
		// Move right/left
		if (this.x < this.destX) {
			this.x += 1;
		} else if (this.x > this.destX) {
			this.x -= 1;
		}
	}
	
	public void draw(Graphics2D g) { 
		this.swim();
//		fish face left and are small
//		smallFacingRight, facingLeft, and facingRight
		if (this.isLittle) {
			if (this.facingLeft) {
				DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
			} else { // it's facing right!
				DrawFish.smallFacingRight(g, this.color, this.x, this.y);
			}	
		} else { //it must be big!
			if (this.facingLeft) {
				DrawFish.facingLeft(g, this.color, this.x, this.y);
			} else { //it's facing right!
				DrawFish.facingRight(g, this.color, this.x, this.y);
			}
		}
	}	
}
