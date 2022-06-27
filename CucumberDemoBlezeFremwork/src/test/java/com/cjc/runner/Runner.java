package com.cjc.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features = {"src\\test\\resources\\Feature"},
glue = {"com.cjc.step"},
						tags = "@login or @productSelect or @purchaseProduct" , monochrome = true)
	public class Runner {

	}

