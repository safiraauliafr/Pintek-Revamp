Feature: Apply LKP
  I want to use this template for my feature file

  Scenario Outline: Apply LKP Scenario
    Given I navigate to the home page
    When I login using username as <username> and password as <password>
    And user click option Akun Bisnis
    And user choose LKP for Company Entity
    Then I should see the dashboard page

    Examples: 
      | username              | password  |
      | lkprevamp@yopmail.com | P!ntek123 |
