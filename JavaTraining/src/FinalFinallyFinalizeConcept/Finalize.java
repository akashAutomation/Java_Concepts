package FinalFinallyFinalizeConcept;

public class Finalize {

	/*
	 * 1. finalize is a method --> It is used to perform to cleanup the memory
	 * 2. It will automatically called, there is no need to call explicitly
	 * 3. It is called just before the garbage collector.
	 * 4. If we will not create finalize() then finalize() of "Object" class will be executed by default.
	 * 5. finalize() is a protected and non-static method of java.lang.Object class.
	 *    Syntax of finalize() in Object class --> protected void finalize() throws Throwable{}
	 *    											 
	 * 6. Garbage collector thread before sweeping out an abandoned object, it calls finalize() of that object
	 * 7. You can call finalize() explicitly on an object before it is abandoned but it is work like a normal function
	 *    and it will execute the steps which are written inside that method but object will not be destroyed from the memory.
	 *    After this, Garbage collector will call finalize() by default then only your object will destroy from the memory
	 *    ex-> obj1.finalize(); --> only steps are executed of finalize() but will not destroy the object from the memory.
	 *   
	 * 8. Garbage collector thread calls finalize() only once for one object.
	 * 9. Exception occurred in finalize() are not propagated and Garbage collector will not stop there and all exceptions 
	 *    are ignored by the Garbage collector until the object destroyed.
	 *    
	 * 10. finalize methods are not chained like constructors i.e. there is no calling statement to parent class finalize() inside the
	 *     finalize() of child class. you need to explicitly call parent class finalize().
	 *     ex-> to call finalize() of parent class then write super.finalize() under child class finalize()
	 * 
	 * 11. We can not pass arguments in finalize(). If we pass any arguments then finalize() behave like normal methods.
	 * 12. When we are creating finalize() in our class then we are overriding it because it is also present in Object class.
	 *                       														    
	 */
	
	@Override
	public void finalize() {
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {
		Finalize obj1 = new Finalize();
		Finalize obj2 = new Finalize();
		//obj1.finalize();  --> no need to call explicitly
		obj1 = null;
		obj2 = null;
		
		System.gc();
	}
	
	

}
