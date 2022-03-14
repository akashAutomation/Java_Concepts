package Inheritance;

  // In Inheritance, child class can inherit only one parent class --> means multiple inheritance cannot achieved

// 1. Single inheritance
// 2. Multilevel
// 3. Multiple - not supported by java because if 2 or more parent have same method then there is ambiguity problem will occur. this problem is also
//				 ambiguity problem or diamond access problem
// 4. Hierarchical
// 5. Hybrid - not supported by java 

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
