
Feature: API Testing

  @Assingment1
  Scenario: Get Method
    Given API for testing get method
    When posted with correct information
    Then validate positive response code received for get method
    
    @Assingment2Post
  Scenario: Post Method
    Given API for testing post method
    When posted with correct information for post method
    Then validate positive response code received for post method
   
  @Assingment3Assertions
  Scenario: Post Method
  Given API for testing Post Method
  When Posted with correct information
  Then Validate positive response code for post method
  
  @Assingment2GetMethod
  Scenario: Assingment2 Get Method 
  Given testing the get method api for assingment2
  When Posted with correct information for get method for assingment2
  Then Validating positive response code for get method for assingment2
  
  
  @Assingment4NegativeScenario
  Scenario: Testing the negative scenario
  Given testing -ve scenario 
  When Posted With correct informantion
  Then validating the response code for negative scenario 
  
  
  @Assingment5NegativeScenario
  Scenario: Testing the negative scenario with two assertions
  Given testing -ve scenario for assertions
  When Posted With incorrect information
  Then validating the response code for negative scenario for assertions