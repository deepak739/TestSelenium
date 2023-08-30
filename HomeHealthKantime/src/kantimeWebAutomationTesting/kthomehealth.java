package kantimeWebAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class kthomehealth {
	
	static String workingUrl;
	static ChromeDriver driver;
	static ChromeOptions options;
	
	
 
	public static void main(String[] args) throws InterruptedException
	{

		workingUrl = "http://192.168.4.74/WorkingZadmin/UI/Common/Access_LogIn.aspx?Reference=0";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepakkumar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		
		options = new ChromeOptions();
		driver = new ChromeDriver();
		options.setBinary("C:\\Users\\Deepakkumar\\Downloads\\chrome-win64\\chrome.exe");
		
		loginToWorkingSite login = new loginToWorkingSite();
		login.workinglogin();
		
		loginToAgency hhalogin = new loginToAgency();
		hhalogin.agencylogin();
		
		ReferralScreen ref = new ReferralScreen();
		ref.referral();
		
		MainIntakePage clientdetails = new MainIntakePage();
		clientdetails.intakemainpage();
		
		IntakePayerSourceAndEligibilty payer = new IntakePayerSourceAndEligibilty();
		payer.intakepayersource();
		
		SaveAndAcceptTheClient clientaccept = new SaveAndAcceptTheClient();
		clientaccept.acceptcClient();
		
		Thread.sleep(5000);
		CreateAssessment assessments = new CreateAssessment();
		assessments.soccreation();
		Thread.sleep(5000);
		
		AddNewMedications addmed = new AddNewMedications();
		addmed.addmedications();

	}

}
