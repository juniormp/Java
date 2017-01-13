package Java8.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

	
	public static void main(String[] args) {
		
		System.out.println("1. Criar uma Stream");
		Stream<Integer> stream = Stream.of(1,2,3);
		stream.forEach(u -> System.out.print(u));
		
		System.out.println("\n\n2. Special Stream");
		IntStream.range(1, 4).forEach(u -> System.out.print(u));
		
		System.out.println("\n\n2.1. Trabalhando com Special Stream ");
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println);
		

		
	}
	
}
