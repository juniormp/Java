package IO.NewIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOStringExample {

	public static void main(String[] args) throws IOException {
		
		String line = null; 
		
		// Working with String
		
		try(
				FileReader fr = new FileReader("file.txt"); 
				BufferedReader br = new BufferedReader(fr);
		    ) 
			{
				line = br.readLine();
			}
				
		
		try( 
				FileWriter fw = new FileWriter("destination.txt"); 
				PrintWriter out = new PrintWriter(fw);)
			{ 
				out.print(line);	
			}
				
				

	}

}
