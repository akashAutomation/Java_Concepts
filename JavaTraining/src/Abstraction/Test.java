package Abstraction;

public class Test extends Shape{
	
	/*
	 * when we create object of child class then first parent class constructor will be called before the child class constructor
	 * ex-> first shape class constructor will be called before the Test class constructor
	 */
	
	public static void main(String[] args) {
		Test t = new Test();
		t.drwaing();
		t.fill();
		t.triangle();
				
		System.out.println("************");
		
		Shape s = new Test();  // dynamic polymorphism
		s.drwaing();
		s.fill();
		//s.triangle();  --> can not access
	}

	@Override
	void drwaing() {
		System.out.println("Test --> drawing()");		
	}
	
	public void triangle() {
		System.out.println("Test --> triangle()");
	}
	
	Test(){
		System.out.println("Test --> constructor");
	}

}
