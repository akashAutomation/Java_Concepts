package BasicConcepts;

/* 1. Type casting is a process that converts a data type into another data type in both ways automatically and manually.
      Automatic conversion done by compiler and manual conversion performed by programmer.
   
   2. Widening type casting --> converting a lower data type into higher one. It is also known as implicitly conversion or casting down.
      							It is safe because there is no chance to lose data.
      							
      							byte->short->char->int->long->float->double
   
   3. Narrowing type casting --> Converting higher data type into a lower one. It is also known as explicitly conversion or casting up.
      							 It is done manually by the programmer. If we do not perform casting then the compiler reports a compile time
      							 error. Chances of Data lose.
      							 
      							 double->float->long->int->char->short->byte
*/
public class TypeConversion {

	public static void main(String[] args) {
		int x = 2;
		float y = x;  // widening conversion, no error
		System.out.println("y = "+y);
		
		float a = 3.4f;
		// int b = a;  --> can not write like this, error
		int b = (int)a; // narrowing conversion
		System.out.println("b = "+b);
		
		// float f = 3.5;  --> Narrowing conversion, error because 3.5 is double type value by default
		float f = 3.5f; // no error
		double l = 3.5; 
	}

}
