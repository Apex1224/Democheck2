package Infypackage;

public class FourWheeler extends Vehicle{ 
	private static final int MAX_CAPACITY = 50;
	private char engineCoolantLevel;
	
	public FourWheeler (float fuelLevel,boolean areBrakesWorking,char engineCoolantLevel)
	{
		super(fuelLevel,areBrakesWorking);
		this.engineCoolantLevel = engineCoolantLevel;
	}
	public boolean fixEngineCoolantlevel()
	{
		if(engineCoolantLevel != 'H')
		{
			setEngineCoolantLevel('H');
			return true;
		}
		else
		{
		return false;
		}
	}
	public void refuelVehicle (float fuelVolume)
    {
		int count =0;
		float h = getFuelLevel()+fuelVolume;
		if(h > 50)
		{
			count++;
			//throw new FuelOverflowException("Fuel level exceeds maximum capacity");
		}
		else
		{
			this.setFuelLevel(getFuelLevel()+fuelVolume);
		}
	}
	public char getEngineCoolantlevel()
	{
		return engineCoolantLevel;
	}
	public void setEngineCoolantLevel(char engineCoolantLevel)
	{
		if(engineCoolantLevel =='H' || engineCoolantLevel =='M'  || engineCoolantLevel =='L')
		{
			this.engineCoolantLevel = engineCoolantLevel;
		}
		else
		{
			setEngineCoolantLevel('H');
		}
	}
}
