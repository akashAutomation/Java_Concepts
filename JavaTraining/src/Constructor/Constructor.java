package Constructor;

//with this keyword

public class Constructor {
	/*
	 * Constructor --> It is class entity which is used to define some class features while creating the object
	 * 1. Constructor will never return any value --> we can not write return statement inside constructor, if we write return then
	 *    it will become method 
	 * 2. Constructor name always same as class name
	 * 3. Constructors are independent, we can not create constructor inside any methods.
	 * 4. To call any constructor first create object 
	 * 5. Constructor overloading can we done
	 * 6. By using this keyword We can initialize class variables using constructors --> "this" keyword always represent current class
	 *    ex-> this.name = name; -> this.class variable = local variable
	 *    
	 * 7. If you don't want to use this keyword to initialize class variables then provide different name of local variable in constructor
	 *    ex-> name = n1 
	 * 8. Constructor can not be static
	 * 9. It can be only defualt, public, protected & private
	 * 10. If you don't define any constructor in class, then there is always one hidden constructor of class that is called default constructor
	 */	
	String name;
	int age;
	
	public Constructor(){ // Default Constructor
		System.out.println("default constructor");
	}
	
	public Constructor(int i){ //Constructor overloading
		System.out.println("1 param i = "+ i);
	}
	
	public Constructor(int i, String j){ //Constructor overloading
		System.out.println("2 param i = "+i+ " and j= "+j);
	}
	
	Constructor(String name, int age){ //Constructor overloading
		this.name = name; // this.class variable = local var
		this.age = age; // this.class variable = local var

		//name = n1; --> class variables can be initialize without this keyword		
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(); //by using this line only Default Constructor will be called
		Constructor obj1 = new Constructor(10); //by using this line only 1 param Constructor will be called
		Constructor obj2 = new Constructor(20, "abc"); //by using this line only 2 param Constructor will be called
		
		Constructor obj3 = new Constructor("Akash", 24); //by using this line we can initialize class variables
		System.out.println("name = "+obj3.name+", age = "+obj3.age);
		
	}

}
