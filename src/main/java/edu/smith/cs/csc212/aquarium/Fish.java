package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	Color color;
	int x;
	int y;
	boolean isLittle;
	boolean facingLeft;
	int destX;
	int destY;
	
	public Fish(Color c, int startX, int startY, boolean facingLeft, boolean isLittle) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.facingLeft = facingLeft;
		this.isLittle = isLittle;
		
		this.destX = 450;
		this.destY = 450;
		
	}
	
	public void swim() {
		if (this.y < this.destY) {
		this.y += 1;
		}
	}
	
	public void draw(Graphics2D g) {
		this.swim();
		if (facingLeft) {
			if (isLittle) {
				DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
			}
			else {
				DrawFish.facingLeft(g, this.color, this.x, this.y);
			}
		}
		else {
			if (isLittle) {
				DrawFish.smallFacingRight(g, this.color, this.x, this.y);
			}
			else {
				DrawFish.facingRight(g, this.color, this.x, this.y);
			}
		}
	}
}
