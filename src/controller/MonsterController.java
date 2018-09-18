package controller;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;
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
		//JOptionPane.showMessageDialog(null,myMonster); 
		//System.out.println(myMonster);
		//Scanner inputScanner = new Scanner (System.in);
		//System.out.println("What is your monsters name?");
		//JOptionPane.showMessageDialog(null, "What is your monsters name?"); 
		//String name = inputScanner.nextLine();
		String userInput = JOptionPane.showInputDialog(null, "What is your monsters name?"); 
		userMonster.setName(userInput);
		
		//System.out.println("How many legs do you want your monster to have?");
		//JOptionPane.showMessageDialog(null, "How many legs does your monster have?");
		//Double legCount = inputScanner.nextDouble();
		userInput = JOptionPane.showInputDialog(null, "How many legs does your monster have?");
		double legCount = -99;
		if (validDouble(userInput))
		{
			legCount = Double.parseDouble(userInput);
		}
		userMonster.setlegCount(legCount); 
		
		//System.out.println("How many eyes do you want your monster to have?");
		//JOptionPane.showMessageDialog(null, "How many eye does your monster have?");
		userInput = JOptionPane.showInputDialog(null, "How many eyes does your monster have?");
		//int eyeCount = inputScanner.nextInt();
		int eyeCount = -99;
		if (validInt(userInput))
		{
			eyeCount = Integer.parseInt(userInput); 
		}
		
		userMonster.seteyeCount(eyeCount);
			
		//System.out.println("Does your monster have a nose?");
		//JOptionPane.showMessageDialog(null, "Does your monster have a nose?");
		//boolean hasNoses = inputScanner.nextBoolean();
		userInput = JOptionPane.showInputDialog(null, "Does your monster have a nose?");
		boolean answer = Boolean.parseBoolean(userInput);
		
		userMonster.sethasNose(answer);
		//JOptionPane.showMessageDialog(null, userMonster.gethasNoses());
		if (userMonster.gethasNoses() == true)
		{
			JOptionPane.showMessageDialog(null, "Good your monster can smell things");
			//else if (userMonster.gethasNoses() == false)
			//{
			//	JOptionPane.showMessageDialog(null, "Your monster may need a nose");
			//}
		}
		//System.out.println("How many arms does your monster have?");
		//JOptionPane.showMessageDialog(null, "How many arms does your monster have?");
		//int armCount = inputScanner.nextInt();
		 userInput = JOptionPane.showInputDialog(null, "How many arms for your monster?");
		int armCount = -99;
		if (validInt(userInput))
		{
			armCount = Integer.parseInt(userInput);
		}
	
		userMonster.setarmCount(armCount);
		//System.out.println("Your monster's name is " + userMonster.getName() + ". Your monster has " + userMonster.getlegCount() + " legs! Your monster has " + userMonster.geteyeCount() + " eyes! It is " + userMonster.gethasNoses() + " your monster has a nose. Your monster has " + userMonster.getarmCount() + " arms!");
		JOptionPane.showMessageDialog(null, "Your monster's name is " + userMonster.getName() + ". \nYour monster has " + userMonster.getlegCount() + " legs! \nYour monster has " + userMonster.geteyeCount() + " eyes! \nIt is " + userMonster.gethasNoses() + " your monster has a nose. \nYour monster has " + userMonster.getarmCount() + " arms!");
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
				
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
			
		}
		return isValid;
	}
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle");
		}
		return isValid;
	}
}
