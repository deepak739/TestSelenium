package kantimeWebAutomationTesting;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;

public class MainIntakePage extends kthomehealth
{
	public void intakemainpage() throws InterruptedException
	{
		
		String uniqueSSN = "1" + System.currentTimeMillis();
		String firstTenDigits = uniqueSSN.substring(0, 10);  

		driver.findElement(By.xpath("//input[@id='txt_SSN']")).sendKeys(firstTenDigits);

        driver.findElement(By.xpath("//input[@id='rad_Male']")).click();
        driver.findElement(By.xpath("//input[@id='MainContent_GeneralSection_txt_MedicareNo']")).sendKeys("8590885665");
        
        driver.findElement(By.xpath("//input[@id='txt_Address1']")).sendKeys("Address 1");
        
        
        
        
        
        
        driver.findElement(By.xpath("//input[@id='txt_Zip']")).sendKeys("12345");

        driver.findElement(By.xpath("//input[@id='MainContent_GeneralSection_chk_NotListRepresentative']")).click();

        driver.findElement(By.xpath("//input[@id='txt_IntakeDate']")).clear();
        driver.findElement(By.xpath("//input[@id='txt_IntakeDate']")).sendKeys("05/18/2020");
        
        driver.findElement(By.xpath("//input[@id='txt_RefDate']")).clear();

        driver.findElement(By.xpath("//input[@id='txt_RefDate']")).sendKeys("05/18/2020");

        driver.findElement(By.xpath("//input[@id='txt_SocDate']")).sendKeys("05/18/2020");
        Thread.sleep(4000);
        driver.findElement(By.linkText("123")).click();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		Thread.sleep(5000);
        driver.findElement(By.id("chkCompleted")).click();
        driver.findElement(By.id("txtCompletedOn")).sendKeys("05/18/2020");
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        Thread.sleep(4000);
        driver.switchTo().alert().accept();

        Thread.sleep(3000);
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='btnSaveIntake']")).click();
        Thread.sleep(5000);
        
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
	}
	

}
