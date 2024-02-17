package com.TestRunner;

import org.junit.runner.RunWith;

import com.Base.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\RIYA\\Downloads\\ipt training\\Limeroad\\src\\test\\resources\\com\\features\\limeroad.feature", 
glue = "com.StepDef", 
dryRun = false,
plugin = {
		"pretty", "html:Reports/nykaa.html", "json:Reports/nykaa.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class LimeroadRunner extends Baseclass {

}
