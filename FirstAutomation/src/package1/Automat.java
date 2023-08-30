package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");

	}

}
