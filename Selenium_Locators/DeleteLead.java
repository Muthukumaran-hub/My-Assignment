package Assignments;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//Launch chrome Browser
			ChromeDriver driver=new ChromeDriver();
			
			//Load Application url
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			//maximize the browser
			driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.id("ext-gen270")).sendKeys("987654321");
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("987654321");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);	
	//	driver.close();
	
		
		
		
		
		
		
		
		
		
		}

	}

