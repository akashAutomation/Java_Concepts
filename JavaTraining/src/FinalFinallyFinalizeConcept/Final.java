package FinalFinallyFinalizeConcept;

public class Final extends C{  // here we can not extend A class because it is final

	public static void main(String args[]) {
		// final keyword is used to define the constant value.
		
		 final int i = 20;  // constant value or can not chnage the value of i 
		 
		 
	}
	
	/*
	 * we can not override a final method
	 * ex-> We are extends C class and C has a start() with final keyword so we can not override.
	 * 
	 * 	public void start() { 
	 * 		System.out.println("Final-->start()"); 
	 * 	}
	 */
	
}
