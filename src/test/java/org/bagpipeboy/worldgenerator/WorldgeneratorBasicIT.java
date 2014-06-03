package org.bagpipeboy.worldgenerator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", features = "src/test/resources/features", tags = "@basic")
public class WorldgeneratorBasicIT {

}
