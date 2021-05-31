package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@activity2_4"
    //tags = "@PromptAlert"
    //tags = "@SmokeTest"
    //tags="@SimpleTest or @ConfirmAlert"
    //tags="@SimpleTest,@ConfirmAlert"
)

public class ActivitiesRunner4 {
    //empty
}

