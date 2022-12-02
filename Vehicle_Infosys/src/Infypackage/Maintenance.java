package Infypackage;

public class Maintenance {

	private double maintenanceCharge;
	public void refuelVehicle(Vehicle vehicle,float fuelVolumeToBeFilled)
	{
	float a=vehicle.getFuelLevel();
	vehicle.refuelVehicle(fuelVolumeToBeFilled);
	
	if(a!=vehicle.getFuelLevel())
	{
	maintenanceCharge=maintenanceCharge+(fuelVolumeToBeFilled*70);
	}
	}
	public void serviceVehicle(Vehicle vehicle)
	{
	if(vehicle.fixBrakes())
	{
		setMaintenanceCharge(maintenanceCharge+20.5);
	}
	else
	{
		setMaintenanceCharge(this.maintenanceCharge);
	}
	
	if(vehicle instanceof FourWheeler)
	{
		//FourWheeler four = (FourWheeler)vehicle;
		if(four.fixEngineCoolantlevel())
		{

			setMaintenanceCharge(maintenanceCharge+50.20);
		}
		else
		{

			setMaintenanceCharge(this.maintenanceCharge);
		}
	}
	if(vehicle instanceof TwoWheeler)
	{
		//TwoWheeler fou = (TwoWheeler)vehicle;
		if(fou.fixChainTension())
		{

			setMaintenanceCharge(maintenanceCharge+30.75);
		}
		else
		{

			setMaintenanceCharge(this.maintenanceCharge);
		}
	}
	}
	public double getMaintenanceCharge()
	{
	return maintenanceCharge;
	}
	public void setMaintenanceCharge(double maintenanceCharge)
	{
	this.maintenanceCharge=maintenanceCharge;
	}
	}


