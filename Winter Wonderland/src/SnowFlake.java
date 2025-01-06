import java.awt.Color;
import java.awt.Graphics;

public class SnowFlake
{
	//Instance variables - what properties does a Snowflake have?
	
	
	/*
	 * Draw your SnowFlake using simple Graphics method
	 */
	public void paint(Graphics pen) {
		//set pen color - remember the default frame background is black
		pen.setColor(Color.white); //the Color class has some premade colors
		
		//example code - replace with your code
		pen.fillOval(0, 0, 50, 50);
		
		
		
	}
	
	/*
	 * Optional: You can break up the action of updating variables from
	 * the drawing (paint method).
	 */
	public void update() {
		
		
	}
	
	
}
