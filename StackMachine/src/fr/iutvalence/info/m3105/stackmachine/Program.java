package fr.iutvalence.info.m3105.stackmachine;

public class Program {

	private Instruction[] instructions;
	
	public Program(Instruction[] p_instructions) 
	{
		this.instructions = p_instructions;
	}

	public int getInstructionCount() 
	{
		int numberOfInstruction = 0;
		for (int i = 0; i < instructions.length; i++)
		{
			numberOfInstruction += 1;
		}
		return numberOfInstruction;
	}

	public Instruction getInstructionAt(int p_instructionNumber) 
	{
		
		return this.instructions[p_instructionNumber];
	}

}
