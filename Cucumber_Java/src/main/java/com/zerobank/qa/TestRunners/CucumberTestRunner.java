package com.zerobank.qa.TestRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/zerobank/qa/Features",
		glue = {"src/test/java/com/zerobank/qa/TestCode"}
		)
public class CucumberTestRunner {
	

}
