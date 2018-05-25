package cucumberDemo;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//-Dwebdriver.chrome.driver=C:\Automation\ChromeDriver\2.38\chromedriver.exe
//-Dlogon.url=http://www.store.demoqa.com
//-Dweb.driver=chrome
//-Dlogon.user = 
//-Dlogon.password = 
//-Dexport.file.location=C:\Automation\SeleniumDownloads

 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		format = {"pretty", "html:target/CukeDemo", "json:target/CukeDemo-report.json"},
		glue={"stepDefinitions"},
		tags = {"@login-test"})


public class LoginTestRunner {

}
