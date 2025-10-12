package JavaTraining.src.Abstraction;

public class Test extends Shape{
	
	/*
	 * when we create object of child class then first parent class constructor will be called before the child class constructor
	 * ex-> first shape class constructor will be called before the Test class constructor
	 */
    Test(){
        System.out.println("Test --> constructor");
    }

    @Override
    void drawing() {
        System.out.println("Test --> drawing()");
    }

    public void triangle() {
        System.out.println("Test --> triangle()");
    }
	
	public static void main(String[] args) {
		Test t = new Test();
		t.drawing();
		t.fill();
		t.triangle();
				
		System.out.println("************");
		
		Shape s = new Test();  // top casting
		s.drawing();
		s.fill();
		//s.triangle();  --> can not access
	}

}
