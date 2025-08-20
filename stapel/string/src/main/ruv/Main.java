package main.ruv;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) {
		String s = "a";
		
		Instant start = Instant.now();
		for(int i = 0; i < 2_000_000; i++) {
			s += "a";
		}
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
	}

}
