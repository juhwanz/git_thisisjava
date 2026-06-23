package ch06.getset;

public class Car {
	
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
	    if(speed<0) this.speed = 0;
		else this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	//(알트 시프트 에스 > 알 > 알트 에이 > 알)
}
