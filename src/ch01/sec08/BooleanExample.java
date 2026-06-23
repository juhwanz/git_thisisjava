package ch01.sec08;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		}
		
		int x = 10;
		boolean result1 = ( x == 1);
		boolean result2 = (x != 2 );
		System.out.println("result1" + result1);
		System.out.println("result2" + result2);
		
	}
}
