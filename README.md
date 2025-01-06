# Winter Wonderland
![Screenshot](screeshot1.png)
## Introduction
This project provides a basic Java Swing setup that enables drawing directly on a JFrame. It also includes a simple timer-based animation system that refreshes the frame, making it easy to create dynamic visual updates for basic animations.
* This project will have you apply your knowledge of the following: 
  * Creating and using Objects (AP CSA - Unit 2) (Need practice? Review [here](https://studycs.org/practice/view/2/))
  * Writing Classes (AP CSA - Unit 5)	(Need practice? Review [here](https://studycs.org/practice/view/5/))
  * Declaring and Creating 1D Arrays of primitives and objects in Java (AP CSA - Unit 6) (Need practice? Review [here](https://studycs.org/practice/view/6/))
  * Traversing Arrays (AP CSA - Unit 4, Unit 6) (Need practice? Review Unit 4 [here](https://studycs.org/practice/view/4/) and Unit 6 [here](https://studycs.org/practice/view/6/))
## Setup
The provided repository is an Eclipse-based project. However, it is straightforward to set up, so you should be able to get started with your IDE!
* Java project files
  * Frame.java : This will act as the "world" class where you can add objects to paint on the JFrame
  * SnowFlake.java : An example class that includes a paint method which will be called in the Frame.java paint method.
* Installation
  * Eclipse: Download the repository as a zip file to import the project into Eclipse. Alternatively, you can clone the repository in Eclipse using the interface.
  * Non-Eclipse: Start your IDE with a basic Java project. Drag the Frame.java and SnowFlake.java files into the source folder as you would any Java class file.
  	* Run the project with Runner.java or Frame.java. You should see a JFrame with one oval drawn on the screen. 
## Frame.java - Runner File
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
public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {

	//main JFrame properties/attributes
	private static int frameWidth = 900;
	private static int frameHeight = 600;
	private Color background = Color.black;
	
	//Add your objects or array variables here!
	SnowFlake flake = new SnowFlake();
.
.
.
```
## SnowFlake.java
This is an example java class that contains a paint method that can be called/invoked in the Frame class' paint method. This allows any additional types of objects you create to handle their own way to paint on the screen!
```java
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
```
The class setup can be organized further by breaking up any required variable updates from the painting. The method stub has been provided, but it is not necessary to use. 

# Get Started!
## Running the Project
Once you have imported the files into your IDE, you can run either the Runner or the Frame class. Both of these files have a main method to create an instance of the GUI.
## SnowFlake.java Updates
### SnowFlake.java - Instance Variables
The provided code below is code snippets. Be sure to place only the needed new lines of code.
* Add instance variables to track the position of a SnowFlake object
```java
public class SnowFlake
{
	//Instance variables - what properties does a Snowflake have?
	private int x;
	private int y;
.
.
.
```
* Add an instance variable for the size of the object (you can have both width and height variables if you want)
```java
	//Instance variables - what properties does a Snowflake have?
	private int size; //can be used for width and height of each "oval" 
```
### SnowFlake.java - Constructor
Add a default constructor in SnowFlake.java that should initialize the instance variables you just added! Randomize these properties so that each SnowFlake is somewhat unique and placed on a different section on the screen. Use the random formula you were taught in class to generate a reasonable random number for each attribute. It's provided below if you have forgotten. 
* int randomValue = (int)(Math.random()*(max-min+1))+min; //random int between min and max (inclusive)
```java
	/* The constructor initializes the properties of the object */
	public SnowFlake() {
		
		x 	= ???;
		y 	= ???;
		size 	= ???;
		
		
	}


```
### SnowFlake.java - paint method
When you re-run the program, nothing should have changed so far! Why? The paint method for SnowFlake is using HARDCODED values for drawing the SnowFLake :). Update the paint method so that it is now using the instance variables you defined! Note that the example below might differ from yours since we could have named our variables differently. 
```java
	/*
	 * Draw your SnowFlake using simple Graphics method
	 */
	public void paint(Graphics pen) {
		//set pen color - remember the default frame background is black
		pen.setColor(Color.white); //the Color class has some premade colors
		
		//example code - replace with your code
		pen.fillOval(x, y, size, size);
		
		
		
	}
```
Once you have updated the paint method for SnowFlake, re-running the program should result in a SnowFlake object that is drawn at a random location on the JFrame with a different size each time. 

## Frame.java - updates
### Array of SnowFlakes
Once you can draw one SnowFlake that is placed randomly on the screen, you are ready to create a bunch of them on the screen! Let's do this by creating an array of SnowFlake objects in Frame.java. Go towards the top of the JFrame class (where instance variables are typically located) and add the array.

```java
	//main JFrame properties/attributes
	public static int frameWidth = 900;
	public static int frameHeight = 600;
	private Color background = Color.black;
	
	//Add your objects or array variables here!
	SnowFlake flake = new SnowFlake();
	
	//Array of SnowFlake objects -- NEW CODE
	private int numSnow = 100; //added so we can change the amount of snow easily
	SnowFlake[] snow = new SnowFlake[numSnow];
```
You can also introduce another instance variable for the size of the array which can make resizing and playing around with the amount of snow much easier. 

### Frame.java - constructor
Recall that when you declare and create an array of objects it will have null references! You will have to create the objects and place them in the array. This is done in the constructor of the Frame class so that the array is set before the JFrame is drawn. 

#### for loop
Setup your for loop to iterate through the array of SnowFlake objects. Create a new SnowFlake each iteration and place them in the corresponding index.
```java
	//Frame Constructor
	public Frame(){
		//array of SnowFlake objects setup
		for(int i = 0; i < snow.length; i++) {
			snow[i] = new SnowFlake();
		}

		// Additional code not shown
	}
```
### Frame.java - paint method
While you have created the array of SnowFlake objects, nothing in Frame is using the objects to invoke the paint method of each object! We can do this in the Frame's paint method similar to how it's currently invoking the paint method of a singular SnowFlake object!
```java
	public void paint(Graphics pen){
		//snow array traversal - you can use a traditional for-loop
		//or an enhanced for loop here. 
		for(int i = 0; i < snow.length; i++) {
			snow[i].paint(pen);
		}

		//additional code not shown
	}
```
#### Using enhanced for loop
```java
	public void paint(Graphics pen){
		//snow array traversal - you can use a traditional for-loop
		//or an enhanced for loop here. 
		for(SnowFlake obj : snow) { //for each SnowFlake object in the snow array
			obj.paint(pen);
		}

		//Additional code not shown
	}
```
# Additional Objects - writing more Java classes
Now that you have set up SnowFlake objects, expand on your knowledge of setting up objects on the Frame by adding additional classes that will make up the scenery. Below are some ideas.
* Tree.java : Can you create a class that allows you to draw trees?
* SnowMan.java : How about a lovely snowman?
### Reminders
####
Each class will need a paint method similar to SnowFlake. The instance variables can be different.
####
You might need additional [drawing methods](https://www.javatpoint.com/Graphics-in-swing) for more complex shapes. The one used in SnowFlake is simply drawing an oval :). You may need to play around with fillPolygon. Check out this [example](https://www.educative.io/answers/what-is-fillpolygon-in-java) or the one shown below.
### Example - Additional class
```java
public class Tree
{

	//a simple Tree drawn with a triangle :)
	private int[] x;
	private int[] y;
	
	
	public Tree() {
		//Example hard-coded position of a Tree object
		//a Triangle on the upper-left corner!
		x = new int[]{
				0, 50, 100
			};
		
		y = new int[]{
				100, 0, 100
			}; 
		
	}	
	
	public void paint(Graphics pen) {
		
		pen.setColor(Color.green);
		pen.fillPolygon(x, y, x.length);
		
		
	}
	
}
```
In the example above, we now have another class called Tree.java. The Tree class uses fillPolygon which requires two 1D arrays that correspond to the vertexes of the polygon representing the Tree object. In this case, it's a simple triangle that is drawn. Note that the order in which to list the vertexes should be in a clockwise or counterclockwise order. I suggest running your code often as you add points for simple debugging and guess-and-check in this process. 

Can you use AI for this one? See if you can prompt an LLM such as ChatGPT, CoPilot, or Gemini if these are allowed tools for your school. For example, prompt the LLMs for coordinate points. Be sure to provide the code to the LLMs so that they use the existing code instead of re-writing everything that may not easily integrate into the setup. 

<details open>

<summary> # Animation </summary>
# Animation - Snow
## SnowFlake - Additional Instance Variables
Each SnowFlake is currently drawn at a random location on the JFrame with a different size. What if we want to animate the snow so it falls? Let's add additional instance variables to update the position! At the top of the class, add speedY with a positive value. This will determine how fast the object updates is Y position. In the Paint method, you will then update the y position based on this value. By introducing a variable for the speed, you have room to update this and alter the speed later on as you play with your code. Note, there is an update method that was provided to help you organize updating the variables. You can use it if you wish. The snippet below is incomplete so be sure to add it to the right section of your class. 

```java
public class SnowFlake{
        // additional instance variables not shown!
	private int speedY = 2;

	public void update(){
		//update position variable
		y += speedY;
	}

	public void paint(Graphics pen){
		update(); //call update method before drawing

		//additional code not shown
	}

}
```
After altering your code, you should see some animation on the screen. 
* What should you do with the y position once the object reaches the bottom of the screen?
* What would you have to do if you want to add "wind" or some swaying in the x direction?

Why does this animate the snow?
There is a Timer object in the project setup that repaints the screen every ~16milliseconds. If you update any of the properties of the SnowFlake objects or any object, you will see it reflected on the JFrame if they affect the drawing. In our case, if you update the position then the SnowFlake objects are redrawn at the updated position which show up as animation.
</details>
