
  Feature: As a user i want to refer a product to email a friend
    @referproduct
    Scenario: Register user should be able to refer a product to email a friend
      Given user is on register page
      When user enter all register details
      And click on continue
      And click on jewellery page
      And click on vintage style engagement ring
      And click on email a friend button
      And user enter all register details email a friend
      Then user should able to refer a product to email a friend successfully
      @unregisteruser
      Scenario: Unregister user should not be able to refer a product to emaila friend
        Given user is on homepage
        When click on jewellery page
        And click on vintage style engagement ring
        And click on email a friend button as a unregister user
        And user enter all require details as a unregister
        Then user should not able to refer a product to email a friend successfully