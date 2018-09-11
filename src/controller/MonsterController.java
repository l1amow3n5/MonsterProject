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
		myMonster = new MarshmallowMonster("Norp");
	}
	public void start()
	{
		System.out.println(myMonster);
	}

}
