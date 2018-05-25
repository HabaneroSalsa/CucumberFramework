package pageObjects;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public void openTestURL() {
		String testURL = System.getProperty("logon.url");
		driver.get(testURL);
	}

}
