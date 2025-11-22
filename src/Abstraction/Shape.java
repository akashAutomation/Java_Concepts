package Abstraction;

public abstract class Shape {

	/* Abstract means partially completed or implemented.
	 */	
	
	int color;
	static int a;
	final int b = 2;

    Shape(){
        System.out.println("Shape --> constructor");
    }

    abstract void drawing(); // abstract method --> no method body
	
	public void fill() {  // non abstract method
		System.out.println("Shape --> fill()");
	}
	
    public static void main(String[] args){ //we can write main() in abstract class
        System.out.println("abstract class main method");
    }
}
