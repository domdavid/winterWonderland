import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {

	//main JFrame properties/attributes
	private int frameWidth = 900;
	private int frameHeight = 600;
	private Color background = Color.black;
	
	//Add your objects or array variables here!
	SnowFlake flake = new SnowFlake();
	
	/*
	 * Method for painting on the JFrame
	 */
	public void paint(Graphics pen) {
		super.paintComponent(pen); //repaints the entire JFrame
		
		//draw the background of the JFrame
		pen.setColor(background);
		pen.fillRect(0, 0, frameWidth, frameHeight);

		
		//draw a snowFlake object
		flake.paint(pen);
		
		
		
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	/* constructors help init instance variables
	 * including arrays!
	 */
	public Frame() {
		
		//Initialize any required arrays/objects in the Frame constructor
		//before working with them in the paint method!
		
		//array setup
		
		
		
		
		// JFrame setup
		JFrame f = new JFrame("Winter Wonderland");
		f.setSize(new Dimension(frameWidth, frameHeight));
		f.add(this);
		f.setResizable(false);
		f.addMouseListener(this);
		f.addKeyListener(this);
		
		//Timer Animation setup
		Timer t = new Timer(16, this);
		t.start();
		
		//default jframe close button action
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
	
	
	/*
	 * Method will run when a mouse button is 
	 * pressed and released
	 */
 	public void mouseClicked(MouseEvent mouse) {
 		System.out.println("clicked mouse on JFrame");
		
 	}

 	/*
 	 * Method runs when you press down a mouse button
 	 * on the JFraame
 	 */
 	public void mousePressed(MouseEvent mouse) {
 		System.out.println("mouse button pressed on JFrame");
 		 
	}

 	/*
 	 * Method runs when you release a mouse button
 	 * 
 	 */
	public void mouseReleased(MouseEvent mouse) {
		System.out.println("mouse button released");
	}
	
	
 	/*
 	 * Method runs when mouse enter JFrame
 	 */
 	public void mouseEntered(MouseEvent mouse) {
 		System.out.println("mouse entered the JFrame");
	}
 	
 	/*
 	 * Method runs when mouse exits JFrame
 	 */
 	public void mouseExited(MouseEvent mouse) {
 		System.out.println("mouse left the JFrame");
	}
 	
 	
 	/*
 	 * This method runs when a keyboard
 	 * key is pressed on the JFrame
 	 */
 	public void keyPressed(KeyEvent key) {
 		//The information is stored in the key object
 		//check out what available helper methods there are!
 		System.out.println(key.getKeyCode());
 		System.out.println(key.getKeyChar());
 		
 		
	}

 	/*
 	 * This method runs when a keyboard
 	 * key is released on the JFrame
 	 */
	public void keyReleased(KeyEvent key) {
 		//The information is stored in the key object
 		//check out what available helper methods there are!
 		System.out.println(key.getKeyCode());
 		System.out.println(key.getKeyChar());
 		
	}

 	/*
 	 * This method runs when a keyboard
 	 * key is pressed on the JFrame
 	 */
 	public void keyTyped(KeyEvent key) {
 		//The information is stored in the key object
 		//check out what available helper methods there are!
 		System.out.println(key.getKeyCode());
 		System.out.println(key.getKeyChar());
 		
 		
	}

	/*
	 * Timer Animation - repaints window every 16ms
	 */
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}



}
