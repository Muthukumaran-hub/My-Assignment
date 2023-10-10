package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop Resolution is 1920*1080");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop singleInheritance = new Desktop();
		singleInheritance.computerModel();
		singleInheritance.desktopSize();

		System.out.println("This is an Example of Single Inheritance");
	}

}
