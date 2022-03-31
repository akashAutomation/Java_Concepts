package BasicPrograms.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("test\\WritingData.txt"); 
		BufferedWriter bw = new  BufferedWriter(file);
		
		bw.write("Hi, This is Akash.");
		bw.newLine();
		bw.write("Welcome to java.");
		bw.newLine();
		bw.write("Selenium with java.");
		
		bw.close();
		file.close();
	}

}
