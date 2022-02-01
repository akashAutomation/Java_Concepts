package OOPsConcepts;

public class CallByValueAndCallByRef {

	int p;
	int q;

	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		
		int x = 10;
		int y = 20;
		
		obj.p = 50;
		obj.q = 60;
	
		/*
		 * Call by value or pass by value --> when we call any method and pass a copy of arguments
		 * 									  ex-> sum(x,y); --> here we are passing a copy of x,y var's values
		 * 
		 *  Call by reference --> We are passing a value of object reference
		 *  					  ex-> swap(obj); --> here we are passing a object reference obj while calling a method
		 */		
		
		int i = obj.sum(x, y);  // Call by value or pass by value
		System.out.println("sum = "+i);

		obj.swap(obj);  // Call by reference
		
		//after swapping
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}
}
