package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("dd");
		set.add("fef");
		set.add("gaerge");
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
