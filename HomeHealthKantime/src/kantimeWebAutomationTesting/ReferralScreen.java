package kantimeWebAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReferralScreen extends kthomehealth
{
	static String uniqueName;
	
	public void referral() throws InterruptedException
	{
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//td[@class='MainMenuItemStyleOuter_Training'][1]")).click();
		driver.findElement(By.xpath("//td[@id='td_0']")).click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		System.out.println(driver.getTitle());
        
		//Using select methods in selenium
		WebElement loc = driver.findElement(By.xpath("//select[@id='MainContent_drp_Branch']"));
        loc.click();
        Select location = new Select(loc);
        location.selectByVisibleText("AC Atlanta");
        
        WebElement lob = driver.findElement(By.xpath("//select[@id='MainContent_ddl_LOB']"));
        lob.click();
        Select lineofbusinesss = new Select(lob);
        lineofbusinesss.selectByVisibleText("AC L&C");
        Thread.sleep(5000);
        uniqueName = "AutoSel" + System.currentTimeMillis();

        driver.findElement(By.xpath("//input[@id='MainContent_txtFirstname']")).sendKeys(uniqueName);
        driver.findElement(By.xpath("//input[@id='MainContent_txtLastname']")).sendKeys("UsingSel");
        driver.findElement(By.xpath("//input[@id='MainContent_txtDOB']")).sendKeys("08/04/1960");
        Thread.sleep(5000);
        
        WebElement payer = driver.findElement(By.xpath("//select[@id='MainContent_ddlPayer']"));
        payer.click();
        Thread.sleep(5000);
        Select payers = new Select(payer);
        payers.selectByVisibleText("Medicare adult");
        
        driver.findElement(By.xpath("//input[@id='MainContent_btn_checkduplicate']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='MainContent_chkLongTermCare']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='btn_admitasnew']")).click();
        Thread.sleep(5000);
	}

}
