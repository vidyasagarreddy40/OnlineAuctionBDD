package Test.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue="",
plugin= {"html:target/cucumber","json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		"junit:target/cucumber-results.xml"}, tags= {"@SmokeTesting"})
public class Runner {

}
