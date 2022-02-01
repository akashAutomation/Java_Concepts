package Inheritance;

  // In Inheritance, child class can inherit only one parent class --> means multiple inheritance cannot achieved

public class Car extends Vehicle{

	public void start() {
		System.out.println("Car --> start");
	}
	
	public void stop() {
		System.out.println("Car --> stop");	
	}
	
	public void refuel() {
		System.out.println("Car --> refuel");
	}
}
