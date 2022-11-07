package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ISAI\\eclipse-workspace\\FlipkartCucumber\\src\\test\\java\\com\\flipkartfeature\\Flipkart.feature"
		,glue = "stepDefinition",dryRun =false,monochrome = true,publish = true,tags ="@GaminLaptops")

public class RunnerClass {

}
