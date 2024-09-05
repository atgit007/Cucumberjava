package StepDefnitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepDefnitions"},
       monochrome = true,
       //plugin = {"pretty","html:target/Reports/report.html"}
       plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
        tags = "@smoketest"
       // plugin = { "pretty", "junit:target/JunitReports/report.xml" }
        //plugin = { "pretty", "html:target/cucumber-reports/" }
)
public class TestRunner {
}
