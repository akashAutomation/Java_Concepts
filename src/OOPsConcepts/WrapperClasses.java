package OOPsConcepts;

public class WrapperClasses {
	/*
	 Java has two categories in which data types are segregated:
     1. Primitive Data Type: These are the basic building blocks that store simple values directly in memory.
        Examples: boolean, char, byte, short, int, long, float and double.
     2. Non-Primitive Data Types (Object Types): These are reference types that store memory addresses of objects.
        Examples: String, Array, Class, Interface and Object

	 Wrapper Classes --> It provides a way to use primitive data types as objects.
	 8 wrapper classes --> Boolean, Byte, Character, Short, Integer, Long, Float, Double

        Primitive Type	  Wrapper Class             Size
            byte	        Byte                (1 byte) 8 bits
            short	        Short               (2 byte) 16 bits
            char	        Character           (2 byte) 16 bits
            int	            Integer             (4 byte) 32 bits
            long	        Long                (8 byte) 64 bits
            float	        Float               (4 byte) 32 bits
            double	        Double              (8 byte) 64 bits
            boolean	        Boolean             1 byte
	 */

    public static void main(String[] args) {
        // Autoboxing is the automatic conversion of a primitive type into its corresponding wrapper class.
        int num = 10;
        Integer wrappedNum = num;  // Autoboxing: int → Integer (Java internally calls Integer.valueOf(num) for you.)


       // Unboxing is the automatic conversion of a wrapper class object back into its primitive type.
        Integer wrappedNum1 = 20;
        int num1 = wrappedNum1;  // Unboxing: Integer → int (Java internally calls wrappedNum.intValue() for you.)


        String s = "50";
		System.out.println(s+20);
		
		// Data Conversion : String to int
		int i = Integer.parseInt(s);  //If String is not have pure int value then it will throw NumberFormatException
		System.out.println(i+20);
		
		// String to Double
		String s2 = "10.53";
		double d = Double.parseDouble(s2);
		System.out.println(d+10);
		
		// String to boolean
		String s3 = "TRUE";
		System.out.println(Boolean.parseBoolean(s3)); // if pass any value other than true/TRUE then it will return always false

		// int to string
		int a = 20;
		System.out.println(a+10);
		System.out.println(String.valueOf(a)+10);
	}

}
