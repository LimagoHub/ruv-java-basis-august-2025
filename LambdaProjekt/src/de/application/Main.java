package de.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		new Main().foo();

	}
	
	int quadrat(int x) {
		return x * x;
	}
	
	double add(double a, double b ) {
		return a + b;
	}
	
	private void foo() {
	
		
		
		List<String> liste = new ArrayList<>();
		liste.add("Eins");
		liste.add("Eins");
		liste.add("Zwei");
		liste.add("Drei");
		
		/*Stream<String> stream = liste.stream();
		stream
			.parallel()
			.filter(s->s.endsWith("ei"))
			.map(s->s.toUpperCase())
			.sequential()
			.forEach(System.out::println);
		*/
		IntStream is = IntStream.rangeClosed(1, 1000);
		//IntStream is = IntStream.iterate(5, v->v+5);
		//is.filter(this::isPrime).forEach(System.out::println);
		
		is.filter(p->{
			for(int i = 2; i <= p/2; i ++) {
				if(p % i == 0) return false;
			}
			return true;
		}).forEach(System.out::println);
	}
	
	boolean isPrime(int possiblePrime) {
		for(int i = 2; i <= possiblePrime/2; i ++) {
			if(possiblePrime % i == 0) return false;
		}
		return true;
	}
	
	Predicate<Integer> isPrimePredicate = new Predicate<>() {
		int summe = 0;
		@Override
		public boolean test(Integer t) {
			for(int i = 2; i <= t/2; i ++) {
				if(t % i == 0) return false;
			}
			summe += t;
			return true;
		}
	};

	
		
		
		
		
		
		/*
		//Function<Integer, Integer> f = this::quadrat;
		//Function<Integer, Integer> f = x->x * x;
		Function<String, Integer> f = s->s.length();
		BiFunction<Double, Double, Double> op = (a,b)->a + b;
		System.out.println(op.apply(3.0, 4.0));
		*/

	
	

}
