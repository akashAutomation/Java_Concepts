package JavaTraining.src.OOPsConcepts;

public class CallByValueAndCallByRef {

	int p=100;
	int q=200;

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
		 *  					  ex-> swap(obj); --> here we are passing an object reference obj while calling a method
		 * For objects, the method gets a copy of the reference (not the object itself), so it can modify
		 * the object’s contents—but not reassign the original reference.
		 */		
		
		int i = obj.sum(x, y);  // Call by value or pass by value
		System.out.println("sum = "+i);

		obj.swap(obj);  // Call by reference
		
		//after swapping, it changes the p,q value obj object, not changes original values
		System.out.println("obj p = "+obj.p);
		System.out.println("obj q = "+obj.q);

        CallByValueAndCallByRef obj2 = new CallByValueAndCallByRef();
        System.out.println("obj2 p = "+obj2.p);
        System.out.println("obj2 q = "+obj2.q);
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
