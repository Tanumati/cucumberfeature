package NopCommerceProject;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {
    BrowserSelector browserselector = new BrowserSelector();
    LoadProps loadProps = new LoadProps();

    @BeforeMethod
    public void setup() {
        browserselector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(loadProps.getProperty("url"));
    }

    @AfterMethod
    public void teardown(ITestResult result) {

    //    if (ITestResult.FAILURE == result.getStatus()) {
     //       takeScreenshot(result.getName());
     //   }
        driver.quit();
    }
}
