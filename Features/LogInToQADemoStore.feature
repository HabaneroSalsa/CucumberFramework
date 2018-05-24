@demo
Feature: Cuke Demo
	Log in to the QA demo store site and take a screenshot

@login-test
Scenario: Log in to the QA Demo store
Given the browser is at the Online Store page
 When the user logs into site
 Then a screenshot is saved to the report

