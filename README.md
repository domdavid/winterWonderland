# Winter Wonderland
## Introduction
This project provides a basic Java Swing setup that enables drawing directly on a JFrame. It also includes a simple timer-based animation system that refreshes the frame, making it easy to create dynamic visual updates for basic animations.
## Setup
The provided repository is an Eclipse-based project. However, it is straightforward to set up, so you should be able to get started with your IDE!
* Java project files
  * Frame.java : This will act as the "world" class where you can add objects to paint on the JFrame
  * SnowFlake.java : An example class that includes a paint method which will be called in the Frame.java paint method.
* Installation
  * Eclipse: Download the repository as a zip file to import the project into Eclipse. Alternatively, you can clone the repository in Eclipse using the interface.
  * Non-Eclipse: Start your IDE with a basic Java project. Drag the Frame.java and SnowFlake.java files into the source folder as you would any Java class file. 

## Frame.javaRun
### paint method
The paint method in the Frame.java fill will handle painting any object or arrays of objects on the JFrame! You can change the frameWidth or frameHeight at the top of the file (instance vars) to change the overall size of the JFrame that you see. This file also has a main method so you can run the project using this file or the provided Runner file.  
```java
	/*
	 * Method for painting on the JFrame
	 */
	public void paint(Graphics pen) {
		super.paintComponent(pen); //repaints the entire JFrame
		
		//draw the background of the JFrame
		pen.setColor(background);
		pen.fillRect(0, 0, frameWidth, frame height);

		//example - call the paint method of a SnowFlake object
		//pass the pen object as an argument
		flake.paint(pen);
				
	}
```
### Frame instance variables
The instance variable of the Frame class can be the place where you declare the objects you will draw on the screen! An example SnowFlake object is shown in the starter file.
```java
	//main JFrame properties/attributes
	private int frameWidth = 900;
	private int frameHeight = 600;
	private Color background = Color.black;
	
	//Add your objects or array variables here!
	SnowFlake flake = new SnowFlake();

