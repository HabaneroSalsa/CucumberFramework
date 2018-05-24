package cucumberDemo;

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	 
	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "Features",
		format = {"pretty", "html:target/CukeDemo", "json:target/CukeDemo-report.json"},
		glue={"stepDefinitions"},
		tags = {"@demo"})

	public class CukeDemoRunner {
		
	}
