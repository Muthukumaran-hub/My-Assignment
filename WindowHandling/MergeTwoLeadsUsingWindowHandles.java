package week7.day1;

import java.util.ArrayList;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class MergeTwoLeadsUsingWindowHandles {
public static void main(String[] args) throws InterruptedException {
	// Launch the Browser
	ChromeDriver driver=new ChromeDriver();
	
	// Load the URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	// Maximize the Chrome Window
	driver.manage().window().maximize();
	
	// Enter the UserNmae as Demosalemanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	// Enter the Password
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	//Click the Submit Button
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> childWindow = driver.getWindowHandles();
	List<String> openedWindow=new ArrayList<String>(childWindow);
	driver.switchTo().window(openedWindow.get(1));
	String title = driver.getTitle();
	System.out.println(title);                            
	  	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();   	
	//String windowHandle = driver.getWindowHandle();
	//driver.switchTo().window(windowHandle);
	Set<String> ParentWindow = driver.getWindowHandles();
	List<String> mainWindow= new ArrayList<String>(ParentWindow);
	driver.switchTo().window(mainWindow.get(0));
	String title2 = driver.getTitle();
	System.out.println(title2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
	
//	driver.switchTo().window(openedWindow.get(1));
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> childWindow2=new ArrayList<String>(windowHandles);
	driver.switchTo().window(childWindow2.get(1));
	String title3 = driver.getTitle();
	System.out.println(title3);
	
//	driver.findElement(By.xpath("//div[@id='ext-gen306']/a")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[4]")).click();
	driver.switchTo().window(mainWindow.get(0));
	 driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
}
}
