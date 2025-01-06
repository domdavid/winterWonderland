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

## Frame.java
### paint method
```java
	/*
	 * Method for painting on the JFrame
	 */
	public void paint(Graphics pen) {
		super.paintComponent(pen); //repaints the entire JFrame
		
		//draw the background of the JFrame
		pen.setColor(background);
		pen.fillRect(0, 0, frameWidth, frameHeight);
		
		
	}

