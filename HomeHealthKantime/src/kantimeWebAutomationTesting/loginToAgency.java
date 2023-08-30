package kantimeWebAutomationTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;


public class loginToAgency extends kthomehealth {
	
	
	
	public void agencylogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='MainContent_txt_HHAName']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='MainContent_txt_HHAName']")).sendKeys("181");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@class='search_ico']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@title='Login - Support']")).click();
		Thread.sleep(5000);
	}
}
