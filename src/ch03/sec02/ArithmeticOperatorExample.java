package ch03.sec02;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4;
		System.out.println("result2: " + result2);
		double result3 = (double)v1 / v2;
		System.out.println("result3: " + result3);
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);
		
		
		// 주의!
		double price = 1000.10;
		double fee = 0.20;
		System.out.println(price + fee);
		System.out.println(1000.30 == price + fee); // false;
		// 부동소수점 문제.
		// 해결법 : 정수로 바꿔서 다시 실수로 나눔.
		double price2 = price * 100;
		double fee2 = fee * 100;
		System.out.println( (price2 + fee2) / 100.0);
		System.out.println(1000.30 == price2 + fee2);
		//----
		String id = "admin";
		String id2 = new String("admin");
		System.out.println(id2);
		System.out.println(id != id2); // true
		System.out.println(!id.equals(id2)); // false
	}
}
