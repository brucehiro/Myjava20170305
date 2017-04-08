package tw.org.iii;

import java.io.Serializable;

public class Student implements Serializable {
	private int Ch; 
	private transient int Math; 
	private int Eng;
	private String name;
	private Car1 car;
	
	public Student(String name, int Ch, int Math, int Eng)
	{
		this.name = name; this.Ch = Ch; this.Math = Math; this.Eng = Eng;
		car = new Car1();
	}
	
	String getName()
	{
		return name;
	}
	
	double sumScore()
	{
		return Ch + Math + Eng;
	}
	
	double avgScore()
	{
		return sumScore() / 3;
	}
}

class Car1 implements Serializable
{
	private String color;
	
	Car1()
	{
		color = "Yellow";
	}
	
	String getColor()
	{
		return color;
	}
}
