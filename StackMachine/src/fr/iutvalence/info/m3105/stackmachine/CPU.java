package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public class CPU
{

	public final static int HALT 	= 0x00;
	public final static int PUSH  	= 0x01;
	public final static int ADD 	= 0x02;
	public final static int SUB 	= 0x03;
	public final static int MUL 	= 0x04;
	public final static int DIV 	= 0x05;
	public final static int MOD 	= 0x06;
	public final static int NEG 	= 0x07;
	public final static int LT 		= 0x08;
	public final static int LE 		= 0x09;
	public final static int GT 		= 0x0A;
	public final static int GE 		= 0x0B;
	public final static int EQ 		= 0x0C;
	public final static int NE 		= 0x0D;
	public final static int IN 		= 0x0E;
	public final static int OUT 	= 0x0F;
	public final static int CALL 	= 0x10;
	public final static int RET		= 0x11;
	public final static int JP		= 0x12;
	public final static int JZ		= 0x13;
	public final static int DUP		= 0x14;
	public final static int POP		= 0x15;
	
	private ConsoleIO ioSystem;
	
	private Memory programMemory;
	private Stack expStack;
	private Stack callStack;
	private Instruction opCode;
	
	public CPU()
	{
		this.ioSystem = null;
		this.expStack = null;
		this.callStack = null;
		this.programMemory = null;
	}

	public void run()
	{
		try
		{
			while (true)
			{
				int opCode = this.opCode.getOpCode();
				// System.err.print("@" + this.programCounter + ": ");
				switch (opCode)
				{
					case HALT:
					{
						// System.err.println("HALT");
						this.ioSystem.displayProgramTermination();
						return;
					}
					case PUSH:
					{
						this.expStack.pushValueInStack(p_value);
						break;
					}
					case ADD:
					{
						int value = this.expStack.popValue() + this.expStack.popValue();
						this.expStack.pushValueInStack(value);
						break;
					}
					case SUB:
					{
						int value = this.expStack.popValue() - this.expStack.popValue();
						this.expStack.pushValueInStack(value);
						break;
					}
					case MUL:
					{
						int value = this.expStack.popValue() * this.expStack.popValue();
						this.expStack.pushValueInStack(value);
						break;
					}
					case DIV:
					{
						int value = this.expStack.popValue() / this.expStack.popValue();
						this.expStack.pushValueInStack(value);
						break;
					}
					case MOD:
					{
						int value = this.expStack.popValue() % this.expStack.popValue();
						this.expStack.pushValueInStack(value);
						break;
					}
					case NEG:
					{
						// TODO something is missing here...
						break;
					}
					case LT:
					{
						// TODO something is missing here...
						break;
					}
					case LE:
					{
						// TODO something is missing here...
						break;
					}
					case GT:
					{
						// TODO something is missing here...
						break;
					}
					case GE:
					{
						// TODO something is missing here...
						break;
					}
					case EQ:
					{
						// TODO something is missing here...
						break;
					}
					case NE:
					{
						// TODO something is missing here...
						break;
					}
					case IN:
					{
						this.ioSystem.read();
						
						break;
					}
					case OUT:
					{
						// TODO something is missing here...
						break;
					}
					case CALL:
					{
						// TODO something is missing here...
						break;
					}
					case RET:
					{
						// TODO something is missing here...
						break;
					}
					case JP:
					{
						// TODO something is missing here...
						break;
					}
					case JZ:
					{
						// TODO something is missing here...
						break;
					}
					case DUP:
					{
						// TODO something is missing here...
						break;
					}
					case POP:
					{
						// TODO something is missing here...
						break;
					}
					default:
					{
						// TODO something is missing here...
						return;
					}
				}
			}
		}
		catch (AddressOutOfBoundsException e)
		{
			// TODO something is missing here...
		}
		catch (IOException e)
		{
			// TODO something is missing here...
		}
		catch (StackOverflowException e)
		{
			// TODO something is missing here...
		}
		catch (StackUnderflowException e)
		{
			// TODO something is missing here...
		}		
	}

	

	// TODO something is missing here...
	
	public void wireToProgramMemory(Memory programMemory) 
	{
		this.programMemory = programMemory;
	}

	public void wireToExpStack(Stack expStack) 
	{
		this.expStack = expStack;
	}

	public void wireToCallStack(Stack callStack) 
	{
		this.callStack = callStack;
	}

	public void wireToIoSubsystem(ConsoleIO ioSystem) 
	{
		this.ioSystem = ioSystem;
	}



	public void clearStacks() 
	{
		this.expStack.clear();
		this.callStack.clear();
	}



	public void setPC(int p_address) 
	{
		
	}
}
