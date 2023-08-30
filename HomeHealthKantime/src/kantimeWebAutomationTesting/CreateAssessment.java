package kantimeWebAutomationTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAssessment extends kthomehealth
{
	static String currentWindow;
	public void soccreation() throws InterruptedException
	{
		driver.findElement(By.xpath("//td[@id='tab_2']")).click();
		Thread.sleep(5000);
		currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		System.out.println("client profile  "+currentWindow);
		//td[@id='tab_2'] -- clicking in assessment tab
		
		driver.findElement(By.xpath("//input[@id='MainContent_btn_AddAsmnt']")).click();
		Thread.sleep(5000);
		//input[@id='MainContent_btn_AddAsmnt']  -- add assessment button
		//opening ine new window
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
			
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='rdbSOC']")).click();
		Thread.sleep(5000);
		//input[@id='rdbSOC'] -- clicking on soc radio button
		
		driver.findElement(By.xpath("//span[@id='lblRequestedSOCInSubDiv']")).click();
		Thread.sleep(5000);
		//span[@id='lblRequestedSOCInSubDiv']  -- clicking on the requested soc date link

		 WebElement oasistype = driver.findElement(By.xpath("//select[@id='ddlServiceDescrption']"));
		        oasistype.click();
		        
		        Thread.sleep(5000);
		        Select oasis = new Select(oasistype);
		        oasis.selectByVisibleText("AC RN Start of Care");
		        Thread.sleep(5000);
				
		 WebElement clinician = driver.findElement(By.xpath("//select[@id='ddlClinician']"));
		        clinician.click();
		        Thread.sleep(5000);
		        Select staff = new Select(clinician);
		        staff.selectByVisibleText("Finlayson, Carolyn (RN)");
		        Thread.sleep(5000);
		        
		 driver.findElement(By.linkText("Check-in")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@id='btnCreateAssessment']")).click();
		 Thread.sleep(5000);
		//input[@id='btnCreateAssessment']
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='btn_Close']")).click();
		
		//String currentWindow1 = driver.getWindowHandle();
		//System.out.println("afterassessmentclose "+currentWindow1);
		driver.switchTo().window(currentWindow);
		
	}

}
