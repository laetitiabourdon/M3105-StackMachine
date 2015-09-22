package fr.iutvalence.info.m3105.stackmachine;

public class Memory 
{
	private int startAddress;
	private int endAddress;
	
	
	public Memory(int p_startAddress, int p_endAddress) throws InvalidParametersException
	{
		this.startAddress = p_startAddress;
		this.endAddress = p_endAddress;
		
		if (p_startAddress < 0 || p_endAddress < 0)
		{
			throw new InvalidParametersException();
		}
	}
	
	
	
	public void write(int currentAddress, int instructionParam) 
	{
		
		
	}



	public int getStartAddress() 
	{
		
		return this.startAddress;
	}
	

}
