package ch06.exam04;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		model = this.model;
		color = this.color;
	}
	
	Car(String model, String color, int maxSpeed){
		model = this.model;
		color = this.color;
		maxSpeed = this.maxSpeed;
	}
}
