package Inheritance;

public class BMW extends Car{

	public void start() {  // Overridden method
		System.out.println("BMW --> start");
	}
	
	public void theftSafety() {
		System.out.println("BMW --> theftSafety");
	}

    public static void color() {
        System.out.println("BMW --> color () static method");
    }

}
