Feature: Apply CV
  I want to use this template for my feature file

  Scenario Outline: Apply CV Scenario
    Given I navigate to the home page
    When I login using username as <username> and password as <password>
    And user click option Akun Bisnis
    And user choose CV for Company Entity
    #And user choose LPK
    #And user choose LKP
    And user unregistered as LPK or LKP CV
    Then I should see the dashboard page

    Examples: 
      | username             | password  |
      | cvrevamp@yopmail.com | P!ntek123 |
