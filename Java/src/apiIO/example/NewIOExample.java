package apiIO.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewIOExample {

	public static void main(String[] args) throws IOException {

		File source = new File("original.pdf");
		File destination = new File("copy.pdf");

		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(destination);

		// Channel to read/write files
		FileChannel inChannel = fis.getChannel();
		FileChannel outChannel = fos.getChannel();

		// Copy all data from inChannel to outChannel
		outChannel.transferFrom(inChannel, 0, inChannel.size());

		// Request to SO to lock the file
		FileLock bloq = inChannel.lock();
		// Request to SO to release the file
		bloq.release();

		inChannel.close();
		outChannel.close();

		fis.close();
		fos.close();

		// Delete directory
		Path rootPath = Paths.get("temp");
		Files.delete(rootPath);
		
		// Copy files from the source to destination
		copyFiles(rootPath, rootPath);

	}

	public static void copyFiles(Path source, Path destination) throws IOException {

		// If it is a directory, try to create, if already exist, is not a problem
		if (Files.isDirectory(source)) {

			Files.createDirectories(destination);
			DirectoryStream<Path> entry = Files.newDirectoryStream(source);

			for (Path path : entry) {
				Path newSource = source.resolve(path.getFileName());
				Path newDestination = destination.resolve(path.getFileName());
			}
			
		} else {
			Files.copy(source, destination);
		}
	}

}
