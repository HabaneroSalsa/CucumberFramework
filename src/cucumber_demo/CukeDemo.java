package cucumber_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CukeDemo {

	public static void main (String[] args) {
		String exePath = "C:\\Automation\\ChromeDriver\\2.38\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = null;
		driver = new ChromeDriver();		
		driver.get("http://www.store.demoqa.com");
				 
        // Find the element that's ID attribute is 'account'(My Account)  
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
        // Find the element that's ID attribute is 'log' (Username) 
        // Enter Username on the element found by above desc.
        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
        // Enter Password on the element found by the above desc.
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
        // Now submit the form. WebDriver will find the form for us from the element 
        driver.findElement(By.id("login")).click();
 
        // Close the driver
        driver.quit();
	}

}