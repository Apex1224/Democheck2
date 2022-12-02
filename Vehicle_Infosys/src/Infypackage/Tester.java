package Infypackage;


	public class Tester{
		public static void main(String []args)
		{
		serviceTwoWheeler();
	//	serviceFourWheeler();
		}
		public static void serviceTwoWheeler()
		{
		//try
		//{
		Maintenance maintenance1 = new Maintenance();
		TwoWheeler twoWheeler = new TwoWheeler(12.5f,false,(short)8);
		System.out.println("Service Details- TWO WHEELER \n ****************");
		System.out.println("Initial Fuel Level: "+twoWheeler.getFuelLevel());
		boolean brakeStatusTwoWheeler = twoWheeler.isAreBrakesWorking();
		System.out.println("Brake are "+ (brakeStatusTwoWheeler ? "working!" : "not working!"));
		System.out.println("Chain tension: "+twoWheeler.getChainTension());
		
		System.out.println("\n Servicing your Vehicle …….");
		maintenance1.refuelVehicle(twoWheeler, 4);
		maintenance1.serviceVehicle(twoWheeler);
		System.out.println("Maintenance charge: "+maintenance1.getMaintenanceCharge());
		
	/*	catch(Exception exception){
		System.out.println(exception.getMessage());

		}*/
		}
	}

	/*	public static void service FourWheeler()
		try
		{
		Maintenance maintenance= new Maintenance();
		FourWheeler twowheeler=new FourWheeler(12f,false,'L');
		System.out.println("Service Details- FOUR WHEELER \n ****************");
		System.out.println("Initial Fuel Level:"+fourwheeler.getFuelLevel());
		boolean brakeStatus FourWheeler = fourWheeler.isAreBrakesWorking();
		System.out.println("Brake are"+(brakeStatusFourWheeler ? "working!" : "not working!"));
		System.out.println("Engine Coolant Level :"+fourWheeler.getEngineCoolantLevel());
		System.out.println("\n Servicing your Vehicle …….");
		maintenance.refuelVehicle(fourWheeler,15);
		maintenance.serviceVehicle(fourWheeler);
		System.out.println("Maintenance charge:"+maintenance.getMaintenenceCharge());
		}
		Catch(Exception exception){
		System.out.println(exception.getMessage());
		}
		}*/
		
