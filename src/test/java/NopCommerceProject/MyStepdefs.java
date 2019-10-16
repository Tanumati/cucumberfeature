package NopCommerceProject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.gl.E;

public class MyStepdefs {

    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    Registrationresultpage registrationresultpage = new Registrationresultpage();
    Jwellerypage jwellerypage = new Jwellerypage();
    EngagementRingPage engagementRingPage = new EngagementRingPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendSuccessfulPage emailAFriendSuccessfulPage = new EmailAFriendSuccessfulPage();
    ShoppingcartPage shoppingcartPage = new ShoppingcartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    Orderconfirmationpage orderconfirmationpage = new Orderconfirmationpage();
    GuestCheckoutPage guestCheckoutPage = new GuestCheckoutPage();

    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        homepage.ClickOnRegisterButton();
    }

    @When("^user enter all register details$")
    public void userEnterAllRegisterDetails() {
        registrationPage.userEnterRegistrationDetails();
    }

    @Then("^user should be able to register successfully$")
    public void userShouldBeAbleToRegisterSuccessfully() {
        registrationresultpage.verifyUserGetSuccessfullyRegisterMessage();
    }

    @Given("^user is on register page$")
    public void userIsOnRegisterPage() {
        homepage.ClickOnRegisterButton();
    }
    @And("^click on continue$")
    public void clickOnContinue() {
        registrationresultpage.clickOnContinuebutton();
    }
    @And("^click on jewellery page$")
    public void clickOnJewelleryPage() {
        homepage.Clickonjwelerybutton();
    }
    @And("^click on vintage style engagement ring$")
    public void clickOnVintageStyleEngagementRing() {
        jwellerypage.clickOnVintageStyleEngagementRing();
    }
    @And("^click on email a friend button$")
    public void clickOnEmailAFriendButton() {
        engagementRingPage.ClickOnEmailaFriend();
    }
    @And("^user enter all register details email a friend$")
    public void userEnterAllRegisterDetailsEmailAFriend() {
        emailAFriend.userEnteraDetailsOnEmailaFriendpage();
    }
    @Then("^user should able to refer a product to email a friend successfully$")
    public void userShouldAbleToReferAProductToEmailAFriendSuccessfully() {
        emailAFriendSuccessfulPage.UserIsOnEmailaFriendSuccesssfullyPage();
        emailAFriendSuccessfulPage.UserGetAMessageSuccessfullyFromEmailaFriendPage();
    }


    @And("^click on email a friend button as a unregister user$")
    public void clickOnEmailAFriendButtonAsAUnregisterUser() {
        engagementRingPage.ClickOnEmailaFriend();

    }

    @And("^user enter all require details as a unregister$")
    public void userEnterAllRequireDetailsAsAUnregister() {
        emailAFriend.unRegisteruserEnterDetailsOnEmailAFriendpage();

    }

    @Then("^user should not able to refer a product to email a friend successfully$")
    public void userShouldNotAbleToReferAProductToEmailAFriendSuccessfully() {
        emailAFriend.verifyUnsuccessfulMessage();

    }

    @And("^click on shopping cart$")
    public void clickOnShoppingCart() {
        engagementRingPage.ClickshoppingDetails();

    }

    @And("^click on checkout button$")
    public void clickOnCheckoutButton() {
        shoppingcartPage.ClickOnCheckoutbutton();

    }

    @And("^enter checkout details$")
    public void enterCheckoutDetails() {
        checkoutPage.UserShouldCheckoutDetailsSuccessfully();

    }

    @Then("^register user should be able to checkout a product successfully$")
    public void registerUserShouldBeAbleToCheckoutAProductSuccessfully() {
        orderconfirmationpage.verifyUserIsOnconfirmationPage();
        orderconfirmationpage.VerifySuccessfulmessage();


    }

    @And("^enter checkout details as a guest$")
    public void enterCheckoutDetailsAsAGuest() {
        guestCheckoutPage.ClickOnGuestAsACheckOut();
        checkoutPage.AsGuestUserEnterCheckoutDetails();
        checkoutPage.UserShouldCheckoutDetailsSuccessfully();

    }

    @Then("^guest user should be able to checkout a product successfully$")
    public void guestUserShouldBeAbleToCheckoutAProductSuccessfully() {
        orderconfirmationpage.VerifySuccessfulmessage();
    }
}