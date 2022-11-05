package streams;

import java.util.stream.IntStream;

public class sample2 {
	public static void main(String[] args) {
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();
	}
}
