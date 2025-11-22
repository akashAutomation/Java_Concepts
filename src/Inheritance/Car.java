package Inheritance;

public class Car extends Vehicle{ //is-a relationship

	public void start() {
		System.out.println("Car --> start");
	}
	
	public void stop() {
		System.out.println("Car --> stop");	
	}
	
	public void refuel() {
		System.out.println("Car --> refuel");
	}

    public static void color() {
        System.out.println("Car --> color() static method");
    }
}
