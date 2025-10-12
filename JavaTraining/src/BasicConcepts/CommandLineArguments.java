package JavaTraining.src.BasicConcepts;

public class CommandLineArguments {

	public static void main(String []args) {
		/*
		 * 1. A Java application can accept any number of arguments from the command line. 
		 * 2. We can use these arguments anywhere in our program.
		 * 3. Arguments that are supplied to java program at run time are called command line arguments.
		 * 4. In Java, command-line arguments are a way to pass information to your program when it starts.
		 *    These arguments are received as an array of String in the main method
		 * 5. we need to execute java file from cmd then pass n number of arguments.
		 */
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}
