package ch03.sec02;

public class check {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils - pencilsPerStudent * students;
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println((value / 100) * 100);
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if( y == 0.0) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}
	
}
