package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {

	private int[] parameters;
	
	public Instruction(int p_num, int[] p_param) 
	{
		this.parameters = p_param;
		
	}

	public int getOpCode()
	{
		return 0;
	}
	

	public int[] getParams() 
	{
		return this.parameters;
	}

}
