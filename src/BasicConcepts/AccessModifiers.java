package BasicConcepts;

public class AccessModifiers {

	/* public > protected > default > private
	 * 1. public, protected, private, default
	 *      a. private -> can not access from outside the class body. Only can access from the same class
     * 		   					  in which they are declared.
     * 		b. protected -> can be access from any class of the same package and child class(subclass) from other package.
     * 								By using child class reference only, we can access protected members in child class of different package
     * 		c. default -> they are accessible within the same package.
     *      d. public  -> they are accessible from any class of any package.
     *
	 * 
	 * 2. For classes ->
	 * 		a. For outer class, there can be only 2 possibilities, either class is a public or just a class which means 
	 * 		   it is of default type.
	 * 		b. For inner class any among 4 access modifiers can be used.
	 * 		c. There can be only one public class in a single java file.
	 * 		d. The name of the java file must be the same as the name of the public class.
	 * 		e. Only public class can be accessed directly from outside the package.
	 *
	 * 
	 * 3. For Member variables and functions ->
	 * 	    a. private members -> can not access from outside the class body. Only can access from the same class
	 * 		   					  in which they are declared.
	 * 		b. protected members -> can be accessed from any class of the same package and child class of other package.
	 * 								By using child class reference only, we can access protected members in child class of different package
	 * 		c. public members -> they are accessible from any class of any package.
	 * 		d. default members -> they are accessible only from the class of same package.
	 *
	 *
        Modifier	Same Class	    Same Package	Subclass (Other Package)	Other Package
        public	    ✅	            ✅	            ✅	                        ✅
        protected	✅	            ✅	            ✅	                        ❌ (unless inherited)
        default	    ✅	            ✅	            ❌	                        ❌
        private	    ✅	            ❌	            ❌	                        ❌
	 */
	
	private int a; // only accessible within the A class
	public int b = 9; // accessible from any class of any package.
	protected int c = 8; // accessible from any class of same package and from child classes of other package.
	int d = 7; // can be access it from any class of same package
	
	public void func() {
		a=10;
	}

    interface nestedInterface { // by default default, abstract

    }
	
}

class A{ // outer class
	
	
	class B{ // inner class
		
	}			
}
