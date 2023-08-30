package kantimeWebAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginToWorkingSite extends kthomehealth{
	
	public void workinglogin() throws InterruptedException
	{
		
		
		driver.manage().window().maximize();
		driver.get(workingUrl);
		driver.findElement(By.xpath("//input[@id = 'txt_username']")).sendKeys("kadmin");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@id='btn_login']")).click();
		//driver.findElement(By.xpath("//button[@id='details-button']")).click();
		//driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(5000);
		
	}
	
	
}
