package kantimeWebAutomationTesting;

import org.openqa.selenium.By;

public class SaveAndAcceptTheClient extends kthomehealth
{

	public void acceptcClient() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='btnAcceptIntake']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='btnAcceptConfirm']")).click();
		Thread.sleep(5000);
    	driver.switchTo().alert().accept();
    	Thread.sleep(5000);
    	driver.switchTo().alert().accept();
	}
}
