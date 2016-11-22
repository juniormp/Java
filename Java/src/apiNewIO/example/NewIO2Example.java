package apiNewIO.example;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class NewIO2Example extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
	
		return FileVisitResult.CONTINUE;
	}

	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

		
		return FileVisitResult.CONTINUE;
	}

}