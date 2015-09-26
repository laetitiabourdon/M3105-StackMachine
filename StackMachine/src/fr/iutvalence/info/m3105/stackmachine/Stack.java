package fr.iutvalence.info.m3105.stackmachine;

public class Stack 
{
	private int stackSize;
	private int intTableOfTheStack[];
	private int numberOfElementInStack;
	
	public Stack(int p_stack) 
	{		
		this.intTableOfTheStack = new int[p_stack];
		this.stackSize = p_stack;
		this.numberOfElementInStack = 0;
		 
	}
	
	
	public void clear()
	{
		for (int i = 0; i < this.stackSize; i++)
		{
			this.intTableOfTheStack[i] = 0;
		}
	}
	
	public void popValueInStack(int p_value)
	{
		if (numberOfElementInStack < stackSize)
		{
			intTableOfTheStack[numberOfElementInStack + 1] = p_value;
		}
		numberOfElementInStack += 1;
	}

	public int getValueOnTopOfStack()
	{
		numberOfElementInStack = numberOfElementInStack - 1;
		return intTableOfTheStack[numberOfElementInStack + 1];
	}
	
}
