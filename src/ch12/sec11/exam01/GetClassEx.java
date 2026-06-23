package ch12.sec11.exam01;

public class GetClassEx {
	public static void main(String[] args) {
		
		// 1.
		Class clazz = Car.class;
		
		//2.
		//Class clazz2 = Class.forName("ch12.sec11.exam01.Car");
		
		//3.
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getName());
	}
}
