Feature: Apply Koperasi
  I want to use this template for my feature file

  Scenario Outline: Apply Koperasi Scenario
    Given I navigate to the home page
    When I login using username as <username> and password as <password>
    And user click option Akun Bisnis
    And user choose Koperasi for Company Entity
    #And user choose LPK
    #And user choose LKP
    And user unregistered as LPK or LKP Koperasi
    Then I should see the dashboard page

    Examples: 
      | username                   | password  |
      | koperasirevamp@yopmail.com | P!ntek123 |
