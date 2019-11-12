
Feature: Registration of TestMeApp

  Scenario: TestMeApp with valid data
    Given user open borwser And navigate to application url
    When user clicks on signin And click on new user registration
    And user enter userName as "ayutijais" in username field
    And user enter "Ayuti" in fname field
    And user enter "Jais" in lname field
    And user enter "ayutijais" in password field
    And user enter "ayutijais" in confirm password field
    And user select gender
    And user enter "ayuti@xyz" in email field
    And user enter "1111111111" in mobileNumber field
    And user enter "18/03/1997" in DOB field
    And user enter "Pune bhdbhnfjfn" in address field
    And user enter "What is your Birth Place" in securityQuestion field
    And user enter "JTS" in answer field
    Then user click on register button

  