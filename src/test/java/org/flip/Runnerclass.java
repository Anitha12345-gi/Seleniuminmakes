package org.flip;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/flipsam", glue = "org.stepdefinition/Flipkart")
public class Runnerclass {

	}

