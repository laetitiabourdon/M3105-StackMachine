package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {

	private int[] parameters;
	private int opCode;
	
	public Instruction(int p_num, int[] p_param) 
	{
		this.parameters = p_param;
		this.opCode = p_num;
	}

	public int getOpCode()
	{
		return this.opCode;
	}
	

	public int[] getParams() 
	{
		return this.parameters; 
	}

}
