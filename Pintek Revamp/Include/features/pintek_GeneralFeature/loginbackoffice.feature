Feature: Pintek Login Backoffice

  Scenario Outline: User Login to Backoffice Pintek Website
    Given I navigate to the backoffice home page
    When I login use username as <username> and password as <password>
    Then I should see the backoffice dashboard page

    Examples: 
      | username                 | password       |
      | vjulianti@yopmail.com    | virass123      |
      | vira-cra@yopmail.com     | viracra123     |
      | vira-crm@yopmail.com     | viracrm123     |
      | vira-scrm@yopmail.com    | virascrm123    |
      | vira-cc@yopmail.com      | viracc123      |
      | vira-finops@yopmail.com  | virafinops123  |
      | vira-finopsm@yopmail.com | virafinopsm123 |
      | vira-vp-risk@yopmail.com | viravprisk123  |
