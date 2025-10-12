package JavaTraining.src.String;

public class StringVsStringBuffer {

	
	public static void case1() {
		String s = new String("hello");
		s.concat("world");
		System.out.println("s = "+s); // o/p will be "hello" because we tried to concat "world" in that object then new object will be
							   // created with the value "hello world". If we store it in any reference variable then only it will give "hello world".  
		s = s.concat("world"); // now s is referencing "helloworld" not "hello"
		System.out.println("s = "+s);		
	
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println("sb = "+sb);
		
		String ss = "hello";
		ss.concat("world");
		System.out.println("ss = "+ss);
	}
	
	public static void case2() {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println("s1==s2 --> "+(s1==s2)); // false because == operator return true only if both reference variable will point same object.
		System.out.println("s1.equals(s2) = "+s1.equals(s2)); // true because equals method is overridden method from object class which is used for content equal. 
															  // equals method in Object class is used for reference or address comparison that's why String class has override that equals methods and changed its implementation from reference to content comparison.
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		
		System.out.println("sb1==sb2 --> "+(sb1==sb2)); // false because == operator return true only if both reference variable will point same object.
		System.out.println("sb1.equals(sb2) = "+sb1.equals(sb2)); //false because there is no overridden equals method in string buffer class. It used Object class equals()
		
	}
	
	public static void main(String[] args) {
        System.out.println("-----------------case-1--------------");
        case1();
        System.out.println("-----------------case-2--------------");
        case2();
		
	}

}
