package Infypackage;


	public class TwoWheeler extends Vehicle
	{
	private static final int MAX_CAPACITY=10;
	private short chainTension;
	public TwoWheeler(float fuelLevel,boolean areBrakesWorking,short chainTension)
	{
	super(fuelLevel,areBrakesWorking);
	this.chainTension=chainTension;
	}
	public boolean fixChainTension()
	{
	if(chainTension!=7)
	{
		//short a =7;
		setChainTension((short) 7);
		return true;
	}
	else
	{
	return false;
	}
	}
	public void refuelVehicle(float fuelVolume)
	{
		float h =getFuelLevel()+fuelVolume;
	
	if(h > 10)
	{
	//throw new FuelOverflowException("Fuel level exceeds maximum capacity");
	}
	else
	{
	this.setFuelLevel(getFuelLevel()+fuelVolume);
	}
	}
	public short getChainTension()
	{
	return chainTension;
	}
	public void setChainTension(short chainTension)
	{
	if(chainTension>=1 && chainTension<=9)
	{
	setChainTension(chainTension);
	}
	else
	{
		short a =7;
	setChainTension(a);
	}
	}
	}


