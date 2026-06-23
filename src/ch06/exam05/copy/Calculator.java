package ch06.exam05.copy;

public class Calculator {
	void powerOn() {
		System.out.println("ON");
	}
	void powerOff() {
		System.out.println("OFF");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double) y;
		return result;
	}
}
