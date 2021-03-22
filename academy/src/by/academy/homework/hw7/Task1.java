package by.academy.homework.hw7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String... args) {

		Map<Double, String> map = Stream.generate(() -> new Random().nextInt(100)).limit(100).sorted()
				.map(m -> m * Math.PI - 20).filter(m -> m < 100).skip(3).distinct()
				.collect(Collectors.toMap(m -> m, m -> "Number: " + m));
		System.out.println(map);
	}
}