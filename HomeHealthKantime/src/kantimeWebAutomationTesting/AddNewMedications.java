package kantimeWebAutomationTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddNewMedications extends kthomehealth
{
	public void addmedications() throws InterruptedException
	{

		
		driver.findElement(By.xpath("//td[@id='tab_8']")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='MainContent_btn_AddMedication']")).click();
		Thread.sleep(15000);
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement elmt = driver.findElement(By.xpath("//input[@id='txt_Medication']"));
		Actions act = new Actions(driver);
		//driver.findElement(By.xpath()).sendKeys("aspirin");
		elmt.sendKeys("Aspirin 162.5 mg oral capsule, extended release");
		//act.keyDown().click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='txt_Dosage']")).sendKeys("dosage1");
		driver.findElement(By.xpath("//input[@id='txtAutoRouteFill']")).sendKeys("route1");
		driver.findElement(By.xpath("//input[@id='txt_FrequencyAutoFill']")).sendKeys("frequency1");
		driver.findElement(By.xpath("//input[@id='txt_Purpose']")).sendKeys("purpose");
		driver.findElement(By.xpath("//label[@class='check_label d-inline'][1]")).click();
		driver.findElement(By.xpath("//input[@id='btn_SaveNClose']")).click();
		Thread.sleep(5000);
		
		elmt.sendKeys("Vabomere 2 g intravenous injection");
		//act.keyDown().click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='txt_Dosage']")).sendKeys("dosage1");
		driver.findElement(By.xpath("//input[@id='txtAutoRouteFill']")).sendKeys("route1");
		driver.findElement(By.xpath("//input[@id='txt_FrequencyAutoFill']")).sendKeys("frequency1");
		driver.findElement(By.xpath("//input[@id='txt_Purpose']")).sendKeys("purpose");
		driver.findElement(By.xpath("//label[@class='check_label d-inline'][1]")).click();
		driver.findElement(By.xpath("//input[@id='btn_SaveNClose']")).click();
		Thread.sleep(5000);
		
		elmt.sendKeys("Albuterol 0.63 mg/3 mL (0.021%) inhalation solution");
		//act.keyDown().click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='txt_Dosage']")).sendKeys("dosage1");
		driver.findElement(By.xpath("//input[@id='txtAutoRouteFill']")).sendKeys("route1");
		driver.findElement(By.xpath("//input[@id='txt_FrequencyAutoFill']")).sendKeys("frequency1");
		driver.findElement(By.xpath("//input[@id='txt_Purpose']")).sendKeys("purpose");
		driver.findElement(By.xpath("//label[@class='check_label d-inline'][1]")).click();
		driver.findElement(By.xpath("//input[@id='btn_SaveNClose']")).click();
		Thread.sleep(5000);
		
		elmt.sendKeys("Acetaminophen 10 mg/mL intravenous solution");
		//act.keyDown().click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='txt_Dosage']")).sendKeys("dosage1");
		driver.findElement(By.xpath("//input[@id='txtAutoRouteFill']")).sendKeys("route1");
		driver.findElement(By.xpath("//input[@id='txt_FrequencyAutoFill']")).sendKeys("frequency1");
		driver.findElement(By.xpath("//input[@id='txt_Purpose']")).sendKeys("purpose");
		driver.findElement(By.xpath("//label[@class='check_label d-inline'][1]")).click();
		driver.findElement(By.xpath("//input[@id='btn_SaveNClose']")).click();
		Thread.sleep(5000);
		
		elmt.sendKeys("Sildenafil 10 mg/12.5 mL intravenous solution");
		//act.keyDown().click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='txt_Dosage']")).sendKeys("dosage1");
		driver.findElement(By.xpath("//input[@id='txtAutoRouteFill']")).sendKeys("route1");
		driver.findElement(By.xpath("//input[@id='txt_FrequencyAutoFill']")).sendKeys("frequency1");
		driver.findElement(By.xpath("//input[@id='txt_Purpose']")).sendKeys("purpose");
		driver.findElement(By.xpath("//label[@class='check_label d-inline'][1]")).click();
		driver.findElement(By.xpath("//input[@id='btn_SaveNClose']")).click();
		Thread.sleep(5000);
		
		elmt.sendKeys("B Complex 50 oral tablet, extended release");
		//act.keyDown().click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='txt_Dosage']")).sendKeys("dosage1");
		driver.findElement(By.xpath("//input[@id='txtAutoRouteFill']")).sendKeys("route1");
		driver.findElement(By.xpath("//input[@id='txt_FrequencyAutoFill']")).sendKeys("frequency1");
		driver.findElement(By.xpath("//input[@id='txt_Purpose']")).sendKeys("purpose");
		driver.findElement(By.xpath("//label[@class='check_label d-inline'][1]")).click();
		driver.findElement(By.xpath("//input[@id='btn_SaveNClose']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='btn_Close']")).click();
		Thread.sleep(4000);
		
		
	}

}
//String[] array1 = {"Aspirin","Albuterol","Acetaminophen","Sildenafil","B Complex"};
//String[] array2 = {"Aspirin 162.5 mg oral capsule, extended release","Albuterol 0.63 mg/3 mL (0.021%) inhalation solution","Acetaminophen 10 mg/mL intravenous solution","Sildenafil 10 mg/12.5 mL intravenous solution","B Complex 50 oral tablet, extended release"};
//
//for(int i = 0;i<array.length;i++)
//{
//	elmt.sendKeys(array1[i]);
//	
//	for(int j=i;j<array2.length.j++)
//	{
//		act.keyDown(array2[j]).click().build().perform();
//		break;
//	
//
//	}
//	
//}


