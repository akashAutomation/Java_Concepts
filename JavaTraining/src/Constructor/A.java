package Constructor;

public class A {

	public A() {
		System.out.println("Parent class A cons");
	}

	public A(int i) {
		System.out.println("Parent class cons with value i = " + i);
	}

	public A(int i, String j) {
		System.out.println("Parent class cons with value i = " + i + " and j =" + j);
	}
}
