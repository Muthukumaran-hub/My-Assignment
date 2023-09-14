package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	public void turnOnAC() {
		System.out.println("Turn On The AC");
	}
	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.applyBreak();
		bmw.soundHorn();
		bmw.turnOnAC();
	}
}
