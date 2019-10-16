package NopCommerceProject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags="@register,@referproduct,@unregisteruser,@registercheckout,@guestuser")
public class RunTest {
}
