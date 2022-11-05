package streams;

import java.util.stream.IntStream;

public class sum {
	public static void main(String[] args) {
		System.out.println(
				IntStream
					.range(1, 5)
					.sum());
	}
}
