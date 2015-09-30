package fr.iutvalence.info.m3105.stackmachine;

public class ArrayStack implements Stack
{
	private int stackSize;
	private int intTableOfTheStack[];
	private int numberOfElementInStack;
	
	public ArrayStack(int p_stack) 
	{		
		this.intTableOfTheStack = new int[p_stack];
		this.stackSize = p_stack;
		this.numberOfElementInStack = 0;
		 
	}
	
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Stack#clear()
	 */
	@Override
	public void clear()
	{
		for (int i = 0; i < this.stackSize; i++)
		{
			this.intTableOfTheStack[i] = 0;
		}
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Stack#pushValueInStack(int)
	 */
	@Override
	public void pushValueInStack(int p_value)
	{
		if (numberOfElementInStack < stackSize)
		{
			intTableOfTheStack[numberOfElementInStack + 1] = p_value;
		}
		numberOfElementInStack += 1;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Stack#popValue()
	 */
	@Override
	public int popValue()
	{
		numberOfElementInStack = numberOfElementInStack - 1;
		return intTableOfTheStack[numberOfElementInStack + 1];
	}
	
}
