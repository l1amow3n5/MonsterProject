package controller;

import model.MarshmallowMonster;
import java.util.Scanner;
public class MonsterController

{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster; 
	
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Norp", 1.75, 4, true, 3);
		userMonster = new MarshmallowMonster(); 
	}
	public void start()
	{
		System.out.println(myMonster);
		
		System.out.println("What is your monsters name?");
		Scanner inputScanner = new Scanner (System.in);
		String name = inputScanner.nextLine();
		userMonster.setName(name);
		
		System.out.println("How many legs do you want your monster to have?");
		Double legCount = inputScanner.nextDouble();
		userMonster.setlegCount(legCount);
		
		System.out.println("How many eyes do you want your monster to have?");
		int eyeCount = inputScanner.nextInt();
		userMonster.seteyeCount(eyeCount);
			
		System.out.println("Does your monster have a nose?");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.sethasNose(hasNoses);
		
		System.out.println("How many arms does your monster have?");
		int armCount = inputScanner.nextInt();
		userMonster.setarmCount(armCount);
		System.out.println("Your monster's name is " + userMonster.getName() + ". Your monster has " + userMonster.getlegCount() + " legs! Your monster has " + userMonster.geteyeCount() + " eyes! It is " + userMonster.gethasNoses() + " your monster has a nose. Your monster has " + userMonster.getarmCount() + " arms!");
		
	}

}
