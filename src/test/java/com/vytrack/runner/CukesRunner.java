package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
/*
 providing option for cucumber to provide
 * where is your feature file     |  features = "feature file folder path here"
 * where is the code that match the steps in cucumber  | glue = " step definitions folder path here"
 * whether to run the actual code or just to check if you have missing steps  | dryRun = true/false
 * what kind of report you want to get and other options | plugins = ....
 * which scenarios or features you want to run | tags = "@something and @somethingelse not @blabla
 */

@CucumberOptions(features = "src/test/resources/features" ,  // tell location of future file
        glue = "com/vytrack/step_definitions", // tell where the code is
        dryRun = false ,   // check if we have missing steps or not
        plugin = {"json:target/cucumber.json" ,
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"
        } ,
        tags = "@wip4"  //@calculator"   // "@login"  // which feature you want to run
)
public class CukesRunner {

}
