package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\login.feature",
                 glue={"org\\stepdef","org\\applicationHook"},
                 monochrome=true,
                 dryRun=false,
                 plugin = {"pretty",
         				"html:Report/html_report.html",
        				"json:Report/html_report.json",
        				"junit:Report/html_report.xml"
        		}
	
		)
public class TestRunner {

}
