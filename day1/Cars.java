package week1.day1;

public class Cars {
	public void applyGear() {
		System.out.println("Apply the Gear");
	}
	public void switchOnAC() {
		System.out.println("Switch on the AC");
	}
	public void applyAcclerate() {
		System.out.println("Press the Acclerator");
	}
	public static void main(String[] args) {
		Cars audi = new Cars();
		audi.applyGear();
		audi.switchOnAC();
		audi.applyAcclerate();
	}
}
