package ch06.finalEx;

public class Korean {
	final String nation = "대한민국"; // 선언 시 초기화
	final String ssn;			   // 생성자로 초기화.
	
	String name;				   // 인스턴스 변수.
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
