package JavaTraining.src.Polymorphism;

import JavaTraining.src.Inheritance.BMW;
import JavaTraining.src.Inheritance.Car;

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
		 *    that's why overriding also known as Run Time or dynamic or late binding polymorphism.
		 *    
		 * 4. Until java 1.4v, return type must be same in overriding. But from 1.5v onwards co-variant return type(i.e. child method return type
		 *    need not be same as parent method return type) are allowed.
		 *    	public Object m1(int i){} --> parent class method
		 *   	public String m1(int i){} --> child class method   --> this is allowed in overriding
		 *   
		 *    co-variant return type concept is applicable only for non-primitive data types not applicable for primitives.
		 * 
		 * 5. Overriding concept is not applicable for private methods because private methods only be accessible with in the class.
		 * 
		 * 6. If the parent class method is declared as final(keyword) then overriding concept is not possible for final method
		 * 		(Will give "overridden method is final" error whether child class method is final or non-final)
		 * 	  If parent class method is non-final and child class method is final then it is acceptable.
		 *    
		 * 7. If the parent class method is abstract and child class is non-abstract then overriding concept is possible.
		 * 	  If parent class method is non-abstract and child class method is abstract then it is also acceptable.
		 * 
		 * 8. While overriding, We can not reduce the scope of access modifiers, but we can increase the scope.
		 * 			private < default < protected < public
		 * 
		 * 9. Parent class static method and child class non-static method --> not allowed
		 *    Parent class non-static method and child class static method --> not allowed
		 *    
		 *    Parent class static method and child class static method     --> allowed --> it is not overriding concept, it is called method hiding.
		 *    
		 * 10. In method overriding, method resolution done by JVM based on run time object.
		 * 	   In method hiding, method resolution done by compiled based on reference type. that's why it is also called static polymorphism or early binding
		 *    
		 * 3. Parent class cannot not inherit child class properties but child can inherit parent class properties.
		 *    ex-> car.theftSafety() --> BMW can inherit Car class properties but Car class cannot inherit BMW class. 
		 *    
		 * 
		 * 5. Only overridden methods and parent class methods will be called using dynamic polymorphism.
		 *    ex-> we can not access theftSafety() but we can access overridden method(ex.- start()) of BMW class
		 *    
		 * 6. Top casting --> Child class object can be referred by parent class reference var.  
		 * 7. Down casting --> Parent class object can be referred by child class reference var.
		 * 8. Down casting can be done in java by cast parent class in child class and referred by child class reference var.
		 *    But it will give "ClassCastException" at run time.
		 *    ex-> BMW b1 = (BMW) new Car();
		 * 9. top casting and down casting are related to inheritance and type conversion,
		 *    but they are not types of overriding.
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
//		 car.theftSafety();  // can not access
		 
		 System.out.println("****** Top Casting example *********");
		 
		 /* Top casting -> method we can use:
		 1. public, protected, and default-access methods defined in the superclass(Car).
         2. Any overridden methods — and they will execute the subclass version(BMW) due to runtime polymorphism.
        */
         Car c1 = new BMW();
		 c1.start();  //start() will execute from BMW because it is overridden method
		 c1.stop();
		 c1.refuel();
 //   	 c1.theftSafety();  // can not access because it is present in BMW class

        System.out.println("****** Down Casting example *********");

		// Down casting
		//BMW b = (BMW) new Car(); // "ClassCastException: class Car cannot be cast to class BMW"

        //the safe way to achieve down casting
        Car c2 = new BMW();
        BMW b2 = (BMW) c2;
        /*
        here, new BMW() creates a BMW object → object type is Dog.
        c2 is declared as type Car → reference type is Car.
        So even though the object is a Dog, the reference c2 is of type Car. the compiler only sees c2 as a Car
        That’s why casting it back to BMW is called down casting — you're moving from a general type (Car) to a specific type (Dog).
        Simply you're telling the compiler: “Trust me, I know this is really a Car.”

        Methods we can use --> you can access both superclass and subclass methods. Without down casting also you can achieve
                               the same with simply creating as object of subclass.
                               But Down casting becomes useful in polymorphic scenarios, especially when:
                               Often in real-world applications, objects are passed around using superclass or interface references — for flexibility and abstraction.
        */

        b2.theftSafety();
        b2.stop();
        b2.refuel();
        b2.start();
        b2.engine();

        System.out.println("****** Method hiding example *********");

        Car c3 = new BMW();
        c3.color(); // Output: Static method in SuperClass (method hiding)

        /*
        Why This Happens:
        obj2 is declared as SuperClass, so the compiler binds color() to Car.color() — even though the actual object is BMW.
        This is different from overriding, where the method call would be resolved at runtime based on the actual object.

        In method hiding, static methods are resolved based on the reference type, not the object type. So when you do top casting,
        the superclass version of the static method is called — even if the object is actually a subclass.
         */

	}

}
