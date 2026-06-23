package ch01.sec08;

public class StringConcatExample {
	public static void main(String[] args) {
		
		int result1 = 10 + 2 + 8;
		System.out.println("resutl1: " + result1);
		
		String result2 = 10 + 2 + "8";
		System.out.println("resutl2: " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("resutl3: " + result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println("resutl4: " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("resutl5: " + result5);
		
	}
}
