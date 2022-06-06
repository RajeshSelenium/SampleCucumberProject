package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber; // Ctrl+shift+o
//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "com.stepDefiniton" }, monochrome = true, plugin = {
		"html:Reports\\HtmlRepots\\HtmlReports.html", "json:Reports\\JsonReports\\Cucumber.json",
		"junit:Reports\\JUnitReport\\Cucumber.xml" }, dryRun = false
		)

public class Runner {

}
