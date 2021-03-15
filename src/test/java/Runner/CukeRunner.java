package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (
		
		plugin = {//"pretty",
				"html:target/built-in-html-report",
				
		},
		tags="@login  ",  
		features = "src/test/resources",
		glue = "Step_Definition",
		strict = true
		//,dryRun = true
		,monochrome =true
				)

public class CukeRunner {
	

}
