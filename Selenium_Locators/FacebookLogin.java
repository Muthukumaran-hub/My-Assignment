package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Launch chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load Application url
		driver.get("https://www.facebook.com/");
		
		//maximize the browser
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Muthu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumaran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("muthu@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("muthu@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password123");
		
		WebElement date = driver.findElement(By.id("day"));
		Select dropDownBox=new Select(date);
		
		dropDownBox.selectByValue("23");
		
		WebElement month = driver.findElement(By.id("month"));
		Select dropDownBox2=new Select(month);
		
		dropDownBox2.selectByVisibleText("Dec");

		WebElement year = driver.findElement(By.id("year"));
		Select dropDownBox3=new Select(year);
		
		dropDownBox3.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		
		
		
	}

}
