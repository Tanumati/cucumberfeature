package NopCommerceProject;

import org.openqa.selenium.By;

public class Registrationresultpage extends Utils{
    LoadProps loadProps = new LoadProps();


    private By _registersuccesfullmessage = By.xpath("//div[@class=\"result\"]");
    private By _continue = By.xpath("//input[@value=\"Continue\"]");

    public void verifyuserIsonRegisterresultpage(){
        WaitForElementsvisible(_registersuccesfullmessage,5);
        assertURL(loadProps.getProperty("RegistrationresulpageURl"));
    }
    public void verifyUserGetSuccessfullyRegisterMessage(){
        assertMessage(loadProps.getProperty("successfulmessage"),By.xpath("//div[@class=\"result\"]"));
    }
    public void clickOnContinuebutton ()
    { ClickElement(_continue);
    }
}
