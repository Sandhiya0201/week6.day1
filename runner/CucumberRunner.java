package runner;
import io.cucumber.testng.CucumberOptions;
import steps.Baseclass;

@CucumberOptions(features = {"src/test/java/features"}, 
				 glue = "steps",
				 monochrome = true,
				 publish = true,
				 tags = "not @regression"
				 )
public class CucumberRunner extends Baseclass{

}
