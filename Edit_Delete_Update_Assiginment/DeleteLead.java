package Assignments;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;


public class DeleteLead {
	public static void main(String[] args) {
		
		//Delete Lead:
		//Launch the browser
		FirefoxDriver driver=new FirefoxDriver();

		//Load the Web Application Leaftaps URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the Firefox Browser
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); 

		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("6381091716");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture lead ID of First Resulting lead
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='11782']")).click();
		
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11782");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);

		//Close the browser (Do not log out)
		driver.close();
		
	}

}