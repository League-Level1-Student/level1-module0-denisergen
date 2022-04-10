package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses 
{
		
	public void run() 
	{
		Robot walle = new Robot();
		String imageLocation = "d7.jpeg";
Robot.setWindowImage(imageLocation);
		walle.setSpeed(50);
		walle.setX(100);
		walle.setY(550);
		walle.penDown();
		DrawHouse(walle, "Big");
		DrawHouse(walle, "Complex");
		DrawHouse(walle, "Complex");
		DrawHouse(walle, "Big");
		walle.moveTo(0, 0);
	}
	
	
	void BigHouse(Robot walle) 
	{
		walle.setAngle(0);
		walle.setPenColor(106, 13, 173);
		walle.move(100);
		walle.turn(90);
		walle.move(50);
		walle.turn(90);
		walle.move(100);
		walle.turn(270);
		walle.setPenColor(50,205,50);
		walle.move(50);
	}
	
	void MediumHouse(Robot walle) 
	{
		walle.setAngle(0);
		walle.setPenColor(165, 42, 42);
		walle.move(100);
		walle.turn(45);
		walle.move(25);
		walle.turn(90);
		walle.move(25);
		walle.setAngle(180);
		walle.move(100);
		walle.setAngle(90);
		walle.setPenColor(50,205,50);
		walle.move(50);
	}
	
	void SmallHouse(Robot walle) 
	{
		walle.setAngle(0);
		walle.setPenColor(0, 0, 255);
		walle.move(50);
		walle.turn(45);
		walle.move(25);
		walle.turn(90);
		walle.move(25);
		walle.setAngle(180);
		walle.move(50);
		walle.setAngle(90);
		walle.setPenColor(50,205,50);
		walle.move(50);
	}
	
	void DrawHouse(Robot walle, String Size)
	{
		if(Size.equalsIgnoreCase("Big")) 
		{
			BigHouse(walle);
		}
		if(Size.equalsIgnoreCase("Complex")) 
		{
			BigHouse(walle);
			SmallHouse(walle);
			MediumHouse(walle);
		}
	}
	
	
}
