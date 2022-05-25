package com.EbaySearch.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "Features",
		glue ="com.EbaySearch.steps"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
