package JavaTraining.src.FinalFinallyFinalizeConcept;

public class Final extends C{  // here we can not extend A class because it is final

	/*
	 * 1. We can use final keyword as: 
	 * 		a. final instance variable
	 * 		b. final static variable
	 * 		c. final local variable
	 * 		d. final class
	 * 		e. final methods
	 * 
	 * 2. A java variable can be declared using the keyword final. Then the final variable can be assigned only once.
	 * 3. A variable that is declared as final and not initialized is called a "blank final variable". it forces either the constructor 
	 * 	  to initialize it or initialization block to do this job.
	 */
	public static void main(String args[]) {
		// final keyword is used to define the constant value.
		
		 final int i = 20;  // constant value or can not change the value of i 
		 
		 
	}
	
	/*
	 * we can not override a final method
	 * ex-> We extend C class and C has a start() with final keyword so we can not override.
	 * 
	 * 	public void start() { 
	 * 		System.out.println("Final-->start()"); 
	 * 	}
	 */
	
}
