package oops;

public class Automation extends MultipleLanguage {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is an Open Source Software");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java is an Object Oriented Programming");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
		System.out.println("I don't know about the Ruby Language");
	}
	public static void main(String[] args) {
		Automation execute = new Automation();
		execute.Selenium();
		execute.java();
		execute.ruby();
		execute.pyhton();
	}

	
	
}
