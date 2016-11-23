package IO.NewIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOByteExample {

	public static void main(String[] args) throws IOException {
		
		// Working with bytes
		
		File file = new File("fonte.txt");
		File destination = new File("destino.txt");
		
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(destination);
		
		
		// Read 8192 bytes
		byte[] buffer = new byte[8192];
		int length = in.read(buffer);
		
		while (length != -1) {
			out.write(buffer, 0, length);
			buffer = new byte[8192];
			in.read(buffer);
		}
		
		in.close();
		out.flush();
		out.close();
	}

}
