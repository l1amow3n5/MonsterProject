package controller;

import model.MarshmallowMonster; 
public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Norp", 1.75, 4, true, 3);  
	}
	public void start()
	{
		System.out.println(myMonster);
	}

}
