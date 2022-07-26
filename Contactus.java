package Signup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contactus {
	@Test()
	public void contact() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./AAA/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("chethan");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("cgowdan@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9663824163");
		driver.findElement(By.name("message")).sendKeys("hello world");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
}
}
