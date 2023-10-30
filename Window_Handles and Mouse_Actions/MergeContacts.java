
package Assignments;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author User
 *
 */
public class MergeContacts {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the Leaftaps URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Enter the Username and Password using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		
		//Change the Window Control to Newly Opened Window
		Set<String> openedWindow = driver.getWindowHandles();
		List<String> childWindow=new ArrayList<String>(openedWindow);
		driver.switchTo().window(childWindow.get(1));
		//Get the Title of the Current Window 
		String title = driver.getTitle();
		System.out.println(title);
		
		//Click On First Resulting Lead ID
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Change the Window Control to Main Window
		Set<String> ParentWindow = driver.getWindowHandles();
		List<String> mainWindow= new ArrayList<String>(ParentWindow);
		driver.switchTo().window(mainWindow.get(0));
		
		//Get the Title of the Window
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(3000);
		
		//Click on Widget of To Contact
		driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
		
		//Change the Window Control to Newly Opened Window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow2=new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow2.get(1));
		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[3]")).click();
		
		
		//Change the Window Control to Main Window
		driver.switchTo().window(mainWindow.get(0));
		
		//Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//Accept the Alert
		driver.switchTo().alert().accept();
		
		//Verify the title of the page
		System.out.println("Current Page Title : "+title2);
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
