package Polymorphism;

import Inheritance.BMW;
import Inheritance.Car;

public class MethodOverriding {

	public static void main(String[] args) {
		/* 1. Overriding means some method is present in parent class as well as child class with the same name and same number 
		 *    of arguments.
		 *    
		 * 2. Whatever methods parent has, by default available for child class through inheritance.
		 *    If the child class not satisfied with parent method implementation then child is allowed to redefine method based on its
		 *    requirements, this process is called overriding and that parent class method is called overridden method and child class method 
		 *    which is overriding is called overriding method. 
		 *    
		 * 3. In Overriding, method resolution always takes care by JVM based on run time object not based on reference type variables.
		 *    thats why overriding also known as Run Time or dynamic or late binding polymorphism.
		 *    
		 * 4. Until 1.4v, return type must be same in overriding. But from 1.5v onwards co-varient return type(i.e. child method return type 
		 *    need not be same as parent method return type) are allowed.
		 *    	public Object m1(int i){} --> parent class method
		 *   	public String m1(int i){} --> child class method   --> this is allowed in overriding
		 *   
		 *    co-varient return type concept is applicable only for non primitive data types not applicable for primitives.
		 * 
		 * 5. Overriding concept is not applicable for private methods because private methods only be accessible with in the class.
		 * 
		 * 6. If the parent class method is declared as final then overriding concept is not possible for final method
		 * 		(Will give "overridden method is final" exception whether child class method is final or non-final)
		 * 	  If parent class method is non final and child class method is final then it is acceptable.   
		 *    
		 * 7. If the parent class method is abstract and child class is non abstarct then overriding concept is possible.
		 * 	  If parent class method is non abstract and child class method is abstract then it is also acceptable.   
		 * 
		 * 8. While overriding, We can not reduce the scope of access modifiers but we can increase the scope.
		 * 			private < default < protected < public
		 * 
		 * 9. Parent class static method and child class non static method --> not allowed
		 *    Parent class non static method and child class static method --> not allowed
		 *    
		 *    Parent class static method and child class static method     --> allowed --> it is not overriding concept, it is called method hiding
		 *    
		 * 10. In method overriding, method resolution done by JVM based on run time object.
		 * 	   In method hiding, method resolution done by compiled based on reference type. thats why it is also called static polymorphism or early binding
		 *    
		 * 3. Parent class cannot not inherit child class properties but child can inherit parent class properties.
		 *    ex-> car.theftSafety() --> BMW can inherit Car class properties but Car class cannot inherit BMW class. 
		 *    
		 * 
		 * 5. Only overridden methods and parent class methods will be called using dynamic polymorphism.
		 *    ex-> we can not access theftSafty() but we can accees overridden method(ex.- start()) of BMW class 
		 *    
		 * 6. Top casting --> Child class object can be referred by parent class reference var.  
		 * 7. Down casting --> Parent class object can be referred by child class reference var.
		 * 8. Down casting can be done in java by cast parent class in child class and referred by child class reference var.
		 *    But it will give "ClassCastException" at run time.
		 *    ex-> BMW b1 = (BMW) new Car();
		 */
		 BMW bmw = new BMW();
		 bmw.start(); 
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
		 
		 Car c1 = new BMW();  
		 c1.start();   
		 c1.stop();
		 c1.refuel();
   //	 car.theftSfety()  --> can not access
		 
		// Down casting 		 
		BMW b1 = (BMW) new Car(); // "ClassCastException: class Inheritance.Car cannot be cast to class Inheritance.BMW"
		
	}

}
