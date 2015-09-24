package fr.iutvalence.info.m3105.stackmachine;

public class Stack 
{
	private int stackSize;
	private int intTableOfTheStack[];
	
	public Stack(int p_stack) 
	{		
		this.intTableOfTheStack = new int[p_stack];
		this.stackSize = p_stack;
		 
	}
	
	
	public void clear()
	{
		for (int i = 0; i < this.stackSize; i++)
		{
			this.intTableOfTheStack[i] = 0;
		}
	}

}
