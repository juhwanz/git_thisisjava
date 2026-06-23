package ch06.exam01;

public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("모델 명 : " + car.model);
		System.out.println("시동 여부 : " + car.start);
		System.out.println("현재 속도 : " + car.speed);
	}
	
	
}
