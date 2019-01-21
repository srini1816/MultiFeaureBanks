Feature: Multi Bank
  Scenario Outline: : Open Multi Windows
    Given I am a chrome user
    When  I access "<BankName>" Website
    Then I can see "<BankWebsite>" homePage


    Examples:
    |BankName|BankWebsite|
    |https://www.santender.com/|Santender|
    |https://www.barclays.co.uk/|Barclays|
    |https://www.lloydsbank.com/|lloyds|
    |https://www.ebay.co.uk/    |ebay  |