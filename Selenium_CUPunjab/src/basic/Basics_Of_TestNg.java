package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basics_Of_TestNg {

	public static WebDriver driver;
	
	@Test
	public void Login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("abctvc123@gmail.com", Keys.TAB, "abcd@123", Keys.ENTER);
	}

	@Test(dependsOnMethods = "Login")
	public void Logout() {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		driver.quit();
	}

}
