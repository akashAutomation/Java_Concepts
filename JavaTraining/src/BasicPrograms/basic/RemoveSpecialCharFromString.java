package JavaTraining.src.BasicPrograms.basic;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		String s ="ab!#21&^:;<>an";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
