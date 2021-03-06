package model;

public class MarshmallowMonster
{
	// Declaration section
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount; 
	public MarshmallowMonster()
	{
		//Default constructor
		//Generally boring and not as helpful
	}
	public MarshmallowMonster(String name)
	{
		this.name = name; //this. talks to the current object 
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)

	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}
	
	public String getName()
	{
		return name; 
	}
	
	public double getlegCount()
	{
		return legCount;
	}
	
	public int geteyeCount()
	{
		return eyeCount;
	}
	
	public boolean gethasNoses()
	{
		return hasNoses; 
	}
	
	public int getarmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setlegCount(double legCount)
	{
		this.legCount = legCount; 
	}
	
	public void seteyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount; 
	}
	
	public void sethasNose(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setarmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	
 	public String toString()
	{
		String description = "This monster is named " + name
				+ " and it has " + legCount + "legs....."
				+ " its favorite spooky thinng to say is: BOO"
				+ " it is " + hasNoses + " he has a nose."; 
				
				
		return description;		
	}

}
