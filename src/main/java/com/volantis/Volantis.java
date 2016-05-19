package com.volantis;

public class Volantis 
{
	public static void main(String[] args)
	{
		System.out.println("Panda panda panda panda");
		Dragon Drogon = new Dragon("Drogon");
		Dragon Rhaegal = new Dragon("Rhaegal");
		Dragon Viserion = new Dragon("Viserion");
	}
}
public class Dragon extends Volantis
{
	String color;
	String size;
	String name;
	bool asleep;
	int health = 100;
	public Dragon(String n)
	{
		name = n;
	}
	void breatheFire()
	{
		//int damage = rand.nextInt((max - min) + 1) + min;
	}
	void fly()
	{
		System.out.println(name + " flaps his enormous wings and takes flight!");
	}
	bool sleeping()
	{
		if(asleep == true)
		{
			System.out.println(name + " is sleeping...you are never supposed to wake a sleeping dragon..it is known, IT IS KNOWN");
			return true;
		}
		else
		{
			return false;
		}
	}

}
