Feature: Signin Revamp

  Scenario Outline: User Signin to Pintek Website
    Given I navigate to the home page
    When I login using username as <username> and password as <password>
    Then I should see the dashboard page

    Examples: 
      | username                       | password  |
      | ptrevamp@yopmail.com           | P!ntek123 |
      | cvrevamp@yopmail.com           | P!ntek123 |
      | koperasirevamp@yopmail.com     | P!ntek123 |
      | yayasanrevamp@yopmail.com      | P!ntek123 |
      | sekolahrevamp@yopmail.com      | P!ntek123 |
      | perseoranganrevamp@yopmail.com | P!ntek123 |
      | lpkrevamp@yopmail.com          | P!ntek123 |
      | lkprevamp@yopmail.com          | P!ntek123 |
