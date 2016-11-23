package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();
		books.add(new Book("Java 8", 5));
		books.add(new Book("UML", 10));
		books.add(new Book("Ruby", 6));
		books.add(new Book("Oracle", 5));
		books.add(new Book("Hibernate", 20));
		books.add(new Book("Angular", 15));

		// Example 1
		System.out.println("\n 1.Orderning by book's quantity");
		books.sort(Comparator.comparing(b -> b.getQtd()));
		books.forEach(b -> System.out.println(b.getName()));

		// Example 2 - using stream
		// Stream<Book> = bookStream = books.stream();
		System.out.println("\n 2.Filtering book's quantity  >= 10");
		books.stream().filter(b -> b.getQtd() >= 10).forEach(b -> System.out.println(b.getName()));

		// Example 3
		System.out.println(" \n 3.Filtering book's quantity >= 10 and show the quantity >= 10");
		books.stream().filter(b -> b.getQtd() >= 10).map(b -> b.getQtd()).forEach(total -> System.out.println(total));
		// using method reference - books.stream().filter(b -> b.getQtd() >= 10).map(Book:getQtd).forEach(System.out::println);
	
		// Example 4
		System.out.println(" \n 4.Filtering book's quantity >= 10 and sum");
		int sum = books.stream().filter(b -> b.getQtd() >= 10).mapToInt(Book::getQtd).sum();
		System.out.println(sum);
		
		// Example 5
		System.out.println(" \n 5.Filtering book's quantity >= 10 and get and of those");
		Optional<Book> optionalBook =  books.stream().filter(b -> b.getQtd() > 10).findAny();
		// Optional is a new Class in Java 8 that we can work with null results
		Book book = optionalBook.orElse(null);
		System.out.println(book.getName());
		// or 
		books.stream().filter(b -> b.getQtd() > 10).findAny().ifPresent(s -> System.out.println(s.getName()));
		
		// Example 6
		System.out.println(" \n 6.Filtering book's quantity >= 10 and sum");
		OptionalDouble avg = books.stream().filter(b -> b.getQtd() >= 1000).mapToInt(Book::getQtd).average();
		System.out.println(avg); // Empty because there is not object where qtd >= 1000
		
		// Example 7
		System.out.println(" \n 7.Filtering book's quantity > 10 and convert Stream to List");
		List<Book> listBook = books.stream().filter(b -> b.getQtd() > 10).collect(Collectors.toList());
		listBook.forEach(c -> System.out.println(c.getName()));
	
		// Example 8
		System.out.println(" \n 8.Filtering book's quantity > 10 and convert Stream to Map");
		books.stream().filter(b -> b.getQtd() > 10).collect(Collectors.toMap(b -> b.getName(), b -> b.getQtd())).forEach((name, qtd) -> System.out.println("book: " + name + " qtd: " + qtd));
	
	}

}
