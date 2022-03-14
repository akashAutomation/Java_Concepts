package OOPsConcepts;

public class WrapperClasses {
	/*
	 * 1. Wrapper Classes --> It provide a way to use primitive data types as objects.
	 * 2. 8 wrapper classes --> Boolean, Byte, Character, Short, Integer, Long, Float, Double
	 *  
	 */
	public static void main(String[] args) {
		
		
		
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
		System.out.println(Boolean.parseBoolean(s3)); // if pass any value other then true and false then it will return always false

		// int to string
		int a = 20;
		System.out.println(a+10);
		System.out.println(String.valueOf(a)+10);
	}

}
