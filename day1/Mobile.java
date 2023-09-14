package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("Send a Message to a Particular Person");
	}
	public void shareDocument() {
		System.out.println("Share a Particular Document");
	}
	public void makeCall() {
		System.out.println("Make a Call on Mobile");
	}
	public static void main(String[] args) {
		Mobile tecno = new Mobile();
		tecno.sendMessage();
		tecno.shareDocument();
		tecno.makeCall();
	}
}
