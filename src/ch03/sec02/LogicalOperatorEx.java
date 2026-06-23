package ch03.sec02;

public class LogicalOperatorEx {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (65<=charCode) & (charCode<=90)) {
			System.out.println("대문자이시군요");
		}
		if( (95<=charCode) & (charCode<=122)) {
			System.out.println("소문자이신구요");
		}
		
		if( (48<= charCode) & (charCode < 57)) {
			System.out.println("0 ~9 숫자이시군요");
		}
		
		int value = 6;
		
		
	}
}
