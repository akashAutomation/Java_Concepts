package JavaTraining.src.Inheritance;

import JavaTraining.src.Inheritance.BMW;

public class TestCar {

	public static void main(String[] args) {
		/* 1. Polymorphism --> Overriding or one to many means some method is present in parent class as well as 
		 * 					child class with the same name and same number of arguments.
		 * 
		 * 2. Static Polymorphism or Compile Time Polymorphism --> At the time of compilation, java will decide 
		 * 														which method I need to call.
		 * 														ex-> start();
		 * 
		 * 3. Parent class cannot not inherit child class properties but child can inherit parent class properties.
		 *    ex-> car.theftSafety() --> BMW can inherit Car class properties but Car class cannot inherit BMW class. 
		 *    
		 * 4. Dynamic Polymorphism or Run time Polymorphism --> Child class object can be referred by parent class reference var.
		 * 														also called Top casting
		 * 
		 * 5. Only overridden methods and parent class methods will be called using dynamic polymorphism.
		 *    ex-> we can not access theftSafety() but we can access overridden method(ex.- start()) of BMW class
		 *
		 */
		 BMW bmw = new BMW(); //has-a relationship
		 bmw.start(); //Static Polymorphism or Compile Time Polymorphism
		 bmw.stop();
		 bmw.refuel();
		 bmw.theftSafety();
		 bmw.engine();
		 
		 System.out.println("***************");
		 
		 Car car =  new Car();
		 car.start();
		 car.stop();
		 car.refuel();
	//	 car.theftSfety()  --> can not access
		 
		 System.out.println("***************");
		 
		 Car c1 = new BMW();  //Dynamic Polymorphism or Run time Polymorphism also called top casting 
		 c1.start();  // start() in BMW class can access by dynamic poly 
		 c1.stop();
		 c1.refuel();
   //	 car.theftSfety()  --> can not access
		 
		// Down casting 		 
		BMW b1 = (BMW) new Car(); // "ClassCastException: class Inheritance.Car cannot be cast to class Inheritance.BMW"
	}

}
