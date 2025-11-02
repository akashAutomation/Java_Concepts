package JavaTraining.src.BasicPrograms.basic;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String a[]= {"ab", "ab", "abc", "abcd", "abc"};
		
		boolean b = false;
		for(int i=0; i<a.length; i++) {
			System.out.println("b = "+i+" "+b);
			for(int j=i+1; j<a.length; j++) {
				if(a[i].equals(a[j])) {
					b = true;
					System.out.println("duplicate "+a[i]);
				}
			}
		}
		if(b==false) {
			System.out.println("duplicate not found");
		}

	}

}
