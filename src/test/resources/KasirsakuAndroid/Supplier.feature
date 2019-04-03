Feature: Supplier kasirsaku Apps

  Narrative:
  As a user
  I want to Test Supplier at kasirsaku android Apps

  @CRUDSupplierHappyFlow
  Scenario: user melakukan CRUD Supplier - happyflow
    Given user type username supplier
    When user type nama supplier
    Then user type alamat supplier
    Then user type email supplier
    Then user type telepon supplier
    Then user click button add supplier