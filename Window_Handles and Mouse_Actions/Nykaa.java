package Assignments;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


/**
 * @author User
 *
 */
public class Nykaa {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
	
		
		//Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		//Mouseover on Brands and Search L'Oreal Paris  L'Oreal Paris
		 
		 WebElement ele = driver.findElement(By.xpath("//a[text()='brands']"));
		  Actions action=new Actions(driver);
		  action.moveToElement (ele).perform(); 
		 driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		
		//Click L'Oreal Paris
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")).click(); 
		
		//Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title= driver.getTitle();
		System.out.println(title);

		//Click sort By and select customer top rated
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class=' css-1aucgde']/span")).click(); 
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();

		//Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r']/span)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click(); 
		driver.findElement(By.xpath("//div[@class=' css-1nozswx'][1]")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

		//Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();	
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		//Check whether the Filter is applied with Shampoo
		//Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();

		//GO to the new window and select size as 175ml
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> openwindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(openwindow.get(1));
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=' css-1r0ze8m']/span")).click();
		//Print the MRP of the product
		WebElement shampooPrize = driver.findElement(By.xpath("//span[text()='₹399']"));
		System.out.println("Price of the Shampoo is :"+shampooPrize);
		//Click on ADD to BAG
		driver.findElement(By.xpath("//button[@class=' css-13zjqg6']")).click();
		//Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		//Print the Grand Total amount
		WebElement grandTotal = driver.findElement(By.xpath("//span[text()='₹279']"));
		System.out.println("Price of the Shampoo is :"+grandTotal);
		//Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		//Click on Continue as Guest
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		//Check if this grand total is the same in step 14
		//Close all windows

	}

}
