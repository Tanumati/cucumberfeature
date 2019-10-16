


  Feature: As a user i want to checkout a product
    @registercheckout
    Scenario: Register user should be able to checkout a product successfully
      Given user is on homepage
      When user is on register page
      And user enter all register details
      And click on continue
      And click on jewellery page
      And click on vintage style engagement ring
      And click on shopping cart
      And click on checkout button
      And enter checkout details
      Then register user should be able to checkout a product successfully

      @guestuser
      Scenario: Guest user should be able to checkout a product successfully
        Given user is on homepage
        When click on jewellery page
        And click on vintage style engagement ring
        And click on shopping cart
        And click on checkout button
        And enter checkout details as a guest
        Then guest user should be able to checkout a product successfully
