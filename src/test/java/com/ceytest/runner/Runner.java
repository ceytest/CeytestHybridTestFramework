package com.ceytest.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"com.ceytest.mobile.features"},glue = {"stepDefs"},tags = {"@smoke"})

public class Runner extends AbstractTestNGCucumberTests{

}
