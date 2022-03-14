package BasicConcepts;

public class CommandLineArguments {

	public static void main(String []args) {
		/*
		 * 1. A Java application can accept any number of arguments from the command line. 
		 * 2. We can use these arguments anywhere in our program.
		 * 3. Arguments that are supplied to java program at run time are called command line arguments.
		 */		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}
