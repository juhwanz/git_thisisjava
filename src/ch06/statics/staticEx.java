package ch06.statics;

public class staticEx {
	public static void main(String[] args) {
		System.out.println("main메서드");
		//StaticTest st = new StaticTest();
		System.out.println(StaticTest.company);
	}
	
	
	// 흐름
	// 지역 필드 -> 스태틱 -> 인스턴스 -> 생성자.
}

class StaticTest{
	
	static String company;
	
	// 스태틱 필드
	static {
		company = " 현다이";
		System.out.println("static 블럭");
	}
	
	// 인스턴스 필드
	{
		System.out.println("instance 블럭"); // 인스턴스 블록은 생성자와 거의 동시에 사용되기에 잘 사용 X
	}
	
	// 생성자
	StaticTest(){
		System.out.println("StaticTest 생성자 실행");
	}
	
}