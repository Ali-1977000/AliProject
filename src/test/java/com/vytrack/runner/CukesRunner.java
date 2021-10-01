package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

              features = "src/test/resources/features",  // tell location of the feature file

               glue = "com/vytrack/step_definitions",   //tell where the code is
               dryRun = false  // check if we have missing steps or not

)

public class CukesRunner {

}
