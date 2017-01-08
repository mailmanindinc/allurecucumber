Feature: Verify email subscription module

Scenario: email subscription Happy path

Given I am on shoestore-manheim
When I enter valid e-mail in an area to submit email address and submit  
Then I should get email message  