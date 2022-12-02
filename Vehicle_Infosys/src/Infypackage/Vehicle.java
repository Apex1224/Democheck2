package Infypackage;

public  abstract class Vehicle {
	
	private float fuelLevel;
	private boolean areBrakesWorking;
	
	public Vehicle(float fuelLevel, boolean areBrakesWorking) {
		
		this.fuelLevel = fuelLevel;
		this.areBrakesWorking = areBrakesWorking;
	}
	public boolean fixbrakes()
	{
		if(isAreBrakesWorking())
		{
			return false;
		}
		else
		{   
			setAreBrakesWorking(true);
			return true;
		}
		
	}
	public abstract void refuelVehicle (float fuelVolume);
	
	public float getFuelLevel()
	{
		return fuelLevel; 
	}
	public void setFuelLevel(float fuelLevel)
	{
	   this.fuelLevel = fuelLevel;
	   if (this instanceof FourWheeler) {
		   if(fuelLevel > 50 && fuelLevel < 0)
		   {
			   this.setFuelLevel(50);
		   }
		   else
		   {
			   this.setFuelLevel(fuelLevel);
		   }
	   }
	   if(this instanceof TwoWheeler) {
		   if(fuelLevel > 10 && fuelLevel < 0)
		   {
			   this.setFuelLevel(10);
		   }
		   else
		   {
			   this.setFuelLevel(fuelLevel);
		   }
	   }
	}
	public boolean isAreBrakesWorking() {
		return areBrakesWorking;
	}
	public void setAreBrakesWorking(boolean areBrakesWorking) {
		this.areBrakesWorking = areBrakesWorking;
	}
	

}
