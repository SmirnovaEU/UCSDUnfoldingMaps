package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{

	public void setup() {
		size(400, 600);
		background(200, 200, 255);		

	}
	
	public void draw() {
		fill(255, 200, 0);
		ellipse(200, 200, 375, 375);
		fill(0, 0, 0);
		ellipse(140, 140, 50, 100);
		ellipse(260, 140, 50, 100);
		noFill();

		arc(200, 250, 190, 175, -1/3*PI, 4/3*PI);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
