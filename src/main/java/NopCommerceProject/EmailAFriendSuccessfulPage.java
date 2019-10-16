package NopCommerceProject;

import org.openqa.selenium.By;

public class EmailAFriendSuccessfulPage extends Utils {

        LoadProps loadProps = new LoadProps();

        private By _successfulmsg = By.xpath("//div[@class=\"result\"]");

        public void UserIsOnEmailaFriendSuccesssfullyPage(){
            assertURL(loadProps.getProperty("emailafrindPageUrl"));
        }
        public void UserGetAMessageSuccessfullyFromEmailaFriendPage(){
            assertMessage(loadProps.getProperty("emailafrindPage"),_successfulmsg);
        }
}
