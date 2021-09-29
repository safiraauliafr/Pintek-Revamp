Feature: Forgot Password Revamp

  Scenario Outline: User Reset Password Revamp
    Given I navigate to the home page
    When I click forgot password
    When I use email as <email>
    Then I should get email notify

    Examples: 
      | email                          |
      | ptrevamp@yopmail.com           |
      | cvrevamp@yopmail.com           |
      | koperasirevamp@yopmail.com     |
      | yayasanrevamp@yopmail.com      |
      | sekolahrevamp@yopmail.com      |
      | perseoranganrevamp@yopmail.com |
      | lpkrevamp@yopmail.com          |
      | lkprevamp@yopmail.com          |
