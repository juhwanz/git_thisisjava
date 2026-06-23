package ch06.exam02;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println("제작사: " + car.comapny);
		System.out.println("모델명: " + car.model);
		System.out.println("색깔: " + car.color);
		System.out.println("최고속도: " + car.maxSpeed);
		System.out.println("현재속도: " + car.speed);
		
		car.speed = 60;
		System.out.println("수정된 속도 : " + car.speed);
	}
}
