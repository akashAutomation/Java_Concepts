package JavaTraining.src.BasicPrograms.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		/* Creates a FileWriter object to write character data to the file "WritingData.txt" inside the folder
           JavaTraining/test. If the file doesn't exist, it will be created automatically.
		 */
        FileWriter file = new FileWriter("JavaTraining/test/WritingData.txt");

        /* Wraps the FileWriter inside a BufferedWriter to improve performance. It buffers the characters
           before writing them to the file, reducing disk access.
         */
        BufferedWriter bw = new  BufferedWriter(file);

        //Writes the string to the file
		bw.write("Hi, This is Akash.");

        //Inserts a newline character (\n) into the file, moving the cursor to the next line.
		bw.newLine();
		bw.write("Welcome to java.");
		bw.newLine();
		bw.write("Selenium with java.");
		
		//Closes the BufferedWriter, flushing any remaining data in the buffer to the file.
        bw.close();

        //Closes the underlying FileWriter. Technically optional if BufferedWriter is closed, but good practice.
		file.close();
	}

}
