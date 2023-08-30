package kantimeWebAutomationTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IntakePayerSourceAndEligibilty extends kthomehealth
{

	public void intakepayersource() throws InterruptedException
	{
        //IntakePayerSourceAndEligibility
        
        driver.findElement(By.linkText("Payer Source & Eligibility")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//tr[@id='div_payermaindiv_1']//input[@id='Button1']")).click();
        Thread.sleep(5000);
        
		Set<String> windows = driver.getWindowHandles();
		Iterator itr = windows.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window((String) itr.next());
		}
        

		driver.findElement(By.xpath("//input[@id='rd_Eligible']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='txt_VerifiedOn']")).sendKeys("05/18/2020");
		
		WebElement targetverifiedby = driver.findElement(By.xpath("//input[@id='txt_EditPayer_VerifiedBy']"));
		
    	Actions verifiedby = new Actions(driver);
    	
    	targetverifiedby.sendKeys("a");
    	Thread.sleep(4000);
    	
    	verifiedby.sendKeys(targetverifiedby, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    	
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(4000);
    	
    	driver.switchTo().alert().accept();
    	Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Close']")).click();

		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		Thread.sleep(5000);
		String window1 = driver.getWindowHandle();

		
		driver.findElement(By.xpath("//input[@id='btn_EditPayer']")).click();

		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		Thread.sleep(5000);
		
		String uniqueInsuranceId = "1" + System.currentTimeMillis();
		String insuranceId = uniqueInsuranceId.substring(0, 10);
		driver.findElement(By.xpath("//input[@id='txt_EditPayer_InsurenceID']")).sendKeys(insuranceId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btn_EditPayer_Save']")).click();
		Thread.sleep(3000);

    	driver.switchTo().alert().accept();

    	driver.switchTo().window(window1);
		Thread.sleep(5000);
	}
}
