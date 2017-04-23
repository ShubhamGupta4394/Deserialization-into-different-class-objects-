package genericDeser.fileOperations;

import java.io.BufferedReader;
import java.io.IOException;

public class FileProcessor {
	private String str=null;
	private BufferedReader br;

	/**
	 * Constructor
	 * @param brIn
	 */
	public FileProcessor(BufferedReader brIn){

		Logger.writeMessage("Constructor of FileProcessor Called", Logger.DebugLevel.CONSTRUCTORCALLED);
		this.br = brIn;
	}
	
	/**
	 * Method to read from a file
	 * @param br - Buffered Reader object
	 * @return string
	 */
	public String readFile(){
		try {
			str = br.readLine();
		} catch (IOException e) {
			System.out.println("Error while reading file");
			System.exit(1);
		}
		return str;
	}

}
