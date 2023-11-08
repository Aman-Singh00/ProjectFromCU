package basic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout extends Login{
	
		@Test
		public void logout()
		{
	
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		driver.quit();
	}

}
