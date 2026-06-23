package ch07.sec02;

public class SmartphoneEx {
	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone("갤럭시","은색");
		
		System.out.println(smartphone.model);
		System.out.println(smartphone.color);
		System.out.println(smartphone.wifi);
		
		smartphone.bell();
		smartphone.sendVoice("여보세요");
		smartphone.receiveVoice("안녕하세요");
		smartphone.sendVoice("반갑습니다.");
		smartphone.hangUp();
		
		smartphone.setWifi(true);
		smartphone.internet();
	}
}
