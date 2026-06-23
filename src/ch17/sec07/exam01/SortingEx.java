package ch17.sec07.exam01;

import java.util.*;

public class SortingEx {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미손", 20));
		
		studentList.stream()
		.sorted()
		.forEach(s -> System.out.println(s.getName() + s.getScore()));
		System.out.println();
		
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + s.getScore()));
	}
}
