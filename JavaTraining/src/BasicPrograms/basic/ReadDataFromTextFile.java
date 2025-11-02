package JavaTraining.src.BasicPrograms.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {		
	
	// 1. using FileReader and BufferedReader class	
		FileReader	file = new FileReader("JavaTraining/test/Sample.txt");
		BufferedReader br =  new BufferedReader(file);
		
		String s;
		
		while((s = br.readLine())!= null) {
			System.out.println(s);
		}	
		
		br.close();
		file.close();
	
	// 2. using Scanner and File class	
//		File file = new File("test\\Sample.txt");
//		Scanner sc = new Scanner(file);
//		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
	}

}
