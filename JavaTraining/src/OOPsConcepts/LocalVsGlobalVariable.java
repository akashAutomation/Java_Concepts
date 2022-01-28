package OOPsConcepts;

public class LocalVsGlobalVariable {
	
	// Global variables or Class variables
		String name = "Akash";
		int age = 24;
		static int contact = 1234;
		
	public static void main(String[] args) {
		int i = 30; // local var. for main()
		System.out.println(i);
		
	// 1. We can use non static global var. in main() by creating object.
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		
	// 2. We can directly use static global var. in main()
		System.out.println(contact);
		
	// 3. We cannot access class var. of non static methods in main()
	// 4. If we are using global var. in other methods then only we can access that variable
	//	ex.- we can access age of test() because it is a global var, we can not access i,j
		
		obj.test();
		System.out.println(obj.age); //output - 10
		
	}
	
	public void test() {
		int i = 50;  // local var. for test()
		int j = 20;
		age = 10;
	}

}
