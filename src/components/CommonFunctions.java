package components;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import cucumber.api.Scenario;

public class CommonFunctions { 
private TestVariables testVars;
private TestConstants consts;

	public void logDurationToCucumberReport(Scenario scenario) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
		LocalDateTime testStartTime = LocalDateTime.parse(testVars.get(consts.KEY_TEST_START_TIME), formatter);
		testVars.set(consts.KEY_TEST_END_TIME, LocalDateTime.parse(LocalDateTime.now().toString(), formatter).toString());
		LocalDateTime testEndTime = LocalDateTime.parse(testVars.get(consts.KEY_TEST_END_TIME), formatter);
		scenario.write("Test Start: " + testVars.get(consts.KEY_TEST_START_TIME));
		scenario.write("Test End: " + testVars.get(consts.KEY_TEST_END_TIME));		
		Duration testDuration = Duration.between(testStartTime, testEndTime);
		scenario.write("TEST RUN DURATION: " + testDuration.getSeconds() + " seconds");
	}
}
