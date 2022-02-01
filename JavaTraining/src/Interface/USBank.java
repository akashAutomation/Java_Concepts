package Interface;

public interface USBank {

	/*
	 * 1. Only method declaration
	 * 2. No method body -> only method prototype
	 * 3. In interface, we can declare the variables, variables are by default static in nature
	 * 4. Variable value will not be changed because it is final/constant in nature
	 * 5. No static method in interface
	 * 6. No main method in interface
	 * 7. We can not create the object of Interface
	 * 8. Interface is abstract in nature --> we achieve 100% abstraction
	 * 9. Methods and variables are by default public in nature
	 * 10. Interface do not have constructors.
	 * 
	 */
	
	int min_bal = 100; // by default public, static, final in nature
	
	void credit();  // by default public
	
	public void debit();
	
	public void transferMoney();
	
}
