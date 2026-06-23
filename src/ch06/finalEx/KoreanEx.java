package ch06.finalEx;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "감자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		/*
		k1.nation = "USA";
		k1.ssn = "123-123-1234";
		*/
		
		k1.name = "감자바";
		
	}
}
