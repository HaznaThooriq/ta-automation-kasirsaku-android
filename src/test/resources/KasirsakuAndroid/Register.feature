Feature: Register kasirsaku Apps

  Narrative:
  As a user
  I want to Register at kasirsaku android Apps

  @Register
  Scenario: user register at kasirsaku App happyflow
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user register as kasir saku

  @invalidUsername
  Scenario: user register at kasirsaku App error flow invalid Username
    Given user go to LoginActivity
    When user type username as 'kasirsaku' and password as 'kasir_saku'
    Then user cant register as kasir saku

  @invalidPassword
  Scenario: user register at kasirsaku App error flow invalid Password
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasirsaku'
    Then user cant register as kasir saku

  @zeroUsername
  Scenario: user register at kasirsaku App error flow zero Username
    Given user go to LoginActivity
    When user type username as '' and password as 'kasir_saku'
    Then user cant register as kasir saku

  @zeroPassword
  Scenario: user register at kasirsaku App error flow invalid Password
    GGiven user go to LoginActivity
    When user type username as 'kasirsaku' and password as ''
    Then user cant register as kasir saku

  @zeroUsernameAndPassword
  Scenario: user register at kasirsaku App error flow zero Username and Password
    GGiven user go to LoginActivity
    When user type username as '' and password as ''
    Then user cant register as kasir saku