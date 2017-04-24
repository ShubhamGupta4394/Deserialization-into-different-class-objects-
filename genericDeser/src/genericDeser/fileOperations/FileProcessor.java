package genericDeser.fileOperations;

import java.io.BufferedReader;
import java.io.IOException;


/**
 * FileProcessor is used to 
 * process file operations
 * @author shubham
 * 
 */
public class FileProcessor {
	BufferedReader in;
	String read;

	
	public FileProcessor(BufferedReader bufReaderIn) {
		Logger.writeMessage("In FileProcessor, BufferedReader constructor",
				Logger.DebugLevel.CONSTRUCTOR);
		in = bufReaderIn;
	}

		
	/**
	 * * readLineFromFile is used to read contents of input
	 * file.
	 * @return String as output
	 */
	
	public synchronized String readLineFromFile() {
		try {
			read = in.readLine();
		} catch (IOException e) {
			System.err.println("Error in Reading File");
			e.printStackTrace();
		}
		return read;
	}
}
