package fr.iutvalence.info.m3105.stackmachine;

public interface Memory
{

	public abstract void read(int p_address);

	public abstract void write(int currentAddress, int instructionParam);

	public abstract int getStartAddress();

}