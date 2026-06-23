package ch06.singleton;

public class Singleton {
	
	//private 정적 필드 선언 + 초기화
	private static Singleton singleton = new Singleton();
	
	// private 생성자
	private Singleton() {
		
	}
	
	// public 정적 메서드
	public static Singleton getInstance() {
		return singleton;
	}
}
