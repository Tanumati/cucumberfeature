package NopCommerceProject;

import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserselector = new BrowserSelector();
    LoadProps loadProps = new LoadProps();


    @Before
    public void setup() {
        browserselector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(loadProps.getProperty("url"));
    }


}
