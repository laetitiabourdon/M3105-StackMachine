package fr.iutvalence.info.m3105.stackmachine;

public class ArrayMemory implements Memory 
{
	private int startAddress;
	private int endAddress;
	private int[] arrayAddress;
	
	
	public ArrayMemory(int p_startAddress, int p_endAddress) throws InvalidParametersException
	{
		this.startAddress = p_startAddress;
		this.endAddress = p_endAddress;
		this.arrayAddress = new int[p_endAddress - p_startAddress];
		
		if (p_startAddress < 0 || p_endAddress < 0)
		{
			throw new InvalidParametersException();
		}
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#read(int)
	 */
	@Override
	public void read(int p_address)
	{
		
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#write(int, int)
	 */
	@Override
	public void write(int currentAddress, int instructionParam) 
	{
		
		
	}



	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#getStartAddress()
	 */
	@Override
	public int getStartAddress() 
	{
		
		return this.startAddress;
	}
	

}
